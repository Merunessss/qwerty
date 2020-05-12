package Cafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;

public class Cafe {

    //  List<Table> tablList = new LinkedList<>();

    CopyOnWriteArrayList<Table> tablList1 = new CopyOnWriteArrayList<>();

    public Cafe(int countTable) {
        for (int i = 0; i <= countTable; i++) {
            tablList1.add(new Table(i, 3));
        }
    }


    public static void main(String[] args) {


        Cafe cafeOne = new Cafe(10);
        List<Customer> list = new ArrayList<>();
        Collections.addAll(list, new Customer("11 !", cafeOne),
                new Customer("22 !", cafeOne),
                new Customer("33 !", cafeOne),
                new Customer("44 !", cafeOne),
                new Customer("55 !", cafeOne),
                new Customer("66 !", cafeOne),
                new Customer("77 !", cafeOne),
                new Customer("88 !", cafeOne),
                new Customer("99 !", cafeOne),
                new Customer("1010 !", cafeOne));

        int counter = 0;

        while (counter == 0) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isAlive()) {
                    break;
                }
                if (i == list.size() - 1) {
                    counter = 1;
                }
            }
        }

        cafeOne.closeCafe();

    }

    void closeCafe() {
        for (Table temp : tablList1) {
            temp.flag = false;
        }
        System.out.println("CAFE CLOSED ++++++++");
    }

}


class Customer extends Thread {
    String name;

    Cafe cafe;


    public Customer(String name, Cafe cafe) {
        this.name = name;
        this.cafe = cafe;
        this.start();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        for (Table temp : cafe.tablList1) {

           // temp.custList.add(this);
            try {
                sleep(500);
                if (temp.semaphore.tryAcquire()) {

                    temp.semaphore.acquire();
                    temp.custList.add(this);
                    sleep(1000);
                    temp.custList.remove(this);
                    temp.semaphore.release();
                    System.out.println("Thank you VKUSNO " + this.name + " " + temp.tableNum);
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PO IDEE VSE POKUHSALI " + this.name);

    }
}

class Table extends Thread {

    int tableNum;
    CopyOnWriteArrayList<Customer> custList = new CopyOnWriteArrayList<>();
    Semaphore semaphore;
    boolean flag = true;

    public Table(int tableNum, int maxPeople) {
        this.tableNum = tableNum;
        this.semaphore = new Semaphore(maxPeople);
        start();
    }

    boolean checkCustName() {

        boolean result = false;

        for (Customer temp : custList) {
            for (Customer temp2 : custList) {
                if (temp.name.equals(temp2.name) && temp != temp2) {
                    System.out.println("Dobriy ve4er podvintes " + temp.name + " " + tableNum);
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public void run() {
        while (flag) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            checkCustName();
        }
    }


}