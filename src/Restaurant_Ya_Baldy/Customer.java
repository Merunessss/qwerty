package Restaurant_Ya_Baldy;

import com.company.magicInterface.Animals.LocalDate;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Customer {

    String name;
    String telNumber;


    public static void main(String[] args) {

        Restaurant rest = new Restaurant("NewYork", 5, 8, 24);
        Customer masha = new Customer();
        masha.bookTable(rest, 1, LocalDateTime.of(2019, 11, 13, 12, 00, 00), 2);

//        LocalDateTime d1 = LocalDateTime.of(2019, 12, 12, 12, 12);
//        LocalDateTime d2 = LocalDateTime.of(2019, 12, 12, 13, 12);
//        System.out.println(ChronoUnit.MINUTES.between(d2, d1));


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
        System.out.println(restor.eDish);
    }

    Order placeOrder(Map<Dish,Map <Integer,Boolean>> allFood, Restaurant restaurant) {

        Order zakaz = new Order(restaurant.orders.size() + 1);

        zakaz.foodSum.putAll(allFood);

        restaurant.orders.add(zakaz);

        return zakaz;
    }

    boolean addExtraDishToOrder(Restaurant restor, Dish bludo, int orderNum1) {

        boolean result = false;

        for (Order temp : restor.orders) {
            if (temp.orderNum == orderNum1) {
                result = true;
                if (temp.foodSum.get(bludo) == null) {
                    Map<Integer,Boolean> dodatok=new TreeMap<>();
                    dodatok.put(1,false);
                    temp.foodSum.put(bludo, dodatok);
                } else {
                    Map<Integer,Boolean> counter= temp.foodSum.get(bludo);
                    int countBorsh=0;
                    for(Map.Entry<Integer,Boolean> qwe:counter.entrySet()){
                        countBorsh=qwe.getKey();
                              }
                    counter.remove(countBorsh);
                    counter.put(countBorsh+1,false);

                }
            }
        }

        return result;
    }

    boolean deleteDish(Restaurant rest, Dish bludo, int orderNumOne, int countDel) {

        boolean result = false;

        for (Order temp : rest.orders) {
            if (temp.orderNum == orderNumOne) {
                int count = temp.foodSum.get(bludo);
                temp.foodSum.put(bludo, count < countDel ? 0 : count - countDel);
                result = true;
            }
        }
        return result;
    }

}

