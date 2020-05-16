package ThreadSample;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Sema4ka {

    String name;
    CopyOnWriteArrayList<Tablees> listTable = new CopyOnWriteArrayList<>();


    public Sema4ka(String name, int tables) {
        this.name = name;
        for (int i = 0; i < tables; i++) {
            listTable.add(new Tablees(i, new Semaphore(2)));
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Sema4ka cafe = new Sema4ka("Cafe", 20);

        for (int i = 0; i < 30; i++) {
            new Client("Client # : " + i, cafe).start();
        }

        System.out.println(Client.fullClients + " VSE NAELIS ");
    }

}

class Tablees {

    int numTable;
    Semaphore sem;
    CopyOnWriteArrayList<Client> listClient = new CopyOnWriteArrayList<Client>();


    public Tablees(int numTable, Semaphore sem) {
        this.numTable = numTable;
        this.sem = sem;

    }
}

class Client extends Thread {

    String name;
    Sema4ka cafe;
    static AtomicInteger fullClients=new AtomicInteger();
    volatile boolean  flag = false;

    public Client(String name, Sema4ka cafe) {
        super(name);
        this.name = name;
        this.cafe = cafe;
        // this.start();
    }

    @Override
    public void run() {
        while (!flag) {

            for (Tablees temp : cafe.listTable) {
                if (temp.sem.tryAcquire()) {
                    this.sitAtTheTable(temp);
                    temp.listClient.remove(this);
                    temp.sem.release();
                    System.out.println(this.name + " Pokushali Dosvidanie ");
                    flag = true;
                    System.out.println(fullClients.incrementAndGet());
                    break;
                }
            }
        }

    }

    private void sitAtTheTable(Tablees tab) {
        tab.listClient.add(this);
        System.out.println(this.name +  " Added client to the table # " + tab.numTable + "   Quantity  = " + tab.listClient.size());

        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
