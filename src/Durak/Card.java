package Durak;

public class Card implements Comparable<Card> {

    Mast mast;
    CardValue cardValue;

    public Card(Mast mast, CardValue cardValue) {
        this.mast = mast;
        this.cardValue = cardValue;
    }

    public static void main(String[] args) {
        System.out.println(Mast.Bubna.compareTo(Mast.Chervi));


    }

    @Override
    public String toString() {
        return "Card{" +
                "mast=" + mast +
                ", cardValue=" + cardValue +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return this.mast.compareTo(o.mast) *111 + this.cardValue.compareTo(o.cardValue);
    }
}

enum Mast {
    Pika, Trefa, Bubna, Chervi;
}


enum CardValue {

    Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Valet(11),
    Dama(12), King(13), Tuz(14);

    int number;

    CardValue(int number) {
        this.number = number;
    }


}