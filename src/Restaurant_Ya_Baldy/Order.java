package Restaurant_Ya_Baldy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    int orderNum;
    HashMap<Dish, Map<Integer,Boolean>> foodSum = new HashMap<>();

    public Order(int orderNum) {
        this.orderNum = orderNum;
    }





    int totalSumMoney (){

        int counterSum = 0;
        for (Dish temp:foodSum.keySet()) {
            int countDish=0;
            for(int tempCount:foodSum.get(temp).keySet()){
                countDish=tempCount;
            }
           counterSum +=  temp.price * countDish;
        }
        return counterSum;
    }



}
