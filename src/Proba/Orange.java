package Proba;

import com.company.*;

import java.util.*;

public class Orange {
    public static void main(String[] args) {
        Human hum1 = new Human(23, "sddds");
        System.out.println(Human.count);
        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(1);
        qwe.add(45);
        qwe.add(33);
        qwe.add(23);
        qwe.add(11);
        qwe.add(13);
        qwe.add(17);
        for (int temp : qwe) {
            System.out.println(temp);
            //qwe.remove(3);
        }

        //Spliterator sp=qwe.spliterator();
        //for(int i=11)

        Iterator<Integer> it1 = qwe.iterator();
        int i=3;
        while (it1.hasNext() == true) {
            it1.next();
            it1.remove();
            if(i==5){
            qwe.add(23);
            }
           i++;
        }
      //  qwe.clear();
        it1 = qwe.iterator();
        qwe.size();
        System.out.println(qwe.size());
    }
}
//class  MyCollection implements Collection<T>{
//
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<T> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public <T1> T1[] toArray(T1[] a) {
//        return null;
//    }
//
//    @Override
//    public boolean add(T t) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends T> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//}
//}