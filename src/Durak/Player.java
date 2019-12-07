package Durak;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Player {

    String name;

    boolean hisTurn;

    ArrayList<Card> MyCards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(3);
        for (Integer temp : list) {

        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hisTurn=" + hisTurn +
                ", MyCards=" + MyCards +
                '}';
    }

    public void takeTurn(Map<Card, Card> table) {
        // нет ли карт на рабочем столе
        //
        if (TheGame.mustDobratKart = true) {
            for (int i = MyCards.size(); i < 7 && TheGame.KolodaCard.size() != 0; i++) {
                MyCards.add(TheGame.KolodaCard.get(i));
            }

            TheGame.mustDobratKart = false;
        }
        System.out.println(table);
        System.out.println("Hod igroka " + this.name);
        System.out.println(this.MyCards);


        Scanner scn = new Scanner(System.in);
        int cardIndex = scn.nextInt();
        if(cardIndex==55){
            table.clear();
            return;
        }
        if (cardIndex == 33) {
            MyCards.addAll(table.keySet());
            MyCards.addAll(table.values());
            table.clear();
            return;
        }
        Card card = MyCards.get(cardIndex);
        if (table.size() == 0) {

            table.put(card, null);
            MyCards.remove(cardIndex);
            return;
        } else {
            Card temp = findRightNull(table);
            if (temp == null) {

                table.put(card, null);
                MyCards.remove(cardIndex);
            } else {
table.put(temp,card);
                MyCards.remove(cardIndex);
                return;
            }
        }
    }

    private Card contrAttack(Card temp) {
        Card result = null;
        for (Card tempCard : MyCards) {
            if (tempCard.cardValue.number > temp.cardValue.number) {
                result = tempCard;
            }
        }
        return result;
    }


    private Card findRightNull(Map<Card, Card> table) {

        Card enemyCard = null;
        for (Map.Entry<Card, Card> temp : table.entrySet()) {
            if (temp.getValue() == null) {
                enemyCard = temp.getKey();
            }
        }
        return enemyCard;
    }
}






