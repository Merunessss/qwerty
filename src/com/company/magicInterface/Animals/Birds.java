package com.company.magicInterface.Animals;

public class Birds {

    public static void main(String[] args) {

    }

}

class Dodo extends Birds implements Crawling, Flying {



    @Override
    public int crawl() {
        return 0;
    }

    @Override
    public int fly() {
        return 0;
    }
}

class Eagles extends Birds implements Flying {


    @Override
    public int fly() {
        return 0;
    }
}






