package com.company.magicInterface.Animals;

public interface Flying {

    int fly ();

    default int toLand (){
        return 2;
    }

}
