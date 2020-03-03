package IntegrationTest;

public class WholeFoods {

    String name;
    int price;
    int count;


    @Override
    public String toString() {
        return "FoodStorage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    public WholeFoods(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }


    public static void main(String[] args) {

    }
}
