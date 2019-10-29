package com.company;

public class NikitaStack {

    private int[] arrSt;
    private int var;


    public NikitaStack(int[] arrSt) {
        this.arrSt = arrSt;
    }

    public NikitaStack(int initialSize) {

        arrSt = new int[initialSize];
        System.out.println(initialSize);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7};
        NikitaStack stak1 = new NikitaStack(arr1);
        System.out.println(stak1.var);
        NikitaStack stak2 = new NikitaStack(10);
        stak2.addElement(88);
        stak1.addElement(77);
        stak1.exitStack();
        int a = 0;
        System.out.println(a);
    }


    public void addElement(int element) {
        arrSt = HomeWork.insert(arrSt, element);
        printArray(this.arrSt);
    }

    private void printArray(int[] arr1) {
        for (int temp : arr1) {
            System.out.println(temp + " @ ");
        }
    }

    int exitStack() {
        int result = arrSt[arrSt.length - 1];

        arrSt = HomeWork.deleteLastInt(arrSt);
        printArray(this.arrSt);
        return result;
    }

}
