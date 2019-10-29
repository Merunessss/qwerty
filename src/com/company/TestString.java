package com.company;

import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {


        /* Ввести предложение с клавиатуры. Заменить все вхождения одного слова в предложении другим словом. */
        System.out.println("Enter a sentence");
        Scanner scanner = new Scanner(System.in);


        String string1 = scanner.nextLine();

        System.out.println("enter a word");
        String string2 = scanner.nextLine();

        System.out.println("enter next word");
        String string3 = scanner.nextLine();

        String[] arrStr = string1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals(string2)) {
                arrStr[i] = string3;
            }
            sb.append(arrStr[i] + " ");
        }

        string1 = sb.toString();
        System.out.println(string1);


//     String par="123";
//     String par1 = "123" ;
//        String par2=new String("121212");
//     char qwe1='w';
//     int a=34;
//     int d = 23;
//
//        System.out.println(par == par1);
//        System.out.println(par.equals(par1));
//        StringBuilder sb=new StringBuilder(par);
//
//        while(par.length()>3){
//            par1=par+"123";// Error
//        sb.append("123");
//            System.out.println(par1.hashCode());
//        }
//        sb.toString();
//        int  var=par.equals(par1)?24:10;
//
//        if(par.equals(par1)){
//            var = 24;
//        } else {
//            var = 10;
//        }


    }


}
