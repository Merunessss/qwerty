package com.company.Zoo;

abstract class Animal {

    int volume;
    String klit4ka;
    Environment envOne;
    Kind kind;
    int maxFoodSize;
    int animalWeight;
    boolean DeadOrAlive;

    public Animal(int volume, String klit4ka, Environment envOne, Kind kind, int maxFoodSize, int animalWeight) {
        this.volume = volume;
        this.klit4ka = klit4ka;
        this.envOne = envOne;
        this.kind = kind;
        this.maxFoodSize = maxFoodSize;
        this.animalWeight = animalWeight;
    }

    abstract void move();

}

class Lions extends Animal implements Predators {


    @Override
    public String toString() {
        return "Lions{" +
                "volume=" + volume +
                ", klit4ka='" + klit4ka + '\'' +
                ", envOne=" + envOne +
                ", kind=" + kind +
                ", maxFoodSize=" + maxFoodSize +
                ", animalWeight=" + animalWeight +
                '}';
    }

    public Lions(int volume, String klit4ka) {
        super(volume, klit4ka, Environment.Land, Kind.Predator, 20, 50);
    }

    @Override
    void move() {

    }



    @Override
    public void toEatMeat(Pray pray) {
       if(maxFoodSize <= pray.getWeight()){
           this.animalWeight = this.animalWeight + maxFoodSize;
           pray.setWeight(maxFoodSize);
       }else {
           this.animalWeight = this.animalWeight + pray.getWeight();
           pray.setWeight(pray.getWeight());
       }

    }


}

class Elephants extends Animal implements Pray {

    public Elephants(int volume, String klit4ka) {
        super(volume, klit4ka, Environment.Land, Kind.Pray, 40, 10);
    }

    @Override
    void move() {

    }

    @Override
    public int getWeight() {


        return animalWeight;
    }

    @Override
    public void setWeight(int animalWeight) {
        this.animalWeight = this.animalWeight - animalWeight;
    }
}

class Eagles extends Animal implements Predators {

    public Eagles(int volume, String klit4ka) {
        super(volume, klit4ka, Environment.Sky, Kind.Predator, 15, 10);
    }

    @Override
    void move() {

    }

    @Override
    public void toEatMeat(Pray pray) {
        pray=null;
    }
}

class Colibri extends Animal implements Pray {

    public Colibri(int volume, String klit4ka) {
        super(volume, klit4ka, Environment.Sky, Kind.Pray, 5, 3);
    }

    @Override
    void move() {

    }

    @Override
    public int getWeight() {
        return animalWeight;
    }

    @Override
    public void setWeight(int animalWeight) {
        this.animalWeight = this.animalWeight - animalWeight;
    }

    @Override
    public String toString() {
        return "Colibri{" +
                "volume=" + volume +
                ", klit4ka='" + klit4ka + '\'' +
                ", envOne=" + envOne +
                ", kind=" + kind +
                ", maxFoodSize=" + maxFoodSize +
                ", animalWeight=" + animalWeight +
                ", DeadOrAlive=" + DeadOrAlive +
                '}';
    }
}

class Crocodiles extends Animal implements Predators {

    public Crocodiles(int volume, String klit4ka) {
        super(volume, klit4ka, Environment.Sea, Kind.Predator, 25, 40);
    }

    @Override
    void move() {

    }

    @Override
    public void toEatMeat(Pray pray) {

    }
}

class Sharks extends Animal implements Predators{

    public Sharks(int volume, String klit4ka) {
        super(volume, klit4ka, Environment.Sea, Kind.Predator, 25, 45);
    }

    @Override
    void move() {

    }

    @Override
    public void toEatMeat(Pray pray) {

    }
}
