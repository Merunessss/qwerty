package Restaurant_Ya_Baldy;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.function.BiConsumer;

public class Reservation {

    Restaurant restar;

    LocalDate bookDate = LocalDate.now();
    int bookedTableNum;
    Customer name;
    LocalDateTime startBookTime;
    LocalDateTime endBookTime;
    boolean state = true;

    public Reservation(int bookedTableNum, Customer name, LocalDateTime startBookTime,
                       LocalDateTime endBookTime, Restaurant restaurant) throws Exception {
        this.restar = restaurant;
        isTableAvailable(bookedTableNum, startBookTime, endBookTime);
        this.bookedTableNum = bookedTableNum;
        this.name = name;
        this.startBookTime = startBookTime;
        this.endBookTime = endBookTime;

    }

    boolean isTableAvailable(int bookedTableNum, LocalDateTime startBookTime, LocalDateTime endBookTime) throws Exception {
        LocalDateTime start1 = startBookTime.isAfter(endBookTime) ? endBookTime : startBookTime;
        LocalDateTime end1 = start1.equals(startBookTime) ? endBookTime : startBookTime;
       Table reservTable=null;
        for (Table temp: restar.tables ) {

            if(temp.tableNumber == bookedTableNum){
                reservTable = temp;
                break;
            }
        }

        if(reservTable == null){
            System.out.println("Sorry there's no table with this #");
            return false;
        } else {
//            reservTable.mapTable.forEach(new BiConsumer<LocalDateTime, LocalDateTime>() {
//                @Override
//                public void accept(LocalDateTime start, LocalDateTime end) {
//                    LocalDateTime start2 = start.isAfter(end) ? end : start;
//                    LocalDateTime end2 = start2.equals(start) ? end : start;
//
//
//                }
//
//            });
        return true;
        }

    }


}
