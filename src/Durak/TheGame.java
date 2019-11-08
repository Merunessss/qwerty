package Durak;

import com.company.Zoo.Kind;

import java.util.*;

public class TheGame {


   static ArrayList<Card> KolodaCard = new ArrayList<Card>();

    static boolean mustDobratKart = false;

    Player PlOne, PlTwo;
    Mast kozir;
    Map<Card, Card> table = new TreeMap<>();

    public TheGame(Player plOne, Player plTwo) {
        this.PlOne = plOne;
        this.PlTwo = plTwo;
        createKoloda();
        chooseKozir();
        rasstasovka();
        firstStep();


    }

    void startToPlay() {
        if (PlOne.hisTurn) {
            PlOne.takeTurn(table);
        }
    }


    private void firstStep() {

        Card minOne = getMinKozir(PlOne);
        Card minTwo = getMinKozir(PlTwo);
        if (minOne == null) {
            WhosTurn(1);
        } else if (minTwo == null) {
            WhosTurn(2);
        } else if (minOne.cardValue.number < minTwo.cardValue.number) {
            WhosTurn(1);
        } else {
            WhosTurn(2);
        }


    }

    private void WhosTurn(int numberPlayer) {
        PlOne.hisTurn = numberPlayer == 1 ? true : false;
        PlTwo.hisTurn = numberPlayer == 2 ? true : false;
    }

    private Card getMinKozir(Player pl) {
        Card result = null;
        for (Card temp : pl.MyCards) {
            if (temp.mast.equals(kozir) && result == null) {
                result = temp;
            } else if (temp.mast.equals(kozir) && result.cardValue.number > temp.cardValue.number) {
                result = temp;
            }
        }
        return result;
    }

    private void rasstasovka() {

        for (int i = 0; i < 14; i++) {
            if (i % 2 == 0) {

                PlOne.MyCards.add(KolodaCard.get(i));

            } else {
                PlTwo.MyCards.add(KolodaCard.get(i));

            }
            KolodaCard.remove(i);
        }

    }

    private void chooseKozir() {

        Random random = new Random();

        int res1 = random.nextInt(Mast.values().length - 1);
        this.kozir = Mast.values()[res1];

    }

    private void createKoloda() {

//        for (int i = 0; i < CardValue.values().length; i++) {
//            for (int j = 0; j < Mast.values().length; j++) {
//                KolodaCard.add(new Card(Mast.values()[i], CardValue.values()[j]));
//            }
//        }


        // вариант с фор ич ниже (тоже самое)

        for (Mast temp : Mast.values()) {
            for (CardValue temp2 : CardValue.values()) {
                KolodaCard.add(new Card(temp, temp2));
            }
        }
        Collections.shuffle(KolodaCard);


    }

    @Override
    public String toString() {
        return "TheGame{" +
                "KolodaCard=" + KolodaCard +
                ", PlOne=" + PlOne +
                ", PlTwo=" + PlTwo +
                ", kozir=" + kozir +
                '}';
    }

    public static void main(String[] args) {


        Player durakOne = new Player("DurakOne");
        Player durakTwo = new Player("DurakTwo");

        TheGame Duraki = new TheGame(durakOne, durakTwo);
        System.out.println(Duraki.kozir);
//
//        System.out.println("КАРТЫ ИГРОКА ОДИН" +  durakOne.MyCards);
//        System.out.println("КАРТЫ ИГРОКА ДВА" +  durakTwo.MyCards);
//
//        System.out.println(Duraki.table);

        do {
            durakOne.takeTurn(Duraki.table);
            durakTwo.takeTurn(Duraki.table);
        } while (Duraki.KolodaCard.size() != 0 && Duraki.PlOne.MyCards.size() * Duraki.PlTwo.MyCards.size() != 0);
    }


    void minimum(int arr[]) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }


}
