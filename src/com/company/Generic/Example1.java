package com.company.Generic;


import com.company.Student;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        Example_generic<Integer> qwe1=new Example_generic<>(6);
        Example_generic<Float> qwe2=new Example_generic<>(34.67f);
        Analog_generic_bad  asd=new Analog_generic_bad(23);
        Analog_generic_bad  asd1=new Analog_generic_bad("asdsdsd");
        asd=asd1;
        Vector<Integer>  vec=new Vector<>();
        vec.get(20);

       // qwe1=qwe2;

    }
}
