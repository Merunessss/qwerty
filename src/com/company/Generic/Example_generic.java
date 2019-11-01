package com.company.Generic;

public class Example_generic<T extends  Number> {
    T var;
    Example_generic(T var33){
        var=var33;
    }

    void one(){
        System.out.println(var);
    }
}

class  Analog_generic_bad {
    Object var;
    Analog_generic_bad(Object var33){
        var=var33;
    }

    void one(){
        System.out.println(var);
    }

}
