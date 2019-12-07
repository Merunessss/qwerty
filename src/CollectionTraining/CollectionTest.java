package CollectionTraining;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {

        HashSet<Apelsin> apelsinbI = new HashSet<>();
        Apelsin odinApelsin = new Apelsin(232, "VKUSNIY");
        Apelsin odinApelsin1 = new Apelsin(232, "VKUSNIY");

        apelsinbI.add(odinApelsin);
        apelsinbI.add(odinApelsin1);
        System.out.println(apelsinbI);

        Collection<Integer> collectInt = new ArrayList<>();

        collectInt.add(3);
        collectInt.add(1);
        collectInt.add(2);
        collectInt.add(5);

        System.out.println(collectInt);

        int sum = 0;

        for (int temp : collectInt) {
            sum += temp;
        }


        System.out.println(sum);
        Iterator<Integer> iter1 = collectInt.iterator();

        while (iter1.hasNext() == true) {

            System.out.println(iter1.next());

            //iter1.remove();


        }

        collectInt.clear();
    }

}

class Apelsin implements Comparable<Apelsin> {

    int weight;
    String sort;


    public Apelsin(int weight, String sort) {
        this.weight = weight;
        this.sort = sort;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apelsin)) return false;
        Apelsin apelsin = (Apelsin) o;
        return weight == apelsin.weight &&
                sort.equals(apelsin.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, sort);
    }

    public static void main(String[] args) {

        Set<Apelsin> apelinbI = new TreeSet<>();

        Apelsin kushat = new Apelsin(99, "MARAKANSKI");
        Apelsin kushat1 = new Apelsin(991, "MARAKANSKI1");





        apelinbI.add(kushat);
        apelinbI.add(kushat1);
        System.out.println(apelinbI);



    }

    @Override
    public String toString() {
        return "Apelsin{" +
                "weight=" + weight +
                ", sort='" + sort + '\'' +
                '}';
    }

    @Override
    public int compareTo(Apelsin o) {
        return this.sort.compareTo(o.sort)*1231 + (this.weight-o.weight);
    }
}





