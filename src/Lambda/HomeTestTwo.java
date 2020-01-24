package Lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HomeTestTwo {

    String name;
    int age;
    int height;


    public HomeTestTwo(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "HomeTestTwo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {

        HomeTestTwo jog = new HomeTestTwo("jog", 21,12);

        //Задание 1. Создать метод,
        // который принимает поток целых чисел и преобразует его в поток чисел кратных исходным.
        // По каждому числу необходимо добавить по 5 чисел кратных им.
        // Т.е  на входе например 2,3,5  преобразуем в 2,4,6,8,10   3,6,9,12,15

        Stream<Integer> qwe = Stream.of(2, 3, 5, 9);
       // qwe.flatMapToInt(w -> IntStream.of(w * 1, w * 2, w * 3, w * 4, w * 5)).forEach(x -> System.out.print(x + " , "));

        qwe.map(w -> "Ondfgsdfsdfe"  + w).forEach(x -> System.out.println(x + " @#@ "));


     //   "Задание 2 Создайте метод, который возвращает из списка пользователей пользователя с максимальным значением или роста,
        //   или возраста, или  веса. Коллекция пользователей и условие передается как параметр метода."


        List<HomeTestTwo> boxers = new ArrayList<>();

        boxers.add(new HomeTestTwo("isuy", 23,12 ) );
        boxers.add(new HomeTestTwo("qisy", 62,66 ) );
        boxers.add(new HomeTestTwo("ivisy", 19,84 ) );

        System.out.println(jog.boxer(boxers, (T,S) -> T.height-S.height ));

    }

    HomeTestTwo boxer (List<HomeTestTwo> athletes, Comparator<HomeTestTwo> pqo){

        return athletes.stream().max(pqo).get();
    }


}
