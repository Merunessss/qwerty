package com.company.magicInterface;

public class MagicTwo {

    public static void main(String[] args) {


        MagicTwo mag2 = new MagicTwo();

        Vasya vas2 = new Vas1();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

     Object rul = new Rule1();


     //   mag2.printElemnts(array, rul);

       mag2.printElemnts(array, (Conditions) rul);
        mag2.printElemnts(array, new Conditions() {
            @Override
            public boolean detectCondition(int element) {
                return element>5 &element<9?true:false;
            }
        });


    }

    void printElemnts(int[] arr, Conditions conditions) {
        for (int i = 0; i < arr.length; i++) {
            if (conditions.detectCondition(arr[i])) {
                System.out.print(arr[i] + " # ");
            }
        }

    }



    void printElemnts(int[] arr, Vasya vas) {
        for (int i = 0; i < arr.length; i++) {
            if (vas.check(arr[i])) {
                System.out.print(arr[i] + " ****** ");
            }
        }
    }
}


class Rule1 implements Conditions,Vasya {


    @Override
    public boolean detectCondition(int element) {

        return element % 2 == 0 || element > 5 ? true : false;
    }

    @Override
    public boolean check(float element) {
        return element % 7 == 0 ? true : false;
    }
}


interface Conditions {
    boolean detectCondition(int element);


}


