package Restaurant_Ya_Baldy;

public class  Dish implements  Comparable<Dish> {
    int price;
    int id;
    String name;

    Dish(int price,String name, Restaurant rest) {
        this.price = price;
        this.name = name;
        rest.eDish.add(this);
    }


    @Override
    public int compareTo(Dish o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
