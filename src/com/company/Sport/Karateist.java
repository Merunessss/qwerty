package com.company.Sport;

public class Karateist extends Human implements SportTable{

    public Karateist(int age, String name) {
        super(age, name);
        two();
    }

    @Override
    public void toTrain(int time) {

        System.out.println("adsssd");
        two();
    }


}
