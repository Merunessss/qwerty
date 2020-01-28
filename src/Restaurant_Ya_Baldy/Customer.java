package Restaurant_Ya_Baldy;

import com.company.magicInterface.Animals.LocalDate;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Customer {

    String telNumber;
    String name;
    int iD = -1;

    public Customer(String name, String telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public Customer() {
    }

    public void setiD(int iD) {
        if (this.iD != -1) {
            System.out.println("ID unmodified !!! Sorry");
            return;
        }
        this.iD = iD;
    }

    public static void main(String[] args) {

        Restaurant rest = new Restaurant("NewYork", 5, 8, 24);
        Customer masha = new Customer();

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the table # please ");
//
//        int numTable = scanner.nextInt();
//
//        System.out.println("NA KOGDA HOTITE dd/mm/yyyy/hh/mm ");
//
//        String dataBook = scanner.next();
//
//        int year = Integer.valueOf(dataBook.substring(6, 10));
//
//        int month = Integer.valueOf(dataBook.substring(3, 5));
//
//        int day = Integer.valueOf(dataBook.substring(0, 2));
//
//        int hour = Integer.valueOf(dataBook.substring(11, 13));
//
//        int minute = Integer.valueOf(dataBook.substring(14, 16));
//
//
//        LocalDateTime bookingTime = LocalDateTime.of(year, month, day, hour, minute);
//
//        System.out.println(" SKOLKO NADO VREMYA ");
//
//        int durationBook = scanner.nextInt();
//
//        masha.bookTable(rest, numTable, bookingTime, durationBook);

        // masha.checkMenu(rest);


        masha.placeOrder( rest);
        masha.placeOrder( rest);
        System.out.println(rest.orders.toString());


    }


    void checkTables(Restaurant restor, LocalDateTime checkTime, int timeToSpend) {


        LocalDateTime finishRezerv = checkTime.plusHours(timeToSpend);

        for (Table table : restor.tables) {
            if (table.ifTableAvailable(checkTime, finishRezerv)) {
                System.out.println("VSE NORM KAVALER STOLIK " + table.tableNumber + " SVOBODEN");
            } else {
                System.out.println("STOLIK # " + table.tableNumber + " ZANYAT");
            }
        }
    }


    boolean bookTable(Restaurant restor, int tableNum, LocalDateTime bookTime, int bookDuration) {

        boolean result = false;

        LocalDateTime finishRezerv = bookTime.plusHours(bookDuration);
        for (Table temp : restor.tables) {
            if (temp.tableNumber == tableNum) {
                if (temp.ifTableAvailable(bookTime, finishRezerv) == true) {
                    temp.mapTable.put(bookTime, finishRezerv);
                    result = true;
                }
            }

        }

        return result;
    }

    void checkMenu(Restaurant restor) {
        int index = 1;
        for (Dish temp : restor.eDish) {
            System.out.println(index++ + ". " + temp);
        }

    }

    Order placeOrder(Restaurant restaurant) {
        checkMenu(restaurant);
        System.out.println(" DELAI ZAKAZ ");
        boolean flag = true;
        Map<Dish, Map<Integer, Boolean>> zakaz = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (flag == true) {
            System.out.println("Vedite # bluda i skolko porciy ");
            String bludoSkolko = scanner.nextLine();
            //System.out.println(bludoSkolko);
            String[] array = bludoSkolko.split("[ ]+");
            // System.out.println(Arrays.toString(array));
            if (array[0].trim().equals("exit")) {
                break;
            }
            HashMap<Integer, Boolean> countBlud = new HashMap<>();

            countBlud.put(Integer.valueOf(array[1].trim()), false);
            zakaz.put(restaurant.dishManager.find(Integer.valueOf(array[0].trim())), countBlud);
        }
        Order order = new Order(restaurant.orders.size() + 1);
        order.foodSum.putAll(zakaz);

        restaurant.orders.add(order);

        return order;
    }

    boolean addExtraDishToOrder(Restaurant restor, Dish bludo, int orderNum1) {

        boolean result = false;

        for (Order temp : restor.orders) {
            if (temp.orderNum == orderNum1) {
                result = true;
                if (temp.foodSum.get(bludo) == null) {
                    Map<Integer, Boolean> dodatok = new TreeMap<>();
                    dodatok.put(1, false);
                    temp.foodSum.put(bludo, dodatok);
                } else {
                    Map<Integer, Boolean> counter = temp.foodSum.get(bludo);
                    int countBorsh = 0;
                    for (Map.Entry<Integer, Boolean> qwe : counter.entrySet()) {
                        countBorsh = qwe.getKey();
                    }
                    counter.remove(countBorsh);
                    counter.put(countBorsh + 1, false);

                }
            }
        }

        return result;
    }

    boolean deleteDish(Restaurant rest, Dish bludo, int orderNumOne, int countDel) {

        boolean result = false;

        for (Order temp : rest.orders) {
            if (temp.orderNum == orderNumOne) {
                Map<Integer, Boolean> tempBludo = temp.foodSum.get(bludo);
                int quantityBludo = 0;
                for (Map.Entry<Integer, Boolean> qwe : tempBludo.entrySet()) {
                    quantityBludo = qwe.getKey();
                }
                tempBludo.remove(quantityBludo);
                tempBludo.put(quantityBludo - countDel, false);
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "telNumber='" + telNumber + '\'' +
                ", name='" + name + '\'' +
                ", iD=" + iD +
                '}';
    }


}

