package com.company.magicInterface.Animals;

abstract class Figure2D {
    int a;

    public Figure2D() {
        System.out.println("weewew");
    }

    public Figure2D(int a) {
        this.a = a;
    }

    abstract    int square();

}

class Triangle extends Figure2D {
    public Triangle(int awe) {
       super(awe);
    }

    @Override
    int square() {
        return 0;
    }

    public static void main(String[] args) {
        Triangle tr=new Triangle(45);
    }
//    @Override
//    int square() {
//        return 0;
//    }
}