package com.company.Sport;


import java.time.LocalDate;
//import java.util.Date;
import java.util.Random;

public class Camp {

    public static void main(String[] args) {
        Karateist funakoshi = new Karateist(90, "funik");

        Aikidoka tyson = new Aikidoka(23, "tyson");

        Boxer loma = new Boxer(20, "loma", 66);

        SportTable[] fighters = {funakoshi, tyson, loma,
                new Boxer(20, "Bava", 66),
                new Boxer(20, "Kata", 66),
                new Boxer(20, "Peta", 66),
                new Boxer(20, "Rama", 66),
                new Boxer(20, "Dava", 66),
                new Boxer(20, "Zafa", 66),
                new Boxer(20, "Lalo", 66)


        };

        Camp camp = new Camp();

        camp.trainTogether(fighters);
    }


    void trainTogether(SportTable[] sportsmans) {
        for (int i = 0; i < sportsmans.length; i++) {
            sportsmans[i].toTrain(2);
        }
        int i = 0;
        for (int k = 0; k < sportsmans.length; k++) {
            ((Human) sportsmans[k]).winCount = 0;
        }

        for (SportTable temp : sportsmans) {

            pereborPartner(temp, sportsmans, i);

        }
        SportTable ultimWin = sportsmans[0];

        for (int s = 0; s < sportsmans.length; s++) {
            if (((Human) ultimWin).winCount < (((Human) sportsmans[s]).winCount)) {
                ultimWin = sportsmans[s];
            }

        }
        int max = ((Human) ultimWin).winCount;
        int countWinners = 0;
        for (int d = 0; d < sportsmans.length; d++) {
            if (((Human) sportsmans[d]).winCount == max) {
                countWinners++;
            }
        }
        if (countWinners == 1) {

            System.out.println("The Winner is " + ultimWin + " Congrats");

        } else {
            SportTable[] ultimateWinners = new SportTable[countWinners];
            int temp = 0;
            for (int w = 0; w < sportsmans.length; w++) {
                if (((Human)sportsmans[w]).winCount == max) {
                    ultimateWinners[temp] = sportsmans[w];
                    temp++;
                }
            }
            trainTogether(ultimateWinners);
        }


    }

    private SportTable spar(SportTable sportsman, SportTable sportsman1) {
        Random random = new Random();
        int runner = random.nextInt(2);
        SportTable winner = runner == 0 ? sportsman : sportsman1;
        ((Human) winner).winCount++;
        return winner;

    }

    void pereborPartner(SportTable fighter, SportTable[] arr, int count) {
        for (int i = count; i < arr.length; i++) {
            if (arr[i] != fighter) {
                System.out.println(spar(arr[i], fighter));
            }
        }

    }

}
