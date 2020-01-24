package Lambda;

import java.util.ArrayList;
import java.util.Random;

public class Kubik {


    public static void main(String[] args) {


    }

    int throwKubik (){
        Random random = new Random();
        int result = random.nextInt(5)+1 ;
        return result;
    }

}
