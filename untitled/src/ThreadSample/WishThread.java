package ThreadSample;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class WishThread {


    public static void main(String[] args) {

        WishThread wishThread = new WishThread();

        Gift car = new Gift("Gtr", 150, 8);
        Gift house = new Gift("house", 200, 10);
        Gift cat = new Gift("cat", 20, 2);
        Gift dog = new Gift("dog", 35, 3);
        Gift bar = new Gift("bar", 80, 1);
        Gift phone = new Gift("phone", 50, 5);
        Gift laptop = new Gift("laptop", 70, 7);
        Gift bed = new Gift("bed", 65, 6);
        Gift food = new Gift("food", 10, 4);

        Gift.giftList.add(car);
        Gift.giftList.add(house);
        Gift.giftList.add(cat);
        Gift.giftList.add(dog);
        Gift.giftList.add(bar);
        Gift.giftList.add(phone);
        Gift.giftList.add(laptop);
        Gift.giftList.add(bed);
        Gift.giftList.add(food);

        System.out.println(Gift.giftList);

        Wallet wallet = new Wallet();


        wallet.moneyMaker.start();


    }

}

class Gift implements Comparable<Gift> {

    String name;
    int price;
    int desireIndex;
    int degreeAvr;

    static Set<Gift> giftList =Collections.synchronizedSet(new TreeSet<>());

    static Map<Gift, LocalDateTime> boughtGifts = Collections.synchronizedMap(new HashMap<>());

    public Gift(String name, int price, int desireIndex) {
        this.name = name;
        this.price = price;
        this.desireIndex = desireIndex;
        this.degreeAvr = desireIndex*1000 / price;
        giftList.add(this);

    }


    static int getRandomDegreeAvr(List<Gift> listGift) {

        Random random = new Random();

        int index = random.nextInt(listGift.size());

        int result = listGift.get(index).degreeAvr;

        return result;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desireIndex=" + desireIndex +
                ", degreeAvr=" + degreeAvr +
                '}';
    }

    @Override
    public int compareTo(Gift o) {
        return (this.degreeAvr - o.degreeAvr) == 0 ? 0 : (this.degreeAvr > o.degreeAvr ? 1 : -1);
    }
}

class Wallet {
    //AtomicInteger qwe=new AtomicInteger();
    int cash;
    boolean flagWishCompleted = false;


    Thread moneyMaker = new Thread(() -> {
        System.out.println("adding money... ");
        Random random = new Random();


        while (!flagWishCompleted) {
            cash = cash + random.nextInt(50);
            System.out.println(" LAVE = " + cash);
            buyGift();
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Lave has finished ");

    });

    private  void buyGift() {
        for (Gift temp : Gift.giftList) {
            if (temp.price <= cash) {
                Gift.boughtGifts.put(temp, LocalDateTime.now());
                Gift.giftList.remove(temp);
                cash = cash - temp.price;
                System.out.println(temp);
                if (Gift.giftList.size() == 0) {
                    System.out.println("qqqqqqqqqqq");
                    flagWishCompleted = true;
                }
            }
        }


    }

    Thread threadGift = new Thread(() -> {

        for (int i = 0; i < Gift.giftList.size(); i++) {

        }

        System.out.println(Gift.boughtGifts);
    });

}


