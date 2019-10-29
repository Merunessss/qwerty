package com.company.magicInterface.Animals;

public class Insects {

    public static void main(String[] args) {

    }

}

class Ants extends Insects implements Crawling, Flying {

    @Override
    public int crawl() {
        return 0;
    }

    @Override
    public int fly() {
        return 0;
    }
}

class Bees extends Insects implements Flying {


    @Override
    public int fly() {
        return 0;
    }
}




