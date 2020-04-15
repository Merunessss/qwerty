package ThreadSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ExampleThread {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new Vector();
        //List synList=Collections.synchronizedList(list);
        //List synList=new Vector();

        // Runnable target;
        Thread thread = new Thread(() -> {
            System.out.println("privet ");
            System.out.println(Thread.currentThread().getState());
            int i = 0;

            while (i < 20) {
                list.add(i);
                i++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            list.stream().distinct().forEach(T -> {
                System.out.println(T + " Thread Zero " + list.stream().filter(r -> r == T).count());
            });


            System.out.println(list);
        });
        Thread thread1 = new Thread(() -> {
            System.out.println("privet ");
            System.out.println(Thread.currentThread().getState());
            int i = 0;

            while (i < 20) {
                list.add(i);
                i++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            list.stream().distinct().forEach(T -> {
                System.out.println(T + " Thread One " + list.stream().filter(r -> r == T).count());
            });

            System.out.println(list);
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("privet ");
            System.out.println(Thread.currentThread().getState());
            int i = 0;

            while (i < 20) {
                list.add(i);
                i++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            list.stream().distinct().forEach(T -> {
                System.out.println(T + " Thread Three " + list.stream().filter(r -> r == T).count());
            });

            System.out.println(list);
        });
        System.out.println(thread.getState());

        thread.start();
        thread1.start();
        thread2.start();
        thread.join();
        thread1.join();
        thread2.join();
//        while (thread.isAlive()) {
//
//        }
        //thread.join(10000);
//        int i = 0;
//        while (i < 1000) {
//            System.out.println(thread.getState() + String.valueOf(i++));
//        }


        System.out.println(list + " !!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(thread.getState() + "2222222");
    }
}

class One {
    synchronized void print(String message) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println(message + " " + i);
            //notifyAll();
            wait(10);

        }

    }
}

