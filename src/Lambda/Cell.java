package Lambda;

import java.util.ArrayList;
import java.util.Random;

public class Cell {

    TypeCell name;

    public Cell(TypeCell name) {
        this.name = name;
    }


    public static void main(String[] args) {


    }

    void prigovor(PlayerKub playerName, int sizeFields) {

        switch (name) {

            case Ordinary:

                break;

            case grave:
                playerName.currentPlace = (playerName.currentPlace - 2) >= 0 ? (playerName.currentPlace - 2) : 0;


                break;

            case castleBravo:

                playerName.currentPlace = sizeFields - 1;

                break;

            case freeze:
                playerName.freez = 1;

                break;

        }


    }


}

enum TypeCell {
    Ordinary, grave, castleBravo, freeze
}