package Durak;

public class Card {

    Mast mast;
    CardValue cardValue;

    public Card(Mast mast, CardValue cardValue) {
        this.mast = mast;
        this.cardValue = cardValue;
    }

    public static void main(String[] args) {


    }

    @Override
    public String toString() {
        return "Card{" +
                "mast=" + mast +
                ", cardValue=" + cardValue +
                '}';
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