package Restaurant_Ya_Baldy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Table {

    int tableNumber;
    Map<LocalDateTime, LocalDateTime> mapTable=new TreeMap<>();


    public Table(int tableNum) {
        this.tableNumber = tableNum;
    }

    boolean ifTableAvailable( LocalDateTime startSecond, LocalDateTime endSecond) {
        boolean result = false;


        LocalDateTime startFirst;
        LocalDateTime endFirst;

        for (Map.Entry<LocalDateTime, LocalDateTime> temp : mapTable.entrySet()) {
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

