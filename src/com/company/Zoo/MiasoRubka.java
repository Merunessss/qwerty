package com.company.Zoo;

import java.util.Arrays;

public class MiasoRubka {

    public static void main(String[] args) {

        Animal lion = new Lions(10, "Fera");
        System.out.println(lion);
       // lion=null;
        System.out.println(lion);
        MiasoRubka bar = new MiasoRubka();

        bar.one(lion);

        System.out.println(lion);
        int[] arr33={1,3,5};
        bar.two(arr33);
        System.out.println(Arrays.toString(arr33));

    }

 void one(Animal qaz){
        qaz.klit4ka="feda";
     qaz=null;
 }

 void two(int[] arr){
        int[] arr77={2,6,8,9};
        arr[0]=57;
        arr=arr77;
     System.out.println(Arrays.toString(arr)+"  @@@@@@");

 }
}
