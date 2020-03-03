package IntegrationTest;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class Store {
    DAO<WholeFoods> qwe;
    List<WholeFoods> wholeFoods = new ArrayList<>();
    String name;

    public Store(DAO<WholeFoods> qwe, String name) {
        this.qwe = qwe;
        this.name = name;
        wholeFoods = qwe.findAll();

    }

    boolean addFood(String eda, int quantity, int price) {
        WholeFoods temp = findFood(eda);
        if (findFood(eda) != null) {
            temp.count = quantity;
        } else {
            WholeFoods eda1 = new WholeFoods(eda, quantity, price);
            qwe.create(eda1);
            wholeFoods.add(eda1);
        }


        return true;
    }

    WholeFoods findFood(String eda) {

        WholeFoods result = new WholeFoods("qwwe", 21, 12);
        Optional<WholeFoods> temp = qwe.findAll().stream().filter(T -> T.name.equals(eda)).findAny();
        if (temp.isPresent()) {
            result = temp.get();
        }
        return result;
    }

    public static void main(String[] args) {
//        List mockedList = mock(List.class);
//
//// using mock object - it does not throw any "unexpected interaction" exception
//        mockedList.add("one");
//        mockedList.clear();
//
//// selective, explicit, highly readable verification
//        verify(mockedList).add("one");
//        verify(mockedList).clear();

    }
}
