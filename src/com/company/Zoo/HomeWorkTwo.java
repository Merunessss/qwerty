package com.company.Zoo;

import java.time.LocalDateTime;
import java.util.*;

public class HomeWorkTwo {

    static HashMap<String, String> codes = new HashMap<String, String>();

    static {
        codes.put("512", "Nikolaev");
        codes.put("123", "New-York");
        codes.put("666", "Hell City");
        codes.put("777", "Jack Pot City");
    }


    public static void main(String[] args) {

        HomeWorkTwo twoWork = new HomeWorkTwo();


        twoWork.checkCityCode();


    }


    void checkCityCode() {

       // int counterOk = 0;

        do {
            System.out.println("Enter the number please");
            Scanner scn = new Scanner(System.in);
            String enterTheCode = scn.nextLine();

            if (enterTheCode.matches("(0)\\-([0-9]{3})\\-[0-9]{2}\\-[0-9]{2}\\-[0-9]{2}")) {

                String res = codes.get(enterTheCode.substring(2, 5));

                if (res == null) {
                    newCity(enterTheCode.substring(2, 5));
                } else {
                    System.out.println("this code belongs to " + res);
                    //counterOk++;
                    break;
                }
            } else {
                System.out.println("Invalid code, please try again");
               //counterOk--;
            }
        } while (true);
    }

    void newCity(String newCode) {

        System.out.println("New city code is " + newCode);
        System.out.println("Enter the NEW city name");

        Scanner scn = new Scanner(System.in);

        String newCityName = scn.nextLine();

        codes.put(newCode, newCityName);
    }


}
