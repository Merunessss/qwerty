package com.company.fishing;

import com.company.magicInterface.Animals.LocalDate;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Fisher {

    String name;
    Map<LocalDate, ArrayList<Fish>> ulov = new TreeMap<>();

    public static void main(String[] args) {

    }

    void addFish(LocalDate dataUlova, Fish pbI6a) {
        ArrayList<Fish> setkaDay=ulov.get(dataUlova);
        if(setkaDay==null){
            setkaDay=new ArrayList<>();
            setkaDay.add(pbI6a);
            ulov.put(dataUlova,setkaDay);
        } else {
            setkaDay.add(pbI6a);
        }
    }
}
