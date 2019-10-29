package com.company;

public class Student {
    String studName;
    int studAge;
    int studHeight;
    public static int studCount;


    public Student(String studName, int studAge, int studHeight) {
        this.studName = studName;
        this.studAge = studAge;
        this.studHeight = studHeight;
        studCount++;
    }

    public static void main(String[] args) {
        Student BruceLee = new Student("Bruce Lee", 32, 222);
       // BruceLee.one();
        System.out.println(BruceLee.studAge);
        System.out.println(BruceLee.studName);
    }

}
