package Durak;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Player {

    String name;

    boolean hisTurn;

    ArrayList<Card> MyCards = new ArrayList<Card>();

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
        Random randomCard = new Random();
        if (table.size() == 0) {
            int num = randomCard.nextInt(6);
            Card card = MyCards.get(num);
            table.put(card, null);
            MyCards.remove(num);
            return;
        } else {
            if (findRightNull(table)) {

            }
        }


    }

    private boolean findRightNull(Map<Card, Card> table) {
        Card enemyCard = null;
        for (Map.Entry<Card, Card> temp : table.entrySet()) {
            if (temp.getValue() == null) {
                enemyCard = temp.getKey();
            }
           // contrAttack() {
            }
        return false;
        }
    }


