package com.company;

import java.time.LocalDate;

public class Human {
    int age;
    String name;
    private String adress;
    Month month;
   public static int count;

    public Human() {
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.month=Month.Березень;
        System.out.println(this.month.number);
        count++;
    }
    void eating(){
        System.out.println("Eating  "+ name);
    }

}
//
//class Student extends Human {
//int averageBall;
//
//    public Student(int age, String name) {
//        super(age, name);
//
//    }
//}
//
//class Aspiran extends  Student{
//
//    public Aspiran(int age, String name) {
//        super(age, name);
//        System.out.println(name);
//    }

