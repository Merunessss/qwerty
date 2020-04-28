package ThreadSample;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {

    int x, y;
    String name;
    int vodka;
    boolean spaceLot;
    static SpaceStation[] arrayStations = new SpaceStation[15];


    public SpaceStation(String name, int vodka, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.vodka = vodka;
    }


    public synchronized void giveVodka() {


    }


}

class FlightController {


    public static void main(String[] args) {

    }

    List<GalacticCargo> listCargo = new ArrayList<>();

    public FlightController(GalacticCargo... ships) {
        for (GalacticCargo temp : ships) {
            listCargo.add(temp);
        }
    }

    {
        SpaceStation station1 = new SpaceStation("Station 1 ", 100, 0, 10);
        SpaceStation station2 = new SpaceStation("Station 2 ", 100, 10, 20);
        SpaceStation station3 = new SpaceStation("Station 3 ", 100, 20, 30);
        SpaceStation station4 = new SpaceStation("Station 4 ", 100, 30, 40);
        SpaceStation station5 = new SpaceStation("Station 5 ", 100, 40, 50);
        SpaceStation station6 = new SpaceStation("Station 6 ", 100, 50, 60);
        SpaceStation station7 = new SpaceStation("Station 7 ", 100, 60, 70);
        SpaceStation station8 = new SpaceStation("Station 8 ", 100, 70, 80);
        SpaceStation station9 = new SpaceStation("Station 9 ", 100, 80, 90);
        SpaceStation station10 = new SpaceStation("Station 10 ", 100, 90, 100);
        SpaceStation station11 = new SpaceStation("Station 11 ", 100, 10, 110);
        SpaceStation station12 = new SpaceStation("Station 12 ", 100, 110, 120);
        SpaceStation station13 = new SpaceStation("Station 13 ", 100, 120, 130);
        SpaceStation station14 = new SpaceStation("Station 14 ", 100, 130, 140);
        SpaceStation station15 = new SpaceStation("Station 15 ", 100, 140, 150);

        SpaceStation.arrayStations[0] = station1;
        SpaceStation.arrayStations[1] = station2;
        SpaceStation.arrayStations[2] = station3;
        SpaceStation.arrayStations[3] = station4;
        SpaceStation.arrayStations[4] = station5;
        SpaceStation.arrayStations[5] = station6;
        SpaceStation.arrayStations[6] = station7;
        SpaceStation.arrayStations[7] = station8;
        SpaceStation.arrayStations[8] = station9;
        SpaceStation.arrayStations[9] = station10;
        SpaceStation.arrayStations[10] = station11;
        SpaceStation.arrayStations[11] = station12;
        SpaceStation.arrayStations[12] = station13;
        SpaceStation.arrayStations[13] = station14;
        SpaceStation.arrayStations[14] = station15;
    }


}

class GalacticCargo extends Thread {

    SpaceStation spaceStation;
    String name;
    int countVodka;
    int currentX, currentY;
    int destinationX, destinationY;
    int speed;
    Trajectory current;


    public GalacticCargo(String name, int countVodka, int speed) {
        this.name = name;
        this.speed = speed;
        this.countVodka = countVodka;
        this.spaceStation = spaceStation;
        setCourse(SpaceStation.arrayStations[3]);
        this.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                currentX++;
                currentY = current.calculate(currentX);
                Thread.sleep(speed);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void setCourse(SpaceStation station) {

    }
}

interface Trajectory {
    int calculate(int x);

}
