

import java.time.LocalDateTime;

import java.time.temporal.ChronoUnit;

import java.util.*;
import java.util.HashMap;

public class ProbaDatePeriod {

    public static void main(String[] args) {

        ProbaDatePeriod proba = new ProbaDatePeriod();

        HashMap<LocalDateTime, LocalDateTime> reservedTables = new HashMap<>();

        LocalDateTime bookOneStart = LocalDateTime.of(2019, 12, 12, 9, 30);
        LocalDateTime bookOneEnd = LocalDateTime.of(2019, 12, 12, 10, 30);

        LocalDateTime startFirst = LocalDateTime.of(2019, 12, 12, 12, 00);
        LocalDateTime endFirst = LocalDateTime.of(2019, 12, 12, 13, 00);

        reservedTables.put(bookOneStart, bookOneEnd);
        reservedTables.put(startFirst, endFirst);

        LocalDateTime startSecond = LocalDateTime.of(2019, 12, 11, 7, 00);

        LocalDateTime endSecond = LocalDateTime.of(2019, 12, 13, 9, 31);

        proba.ifTableAvailable(reservedTables, startSecond, endSecond);


//
//        long durationSecond = ChronoUnit.MINUTES.between(startSecond, endSecond);
//        long durationFirst = ChronoUnit.MINUTES.between(startFirst, endFirst);
//
//
//        if (ChronoUnit.MINUTES.between(startFirst, startSecond) <= -durationSecond | ChronoUnit.MINUTES.between(startFirst, startSecond) >= durationSecond
//                && ChronoUnit.MINUTES.between(endFirst, startSecond) >= 0 | ChronoUnit.MINUTES.between(endFirst, startSecond) <= -durationFirst
//                && ChronoUnit.MINUTES.between(startSecond, endFirst) >= 0 | ChronoUnit.MINUTES.between(startSecond, endFirst) <= -durationFirst) {
//            System.out.println("VSE NORM BRONIRUY");
//        } else {
//            System.out.println("KAVALER SORRY VSE ZANYATO");
//        }


    }

    boolean ifTableAvailable(HashMap<LocalDateTime, LocalDateTime> bookings, LocalDateTime startSecond, LocalDateTime endSecond) {
        boolean result = false;


        LocalDateTime startFirst;
        LocalDateTime endFirst;

        for (Map.Entry<LocalDateTime, LocalDateTime> temp : bookings.entrySet()) {
            startFirst = temp.getKey();
            endFirst = temp.getValue();

            long durationSecond = ChronoUnit.MINUTES.between(startSecond, endSecond);
            long durationFirst = ChronoUnit.MINUTES.between(startFirst, endFirst);

            if (ChronoUnit.MINUTES.between(startFirst, startSecond) <= -durationSecond | ChronoUnit.MINUTES.between(startFirst, startSecond) >= durationSecond
                    && ChronoUnit.MINUTES.between(endFirst, startSecond) >= 0 | ChronoUnit.MINUTES.between(endFirst, startSecond) <= -durationFirst
                    && ChronoUnit.MINUTES.between(startSecond, endFirst) >= 0 | ChronoUnit.MINUTES.between(startSecond, endFirst) <= -durationFirst) {
                //  System.out.println("VSE NORM BRONIRUY");
                result = true;
            } else {
                // System.out.println("KAVALER SORRY VSE ZANYATO");
                result = false;
                break;
            }

        }
        if (result == true) {
            System.out.println("KAVALER VSE NORM");
        } else {
            System.out.println("V DRUGOI RAZ");
        }
        return result;
    }


}




