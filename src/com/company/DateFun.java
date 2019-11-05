package com.company;
import java.time.Duration;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateFun {

    public static void main(String[] args) {

        LocalDate dateOne = LocalDate.now();
        LocalDateTime dateTwo = LocalDateTime.of(2018, 11, 5,5,5,5);//#aa34
        LocalDateTime dateTree = LocalDateTime.of(2019,11, 25, 0,0,0);

        Duration duration = Duration.between(dateTwo, dateTree);


        System.out.println(duration.toDays());


    }



}
