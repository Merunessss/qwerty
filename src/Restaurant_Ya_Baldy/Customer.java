package Restaurant_Ya_Baldy;

import com.company.magicInterface.Animals.LocalDate;

import java.time.LocalDateTime;
import java.util.List;

public class Customer {

    String name;
    String telNumber;



    public static void main(String[] args) {

        Restaurant rest = new Restaurant("NewYork", 5, 8, 24);
        Customer masha = new Customer();
        masha.bookTable(rest, 5, LocalDateTime.of(2019, 11, 13, 12, 00, 00), 2);


    }


    void checkTables(Restaurant restor, LocalDateTime checkTime, int timeToSpend) {

        LocalDateTime finishRezerv = checkTime.plusHours(timeToSpend);
        for (Table table : restor.tables) {
            for (LocalDateTime dateTemp : table.mapTable.keySet()) {
                if (isFree(checkTime, finishRezerv, dateTemp, table.mapTable.get(dateTemp))) {
                    System.out.println("Table # " + table.tableNumber + " is free ");
                } else {
                    System.out.println("Table # " + table.tableNumber + " is occupied");
                }
            }
        }
    }

    private boolean isFree(LocalDateTime startOne, LocalDateTime finishOne, LocalDateTime startTwo, LocalDateTime finishTwo) {
//startOne.   DODELAT

        return false;
    }

    boolean bookTable(Restaurant restor, int tableNum, LocalDateTime bookTime, int bookDuration) {


        LocalDateTime finishRezerv = bookTime.plusHours(bookDuration);
        for (Table temp : restor.tables) {
            if (temp.tableNumber == tableNum) {
                temp.mapTable.put(bookTime,finishRezerv );
            }
        }

        return false;
    }

    void checkMenu(Restaurant restor) {

    }

    Order placeOrder(Dish eda, Restaurant restaurant) {



        return null;
    }

    boolean addExtraDishToOrder(Dish bludo, int orderNum) {

        return false;
    }

    boolean deleteDish(Dish bludo, int orderNum) {

        return false;
    }

}
