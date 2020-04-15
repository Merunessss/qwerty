package ThreadSample;

public class ThreadVasya {


    public static void main(String[] args) {

        One varOne = new One();

        ThreadMy first = new ThreadMy("first", varOne);
        ThreadMy second = new ThreadMy("second", varOne);
        ThreadMy third = new ThreadMy("third", varOne);
        ThreadMy third2 = new ThreadMy("third2", varOne);
        ThreadMy third3= new ThreadMy("third3", varOne);
//second.setPriority(Thread.MAX_PRIORITY);
//third.setPriority(Thread.N  perezvonu jr);
        first.start();
        second.start();
        third.start();
        third2.start();
        third3.start();

    }


}

class ThreadMy extends Thread {

    One oneExamp;

    public ThreadMy(String name, One oneExamp) {
        super(name);
        this.oneExamp = oneExamp;
    }

    @Override
    public void run() {

        try {
            oneExamp.print(this.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
