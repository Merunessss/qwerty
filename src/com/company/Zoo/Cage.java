package com.company.Zoo;

import com.sun.istack.internal.NotNull;

import java.util.Vector;

public class Cage {
    Environment env;
    int square;
    int cageNum;

    Vector<Animal> list = new Vector<>();


    public Cage(Environment env, int square) {
        this.env = env;
        this.square = square;
    }

    public static void main(String[] args) {

        Cage cageOne = new Cage(Environment.Land, 90);
        Cage cageTwo = new Cage(Environment.Land, 90);

        Lions lionOne = new Lions(25, "Rizik");

        Colibri colibriOne = new Colibri(10, "pu4ka");





//        System.out.println(cageOne.addAnimal(lionOne));
//        System.out.println(cageOne.addAnimal(colibriOne));
//        System.out.println(cageOne.transferAnimal(cageTwo,"Rizik"));
//        System.out.println(cageOne.transferAnimal(cageTwo,"Rizik"));

        cageOne.toEat1(lionOne,null);


    }

    boolean addAnimal(Animal zivotnoe) {
        boolean result = false;
        if (env.equals(zivotnoe.envOne)) {
            if (spaceLeft() >= zivotnoe.volume) {
                if (list.size() == 0) {
                    list.add(zivotnoe);
                    result = true;
                } else {
                    if (list.get(0).getClass().getName().equals(zivotnoe.getClass().getName())) {
                        list.add(zivotnoe);
                        result = true;
                    }
                }
            }
        }


        return result;
    }

    private int spaceLeft() {
        int ocuppiedSpace = 0;

        for (Animal temp : list) {
            ocuppiedSpace += temp.volume;
        }


        return square - ocuppiedSpace;
    }

    boolean transferAnimal(Cage where, String nameAnimal) {

        boolean result = false;

        for (Animal tempAnimale : list) {

            if (tempAnimale.klit4ka.equals(nameAnimal) == true) {
                result = where.addAnimal(tempAnimale);
                if (result == true) {
                    list.remove(tempAnimale);
                    break;
                } else {
                    System.out.println(" NE VbIIIILo ");
                }
            }
        }


        return result;
    }
    boolean toEat1 (Predators predator,@NotNull Pray[] prays){
        return false;
    }

    boolean toEat (Predators predator, Pray... prays){

        boolean result = false;


        for(int i = 0; i < prays.length; i++){
            predator.toEatMeat(prays[i]);
            System.out.println(prays[i].toString());
        }

        System.out.println(predator.toString());


        return result;
    }


}
