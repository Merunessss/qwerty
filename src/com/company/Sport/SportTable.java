package com.company.Sport;
//import com.company.Human;
public interface SportTable {
    int[] rcountRun={0};
    void toTrain(int time);

    default void two(){
        System.out.println("default");
    }
}

class Human{
     int age;
    String name;
    int winCount;

    public Human() {
        System.out.println("работает конструктор хуман дефаут");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        //System.out.println(SportTable.var);
        Boxer vasya = new Boxer(20, "vasya", 43);
        vasya.age=41;
        Human hum=new Human();
        hum.age=34;
        System.out.println(vasya.age);
        System.out.println(vasya.weight);

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                '}';
    }
}

class Boxer extends Human implements SportTable{
int weight;
    public Boxer(int age, String name,int weight33) {
     super(age, name);
       this.weight=weight33;
        System.out.println("работает конструктор боксера");

      // this.age=age;
    }

    @Override
    public void toTrain(int time) {
        System.out.println("boxing"+this.age);

    }
}

class Aikidoka extends Human implements SportTable{

    public Aikidoka(int age, String name) {
        super(age, name);
    }

    @Override
    public void toTrain(int time) {

    }
}