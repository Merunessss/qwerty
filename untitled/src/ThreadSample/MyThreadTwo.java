package ThreadSample;

import java.util.Random;

//примеры поток, под примеры задачи. Читать о многопоточности.

public class MyThreadTwo implements Runnable {
    Thread innerThread;
    int counter;
    String name;
    static int var=50;

    public MyThreadTwo(int par, String name) {
        this.innerThread = new Thread(this);
        this.counter = par;
        this.name = name;
       //innerThread.start();
    }

    @Override
    public void run() {
        int i = 0;
        Random ran= new Random();
        int temp;
        while (i < counter) {
            i++;
            temp=ran.nextInt(1);
            if(temp==0){
                get();
            }else{
                set(i);
            }
            System.out.println( name+ "  "+i);

        }
        System.out.println(i + " dosvidanie " + name);
    }

     synchronized int get(){
        return  var;
    }
   synchronized void  set(int qwe){
        var=qwe;
    }


}

class GeneralThread{

    public static void main(String[] args) throws InterruptedException {
        MyThreadTwo potok=new MyThreadTwo(5000, "potok ");
        MyThreadTwo potok1=new MyThreadTwo(5000, "potok ODIN" );
     //   System.out.println(Thread.currentThread().getState().name());
       // System.out.println(potok.innerThread.getState().name());

        potok.innerThread.start();
        potok1.innerThread.start();


       // System.out.println(potok.innerThread.getState().name());

//              potok1.innerThread.join();
//        potok.innerThread.join();

        System.out.println("weewewewwe");


    }
}
