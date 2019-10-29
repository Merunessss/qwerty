package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {


        String[] pole4udes = new String[]{"World", "Game", "Carlson", "Fighter", "Summer", "Clone", "Ambience",
                "Greatness", "Winner", "Loser"};


        Random random = new Random();

        String chosenWord = pole4udes[random.nextInt(10)];

        int dlina = chosenWord.length();

        StringBuffer stars = new StringBuffer();


        for (int i = 0; i < dlina; i++) {
            stars.append("*");
        }

        String[] stars1 = stars.toString().split("");

        System.out.println(chosenWord + " " + stars.toString());

        int countLifes = 10;

        do {
            Scanner scanner = new Scanner(System.in);

            String chooseBukva = scanner.nextLine();

            int indexBukvi = chosenWord.indexOf(chooseBukva);

            if(indexBukvi == -1){
                System.out.println(" BIb OIIIiBLiS");
                countLifes--;
            }

            int letterCount = 0;

            while (indexBukvi > -1 && letterCount < stars1.length ) {
                stars1[indexBukvi] = chooseBukva;
                indexBukvi = chosenWord.indexOf(chooseBukva, indexBukvi + 1);
                letterCount++;
            }

            System.out.println(Arrays.toString(stars1));

            int haveStars = 0;

            for (int i = 0; i < stars1.length; i++) {
                if (stars1[i].equals("*")) {
                    haveStars++;
                    break;
                }
            }
            if (haveStars == 0) {
                System.out.println(" MALADEC ");
                break;
            }



        } while (countLifes > 0);


    }


}



