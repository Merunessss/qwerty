package ThreadSample;

import java.util.Random;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExangerExample {

    public static void main(String[] args) {
        Exchanger<Integer> exchanger = new Exchanger<>();

        new OneThread(" ThreadOne ", exchanger);
        new TwoThread(" ThreadTwo ", exchanger);


    }

}

class OneThread implements Runnable {

    Exchanger<Integer> exchanger;


    public OneThread(String name, Exchanger exchanger) {

        Thread thread = new Thread(this, name);
        this.exchanger = exchanger;
        thread.start();
    }

    @Override
    public void run() {

        int sum = 0;
        Random random = new Random();

        while (true) {
            sum = sum + random.nextInt(10);
            if (sum > 20) {
                System.out.println(sum + Thread.currentThread().getName());
                try {
                    sum=exchanger.exchange(sum);
                    System.out.println("!!!!!!!!!!!!   "+sum);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // TODO: 011 11.04.20
            }
        }

    }
}


class TwoThread implements Runnable {

    Exchanger<Integer> exchanger;

    int sum = 0;

    public TwoThread(String name, Exchanger exchanger) {

        Thread thread = new Thread(this, name);
        this.exchanger = exchanger;
        thread.start();
    }

    @Override
    public void run() {

        int i = 0;
        while (sum<5000) {
            try {
                sum = sum + exchanger.exchange(0, 10, TimeUnit.MILLISECONDS).intValue();
                System.out.println("Iteration " + i + " " + sum);
                i++;
            } catch (InterruptedException | TimeoutException e) {
                e.printStackTrace();
            }
        }


    }
}
