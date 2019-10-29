package com.company.magicInterface;

import java.util.Arrays;

public class MagicOne {

    public static void main(String[] args) {

        MagicOne mag = new MagicOne();

        int[] arrMas = new int[]{1,2,3,4};

        Func1 func = new Func1();

        Func2 func2 = new Func2();

       // mag.modArr(arrMas,func);

        mag.modArr(arrMas,func2);

    }

    public void modArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 5 + 3;
        }
    }

    public void modArr(int[] arr1, Algoritmic algor) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = algor.function(arr1[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}

interface Algoritmic {
    int function(int element);
}

class Func1 implements Algoritmic{

    @Override
    public int function(int element) {
        return 51*element-12;
    }
}

class Func2 implements Algoritmic{


    @Override
    public int function(int element) {
        return element*element*element * 11;
    }
}