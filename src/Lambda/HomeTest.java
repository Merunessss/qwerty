package Lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HomeTest implements Comparable<HomeTest> {
    String ladName;
    int ladAge;
    static int counter = 0;

    public HomeTest(String ladName, int ladAge) {
        this.ladName = ladName;
        this.ladAge = ladAge;
    }


    @Override
    public String toString() {
        return "HomeTest{" +
                "ladName='" + ladName + '\'' +
                ", ladAge=" + ladAge +
                '}';
    }

    public static void main(String[] args) {

        HomeTest bazar = new HomeTest("test", 10000000);

        ArrayList<HomeTest> witcherLads = new ArrayList<>();


//        HomeTest zirel = new HomeTest("zirel");
//        HomeTest geralt = new HomeTest("geralt");
//        HomeTest regis = new HomeTest("regis");
//        HomeTest gwent = new HomeTest("gwent");
//        HomeTest zolton = new HomeTest("zolton");

        witcherLads.add(new HomeTest("zirel", 230));
        witcherLads.add(new HomeTest("geralt", 95));
        witcherLads.add(new HomeTest("regis", 600));
        witcherLads.add(new HomeTest("gwent", 1200));
        witcherLads.add(new HomeTest("zorton", 1800));

        // Predicate<HomeTest> nameStart = T -> T.LadName.matches("g[a-z0-9]*");

        List<HomeTest> withcerList = witcherLads.stream().
                filter(T -> T.ladName.matches("g[a-z0-9]*")).collect(Collectors.toList());
        //System.out.println(withcerList);


        //  bazar.ageGroup(witcherLads, 94);
//
//        int[] acumAge = {0};
//
//        Consumer<HomeTest> avgAge = T -> acumAge[0] = acumAge[0] + T.ladAge;

        witcherLads.stream().sorted().forEach(System.out::println);

        witcherLads.stream().sorted(new Comparator<HomeTest>() {
            @Override
            public int compare(HomeTest o1, HomeTest o2) {
                return 0;
            }
        });

        Comparator<HomeTest> lamOne = (T, S) -> {


            char v1[] = T.ladName.toCharArray();
            char v2[] = S.ladName.toCharArray();
            int len1 = v1.length;
            int len2 = v2.length;
            int lim = Math.min(len1, len2);

            if(lim >= 2){
               return  v1[2] - v2[2];
            }

            return -1;
        };

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");

        witcherLads.stream().sorted(lamOne).forEach(System.out::println);

        //  withcerList.stream().forEach(avgAge);

        //int sizeAge = withcerList.size();

        //  int resultAvgAge =  acumAge[0] / withcerList.size();

        // System.out.println(resultAvgAge);


    }


    HomeTest[] ageGroup(ArrayList<HomeTest> lads, int age) {

        List<HomeTest> list;

        list = lads.stream().filter(T -> T.ladAge > age).collect(Collectors.toList());

        HomeTest[] result = new HomeTest[list.size()];

        list.toArray(result);
        Stream.generate(()-> "java2s.com").limit(10);


        //  System.out.println(Arrays.toString(result));

        return result;
    }

    @Override
    public int compareTo(HomeTest o) {
        counter++;
        System.out.println(counter);
        System.out.println(this + "  " + o + "_______________");

        return this.ladAge - o.ladAge;
    }
}
