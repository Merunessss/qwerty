package Restaurant_Ya_Baldy;

import java.util.*;

public class Restaurant {

    List<Table> tables = new Vector<>();
    List<Reservation> Reservations = new ArrayList<>();
    Set<Dish> eDish = new TreeSet<>();
    String adress;
    int startHour;
    int closeHour;
    List<Order> orders = new ArrayList<>();
    DishDAO dishManager;


    public Restaurant(String adress, int capacity, int startHour, int closeHour) {
        this.adress = adress;
        this.startHour = startHour;
        this.closeHour = closeHour;
        dishManager=new DishDAO(this);
        for (int i = 1; i < capacity + 1; i++) {
            tables.add(new Table(i));
        }
        createDefaultMenu();

    }

    private void createDefaultMenu() {
        List<Dish>   menu=dishManager.getAll(1);
        eDish.addAll(menu);
    }


    public static void main(String[] args) {


    }





    // ДЛЯ ТЕСТОВ

//    public int getCountTable() {
//        // tables.remove(0);
//        return tables.size();
//    }
}

