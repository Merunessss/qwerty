import com.company.HomeWork;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class HomeWork3 {


    public static void main(String[] args) {

        HomeWork3 work3 = new HomeWork3();

        int[] arrOne = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrTwo = new int[]{9, 10, 11};

        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listTree = new ArrayList<>();

        ArrayList<String> stringOne = new ArrayList<>();
        ArrayList<String> stringOTwo = new ArrayList<>();

        stringOne.add("Vasya");
        stringOne.add("Vasya 1");
        stringOne.add("Vasya 2");

        stringOTwo.add("Kolya");
        stringOTwo.add("Vasya 2");
        stringOTwo.add("Kolya 32");

        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);

        listTwo.add(4);
        listTwo.add(5);
        listTwo.add(6);
        listTwo.add(7);

        listTree.add(5);


        ArrayList<Comparable> listObject = new ArrayList<>();
        ArrayList<Comparable> listObject2 = new ArrayList<>();

        listObject.add("Vasya");
        listObject.add(new Orange(1));
        listObject.add(LocalDate.now());

        listObject2.add("Vasya");
        listObject2.add(new Orange(3));
        listObject2.add(new Orange(23));






        // work3.findSameDigits(arrOne, arrTwo);
        List<LocalDate> qwe = new ArrayList<>();
        qwe.add(LocalDate.now());
        qwe.add(LocalDate.now());
        qwe.add(LocalDate.now());
        List<Orange> apelsins = new ArrayList<>();
        apelsins.add(new Orange(25));
        apelsins.add(new Orange(250));
        apelsins.add(new Orange(225));
        // System.out.println(work3.findSameElementsModern(listOne,listTwo));
        //System.out.println(work3.one(listOne, listTwo, listTree));
        //work3.genericRealisation(apelsins, apelsins);

      //  System.out.println( work3.sameForObjects(listObject,listObject2));


        LocalDateTime d1=LocalDateTime.of(2019,12,12,12,00);
        LocalDateTime d2=LocalDateTime.of(2019,12,12,13,00);
        LocalDateTime d3=LocalDateTime.of(2019,12,12,11,00);
        System.out.println(ChronoUnit.MINUTES.between(d2, d1));
        System.out.println(ChronoUnit.MINUTES.between(d1, d3));
        if(ChronoUnit.MINUTES.between(d1, d3) <= -60 | ChronoUnit.MINUTES.between(d1, d3) >= 60){
            System.out.println("VSE NORM BRONIRUY");
        } else {
            System.out.println("KAVALER SORRY VSE ZANYATO");
        }

    }


    void findSameDigits(int[] digitsArrOne, int[] digitsArrTwo) {
        for (int i = 0; i < digitsArrOne.length; i++) {
            for (int j = 0; j < digitsArrTwo.length; j++) {
                if (digitsArrOne[i] == digitsArrTwo[j]) {
                    System.out.println("Every range has " + "$ " + digitsArrOne[i] + " $" + " digit");
                }
            }
        }
    }

    void findSameElements(ArrayList<Integer> one, ArrayList<Integer> two) {


        for (int tempOne : one) {
            for (int tempTwo : two) {
                if (tempOne == tempTwo) {
                    System.out.println("This element contains in both lists " + tempOne);
                }
            }
        }
    }

    List<Integer> findSameElementsModern(List<Integer> one, List<Integer> two) {

        List<Integer> result = new ArrayList<>();

        for (int tempOne : one) {
            for (int tempTwo : two) {
                if (tempOne == tempTwo) {
                    System.out.println("This element contains in both lists " + tempOne);
                    result.add(tempOne);
                }
            }
        }

        return result;
    }

    List<Integer> one(List<Integer>... spisokList) {
        int index = 0;
        List<Integer> result = new ArrayList();
        //List<Integer>
        for (List<Integer> tempList : spisokList) {
            if (index == 0) {
                result = findSameElementsModern(tempList, spisokList[index == spisokList.length - 1 ? index : index + 1]);
            } else {
                result = findSameElementsModern(result, spisokList[index == spisokList.length - 1 ? index : index + 1]);
            }


            index++;
        }

        return result;
    }


    <T extends Comparable<T>> List<T> genericRealisation(List<T> oneT, List<T> twoT) {

        List<T> result = new Vector<>();

        for (T temp : oneT) {
            for (T temp2 : twoT) {
                if (temp.compareTo(temp2) == 0) {
                    result.add(temp);
                }
            }
        }
        return result;
    }

    <T extends Comparable<T>> List<T> sameForObjects(List<T>... spisokList) {
        int index = 0;
        List<T> result = new ArrayList();
        //List<Integer>
        for (List<T> tempList : spisokList) {
            if (index == 0) {
                result = genericRealisation(tempList, spisokList[index == spisokList.length - 1 ? index : index + 1]);
            } else {
                result = genericRealisation(result, spisokList[index == spisokList.length - 1 ? index : index + 1]);
            }
            index++;
        }

        return result;
    }


}

class Orange implements Comparable<Object> {
    int weight;

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }

    public Orange(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}









