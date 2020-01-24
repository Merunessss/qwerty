package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Loser {
    String name;
    int age;


    public Loser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Loser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public static void main(String[] args) {

        ArrayList<Loser> loseri = new ArrayList<>();

        loseri.add(new Loser("cab", 21));
        loseri.add(new Loser("rab123", 25));
        loseri.add(new Loser("rab2", 29));


        List<Loser> list=loseri.stream().
                filter(T -> T.age>23 && T.name.matches("[a-z0-9]*rab[a-z0-9]*")).
                collect(Collectors.toList());

        System.out.println(list);

    }


}
