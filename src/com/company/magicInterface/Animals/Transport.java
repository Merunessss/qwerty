package com.company.magicInterface.Animals;

public class Transport {

    String manufactor;

    public Transport(String manufactor) {
        this.manufactor = manufactor;
    }

    void move(String A, String B){
        System.out.println("from" + A + "to" + B);
    }


void one(){
    System.out.println("one");
}
    public static void main(String[] args) {

        Transport transport = new Transport("");

        LocalDate date = new LocalDate();

        java.time.LocalDate qwe= java.time.LocalDate.now();

        System.out.println(transport.manufactor);

        Flying[] flyingCreatures = new Flying[10];
        flyingCreatures [2] = new Eagles();
        flyingCreatures [3] = new Planes("Boeing");

    }

}

class Cars extends Transport implements Crawling, Flying {

    public static void main(String[] args) {
        Figure2D qwe=new Figure2D(5) {
            @Override
            int square() {
                return 0;
            }
        };
        Account rev=Account.createRevolverAccount();

        Object asd=new Triangle(23);
        Cars ferrari = new Cars("Ferrari");

        Dodo dodo = new Dodo();

        ferrari.two(dodo);
        ferrari.two(new Flying() {
            @Override
            public int fly() {
                return 0;
            }
        });

    }

    public Cars(String manufactor) {
        super(manufactor);
    }

    void two (Flying jet){

    }

    @Override
    void move(String A, String B){
        super.move(A, B);

    }

    @Override
    void one() {
      //  super.one();
        crawl();
        System.out.println("wewewewe");
    }

    @Override
    public int crawl() {
        return 0;
    }

    @Override
    public int fly() {
        return 0;
    }

}

class Planes extends Transport implements Flying  {


    public Planes(String manufactor) {
        super(manufactor);
    }

    @Override
    public int fly() {
        return 0;
    }
}




