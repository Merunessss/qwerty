package com.company;

//import com.company.magicInterface.Animals.LocalDate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateFun {

    public static void main(String[] args) {

//        LocalDate dateOne = LocalDate.now();
//        LocalDateTime dateTwo = LocalDateTime.of(2018, 11, 5, 5, 5, 5);//#aa34
//        LocalDateTime dateTree = LocalDateTime.of(2019, 11, 25, 0, 0, 0);
//
//        Duration duration = Duration.between(dateTwo, dateTree);
//
//
//        System.out.println(duration.toDays());

        LocalDate dateFour = LocalDate.of(2020, 11, 25);

        DateFun dat = new DateFun();

       // dat.howLongTillTheDay(dateFour);



        dat.convertDate("23.12.2021");


    }

    Duration howLongTillTheDay(LocalDate entryDate) {


        Duration duration = Duration.between(LocalDate.now(), entryDate);
        //System.out.println(duration.negated().toDays());

        // System.out.println(duration.toDays());
        return duration;
    }

    int convertDate(String entryDate) {

        String[] arrStr = entryDate.split("\\.");

        LocalDate date34 = LocalDate.of(Integer.valueOf(arrStr[2]), Integer.valueOf(arrStr[1]), Integer.valueOf(arrStr[0]));
        System.out.println(date34);
        LocalDate today = LocalDate.now();

        LocalDate temp = LocalDate.now();

        int counter = 0;

        while (temp.isBefore(date34)) {

            temp = temp.plusDays(1);

            counter++;

        }

        System.out.println(counter);
        return counter;
    }


}
