package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class HomeWork {
    String word;

    public static void main(String[] args) {


        String slovo = "Obratno";

        char[] bukvi = slovo.toCharArray();

        for(int i = bukvi.length - 1; i >= 0; i-- ){
            System.out.print(bukvi[i] + " ");
        }




        //

        Scanner scn1 = new Scanner(System.in);
        System.out.println("Enter a sentence ");

        String sentence = scn1.nextLine();

        String[] arrSr = sentence.split(" ");

        for (int i = 0; i < arrSr.length; i++) {
            System.out.println(arrSr[i] + " ");
        }

        // 17.09.2019 upper part

//        Month mon1 = Month.Березень;
//        switch (mon1) {
//            case Березень: {
//
//            }
//            case Лютий: {
//
//            }
//
//
//        }
//
//        Human hum1 = new Human(23, "petrov");
//        Human hum2 = new Human(25, "Sidirov");
//
//        System.out.println(Human.count + " PRIVET");


//        LocalDate date;
//        LocalDateTime qwe;
//        HomeWork work = new HomeWork();
//        com.company.Human hum = new Human(12, "wedw");
//        Main work1 = new Main();
//
//        int[] arr = new int[]{1, 3, 4, 5, 6, 7, 8};
//
//
//        for (int temp : arr) {
//            System.out.println(temp);
//            temp = temp - 1;// Error`

        //Novoe1

        HomeWork homeW = new HomeWork();


////
        //   String stringHome = "hello people";

//        homeW.reverseOne(stringHome);

        //2var

        //   StringBuffer stBuffer = new StringBuffer("Merry Christmas ");

//        stBuffer.reverse();

        // System.out.println(stBuffer);


        //Novoe2

//        System.out.println("Enter a sentence");

//        Scanner scn1 = new Scanner(System.in);
//        Scanner scn2 = new Scanner(System.in);
//        String stringHome2 = scn2.nextLine();
//        System.out.println("Enter the word");
//        String theWord = scn1.nextLine();

//        homeW.howManyTimesW(stringHome2, theWord);
//

        //Novoe3

//        homeW.Sum2(3.86);
//
//        homeW.change("город");


//        char[] arrHome = stringHome.toCharArray();
//
//        for(int i = arrHome.length-1; i >=0; i--){
//            System.out.print(arrHome[i]);
//        }
//
//        homeW.countLetter("барааас");


        //homeW.metod("Babesabes");

        //   int[] arrCheck = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //deleteLastInt(arrCheck);

        //  insert(arrCheck, 21);


//
//

    }

    String reverseOne(String str) {
        String result = "";

        char[] arrHome = str.toCharArray();

        for (int i = arrHome.length - 1; i >= 0; i--) {
            System.out.print(arrHome[i]);
            //result+=arrHome[i];

        }

        return result;
    }

    // Novoe 2

    int howManyTimesW(String sentence, String word) {
        int result = 0;

        String[] arrSentence = sentence.split(" ");
        for (int i = 0; i < arrSentence.length; i++) {
//            if (arrSentence[i].equalsIgnoreCase(word)) {
//                result++;
//            }
            result = arrSentence[i].equalsIgnoreCase(word) ? result++ : result;
        }
        System.out.println("The word " + word + " Repeats " + result + " times ");
        return result;
    }

    //Novoe3

    int Sum(double number) {
        int result = 0;

        String digits = String.valueOf(number);
        char[] arrDigits = digits.toCharArray();

        for (int i = 0; i < arrDigits.length; i++) {
//            if (arrDigits[i] == '.') {
//                continue;
//            } else {
//                result += Integer.valueOf(String.valueOf(arrDigits[i]));
//            }
            //result =


        }
        System.out.println(result);
        int k = 3;
        Integer.valueOf("23");
        String qw = k > 1 ? String.valueOf('s') : String.valueOf(5);
        return result;

    }


    int Sum2(double number) {
        int result = 0;

        String digits = String.valueOf(number);

        String[] arrDigits = digits.split("");


        for (int i = 0; i < arrDigits.length; i++) {
            if (arrDigits[i].equals(".")) {
                continue;
            } else {
                result += Integer.valueOf(arrDigits[i]);
            }
        }

        System.out.println(result);

        return result;
    }

    //Novoe4


    String change(String surname) {
        StringBuffer result = new StringBuffer("");
        new Main().two();
        Main.for1();

        String[][] source = {{"й", "hi"}, {"г", "g"}, {"д", "d"}, {"о", "o"}, {"р", "r"}};
        String[] arrSurname = surname.split("");


        for (int i = 0; i < arrSurname.length; i++) {

            switch (arrSurname[i]) {
                case "we": {
                    result.append("hi");
                    break;
                }
                case "г": {
                    result.append("g");
                    break;
                }

            }
            for (int j = 0; j < source.length; j++) {
                if (source[j][0].equals(arrSurname[i])) {
                    //  result = result + source[j][1];
                    result.append(source[j][1]);
                }
            }
        }

        System.out.println(result);
        return result.toString();
    }


    //novoe5

    //nevihodit
    void metod(String word) {
        char[] unic = convert(word);
        for (char temp : unic) {
            calculateLetter(word, temp);

        }

    }

    int calculateLetter(String word, char temp) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(temp))) {

                count++;
            }

        }
        System.out.println("letter " + temp + " repeats " + count + " times ");
        return count;
    }

    private char[] convert(String word) {

        char[] arr = word.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (char temp : arr) {
            if (sb.toString().contains(String.valueOf(temp).toLowerCase()) ||
                    sb.toString().contains(String.valueOf(temp).toUpperCase())) {

            } else {
                sb.append(temp);
            }
        }


        return sb.toString().toCharArray();
    }


    void countLetter(String country) {

        String alphabet = "цукенгшщзхъэждлорпавыфячсмитьбю";
        char[] arrCountry = country.toCharArray();

        for (int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);
            int count = 0;
            for (char temp : arrCountry) {
                if (temp == letter) {
                    count++;
                }

            }
            System.out.print(count == 0 ? "" : letter + " - " + count + "\n");


        }


    }

    //novoe6

    static int[] deleteLastInt(int[] arrDel) {

        int result = 0;
//NikitaStack st=new NikitaStack(10);

        int arrNew[] = new int[arrDel.length - 1];

        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = arrDel[i];
            System.out.print(arrNew[i] + " @@@ ");
        }
        return arrNew;
    }

    //novoe7

    static int[] insert(int[] arrChange, int addInt) {
        int[] result = new int[arrChange.length + 1];

        for (int i = 0; i < arrChange.length; i++) {
            result[i] = arrChange[i];

        }

        result[result.length - 1] = addInt;

        for (int temp : result) {
            System.out.print(temp + " ## ");
        }

        return result;
    }


}

/*
Практическое задание 5- метод,
подсчитівает  кол-во букв в строке - пример - Страна - С-1 т-1 р-1 а-2 н-1
 */

/*
Практическое задание 4-
 создайте метод который преобразует любое слово в кириллице в слово на английском суржике.
Петров - Petrov
 */


/*
Практическое задание 3 - создайте метод , подсчитывающий сумму всех цифр числа с плавающей точкой,
которое передается как параметр. Используйте для решения задачи  преобразование  чисел в стринг и обратно
 */


/*
Практическое задание 2- создайте метод , который подсчитывает количество повторений конкретного слова в предложении.
 */

/*
        Практическое задание 1- используя изученные методы сегодня класса Стринг создать метод ,
         который принимает строку и возвращает ее перевернутый вариант- принимает город , возвращает дорог.
         */

enum Month {
    Січень(1), Лютий(2), Березень(3);
    int number;

    Month(int number) {
        this.number = number;
    }
}




