package com.company;

import java.util.Arrays;

public class MathUtil {

    public static void main(String[] args) {

        int[] vasya = new int[]{12, 3, 4, 8, 4, 5, 3, 76};

        MathUtil mathUtil = new MathUtil();

        mathUtil.sortArrayBubble(vasya);

        int[][] vasya2 = new int[][]{{2, 5, -54, 34, 4, 3, 1},
                {23, 3, 4, 2, 77, 8, 5},
                {12, 3, -22, 43, 5, 4}};

        String[][] stroki = new String[][]{{"asdfg", "qaa", "q"}, {"qwer", "ty"},
                {"zz","22222222222222"}, {"3333333333","11"}};

       // mathUtil.sortStrDoubleArrByLength(stroki);


        // mathUtil.sortArrayBubble(vasya2);

        //mathUtil.convertOneDimensionArr(vasya2);

        //  mathUtil.sortArrayBubbleDouble(vasya2);

        //  mathUtil.universalSortArr(vasya, true);

        mathUtil.mySortStrDoub(stroki);
    }

    //    3  4
    static int summarize(int oneP, int twoP) {
        int result = 0;
        if (oneP % 2 == 0 && twoP % 2 == 0) {
            result = oneP + twoP;
        } else {
            System.out.println("NE 4ETNIE 4ISLA ");
        }

        System.out.println(result);

        return result;
    }


    static int subtract(int oneM, int twoM) {
        int result = 0;

        if (oneM % 2 == 0 && twoM % 2 == 0) {
            result = oneM - twoM;
        } else {
            System.out.println("NE CELIE 4ISLA");
        }

        System.out.println(result);

        return result;
    }

    static int multiply(int oneMult, int twoMult) {
        int result = 0;

        if (oneMult % 2 == 0 && twoMult % 2 == 0 && oneMult != 0 && twoMult != 0) {
            result = oneMult * twoMult;
        } else {
            System.out.println(" NA NOL MULT NELZA ILI CHISLO NE 4etnoe");
        }

        System.out.println(result);
        return result;
    }

    static int divide(int oneDiv, int twoDiv) {
        int result = 0;

        if (oneDiv % 2 == 0 && twoDiv % 2 == 0 && oneDiv != 0 && twoDiv != 0) {
            result = oneDiv / twoDiv;
        } else {
            System.out.println("NA NOL DIVIDE NELZA ILI CHISLO NE CELOE");
        }

        System.out.println(result);

        return result;
    }
// 3 1 5 8
// 1 3 5 4 8
//
// 1 3 4 5 8  1 3 4 5 8

    ///// 1 2 3 4 4 5 6 7 8 5 6 7 8 45

    void universalSortArr(int[] oneDimArr, boolean flag) {
        if (flag) {
            sortArrayBubble(oneDimArr);
            System.out.print(Arrays.toString(oneDimArr));
        } else {
            int countSwap;
            do {
                countSwap = 0;
                for (int i = oneDimArr.length - 1; i >= 1; i--) {
                    if (firstBiggerSecond(oneDimArr[i], oneDimArr[i - 1]) == true) {
                        swap(oneDimArr, i, i - 1);
                        countSwap++;
                    }
                }
            } while (countSwap > 0);
            System.out.print(Arrays.toString(oneDimArr));
        }
    }


    void sortArrayBubbleDouble(int[][] arr) {
        int[] arr1 = convertOneDimensionArr(arr);
        sortArrayBubble(arr1);

        for (int k = 0; k < arr1.length; ) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {

                    arr[i][j] = arr1[k];
                    k++;
                }
            }
        }
        System.out.print(Arrays.deepToString(arr));

    }

    private int[] convertOneDimensionArr(int[][] arr) {

        int arrOneCounter = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrOneCounter++;
            }
        }
        int[] arrOne = new int[arrOneCounter];

        int tempCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrOne[tempCount] = arr[i][j];
                tempCount++;
            }
        }

        return arrOne;
    }


    void sortArrayBubble(int[] arr) {


        int countSwap;
        do {
            countSwap = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (firstBiggerSecond(arr[i], arr[i + 1]) == true) {
                    swap(arr, i, i + 1);
                    countSwap++;
                }
            }
        } while (countSwap > 0);

        // System.out.println(Arrays.toString(arr));

    }

    private void swap(int[] arr, int firstElement, int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }

    private void swap(String[] arr, int firstElement, int secondElement) {
        String temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }

    private boolean firstBiggerSecond(int firstElement, int secondElement) {

        return firstElement > secondElement ? true : false;
    }

    void sortStrDoubleArrByLength(String[][] doubleArr) {

        String[] arr1 = convertStrOneDimensionArr(doubleArr);
        sortStrArrayBubble(arr1);

        for (int k = 0; k < arr1.length; ) {
            for (int i = 0; i < doubleArr.length; i++) {
                for (int j = 0; j < doubleArr[i].length; j++) {

                    doubleArr[i][j] = arr1[k];
                    k++;
                }
            }
        }
        System.out.print(Arrays.deepToString(doubleArr));

    }


    private String[] convertStrOneDimensionArr(String[][] arr) {

        int arrOneCounter = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrOneCounter++;
            }
        }
        String[] arrOne = new String[arrOneCounter];

        int tempCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrOne[tempCount] = arr[i][j];
                tempCount++;
            }
        }

        return arrOne;
    }

    void sortStrArrayBubble(String[] arr) {


        int countSwap;
        do {
            countSwap = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (firstBiggerSecond(arr[i].length(), arr[i + 1].length()) == true) {
                    swap(arr, i, i + 1);
                    countSwap++;
                }
            }
        } while (countSwap > 0);


    }

    void mySortStrDoub(String[][] arr) {


        for (int i = 0; i < arr.length; i++) {
            sortStrArrayBubble(arr[i]);
            if (i < arr.length - 1) {
                while (arr[i][arr[i].length - 1].length() > arr[i + 1][0].length()) {
                    String temp = arr[i][arr[i].length - 1];
                    arr[i][arr[i].length - 1] = arr[i + 1][0];
                    arr[i + 1][0] = temp;
                    sortStrArrayBubble(arr[i]);
                    sortStrArrayBubble(arr[i+1]);

                }

            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
//    void mySortStrDoub1(String[][] arr) {
//
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for(int j=0;j<arr[i].length-1;j++){
//                if(arr[i][j].length()>arr[i][j+1].length()){
//                   String temp = arr[i][arr[i].length - 1];
//                    arr[i][arr[i].length - 1] = arr[i + 1][0];
//                    arr[i + 1][0] = temp;
//                }
//            }
//            if(arr[i][arr[i].length-1].length()>arr[i][j+1].length()){
//            if()
//            if (i < arr.length - 1) {
//                while (arr[i][arr[i].length - 1].length() > arr[i + 1][0].length()) {
//
//                    sortStrArrayBubble(arr[i]);
//                    sortStrArrayBubble(arr[i+1]);
//
//                }
//
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));
//    }







}








