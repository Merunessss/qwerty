package com.company.magicInterface;

public class Vas1 implements Vasya {



    public static void main(String[] args) {

    }


    @Override
    public boolean check(float element) {
        return element % 7 == 0 ? true : false;
    }
}
