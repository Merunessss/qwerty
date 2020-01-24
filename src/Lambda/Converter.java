package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Converter {

   static <K> void convert(K[] arr,AlgoritmFun<K> fun){
      for(int i = 0; i < arr.length; i++){
          arr[i] = fun.function(arr[i]);

      }
    }

    public static void main(String[] args) {
       MyPredicate<Integer> qwe= T ->  T % 2 == 0 ;
        Predicate <Integer> vas = T ->  T % 2 == 0 ;
        Integer[] arr = new Integer[]{12,22,0,4,5};
        int[] totalSum={0};
        Arrays.stream(arr).filter(vas).forEach(  T ->{
            totalSum[0]=totalSum[0]+T;
            System.out.println(T);
            System.out.println(Arrays.toString(totalSum));

        } );
        System.out.println(totalSum[0]);



//
//
//
//        MyAlgoritm myAlgoritm = new MyAlgoritm();
//
//        convert(arr,myAlgoritm);
//       final  int a=45;
//        convert(arr, new AlgoritmFun<Integer>() {
//            @Override
//            public Integer function(Integer element) {
//                System.out.println(a);
//                return element*element +3*element-9 ;
//            }
//        });
//        AlgoritmFun<Integer> tempFun= w->w*w+67*w-13;
//        AlgoritmFun<String> tempFun2= w->w+"sdsdsd";
//       // tempFun=tempFun2;
//
//        convert(arr,tempFun);
    }
}

interface  MyPredicate<R>{
    boolean qwer(R par);
}
