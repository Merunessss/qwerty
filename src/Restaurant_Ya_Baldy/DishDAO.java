package Restaurant_Ya_Baldy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DishDAO implements DAO<Dish> {

    Connection connection = MyConnect.getConnection("jdbc:sqlite:E:/123/Restaurant.db");

    Restaurant restaurant;

    public DishDAO(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public boolean create(Dish newObj) {
        String sql = "INSERT INTO Dish (dish_name, price) VALUES (?,?)";

        try (
                PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, newObj.name);
            pstmt.setInt(2, newObj.price);
            pstmt.executeUpdate();
            ResultSet generatedKeys = pstmt.getGeneratedKeys();
            int newId;
            while (generatedKeys.next()) {
                newId = generatedKeys.getInt(1);
                System.out.println(newId + "  }}}}}}}}}}}}}}");
                newObj.id = newId;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM Dish WHERE id = ?";

        try (
                PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean update(Dish newObj) {
        String sql = "UPDATE Dish SET price = ?,dish_name=? where id=?";

        try (
                PreparedStatement pstmt = connection.prepareStatement(sql)) {
            // PreparedStatement pstmt = MyConnect.getConnection("jdbc:sqlite:E:/123/Restaurant.db").prepareStatement(sql)) {
            pstmt.setInt(1, newObj.price);
            pstmt.setString(2, newObj.name);
            pstmt.setInt(3, newObj.id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        }


        return false;
    }

    @Override
    public List<Dish> getAll() {

        ArrayList<Dish> balduEda = new ArrayList<>();
        String sql = "SELECT id, dish_name, price FROM Dish";

        try {
            Statement pstmt = connection.createStatement();
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                Dish temp = new Dish(price, name, restaurant);
                temp.id = id;
                balduEda.add(temp);
            }
        } catch (SQLException e) {
        }

        return balduEda;
    }
    public List<Dish> getAll(int idRestoran) {

        ArrayList<Dish> balduEda = new ArrayList<>();
        String sql = "SELECT id, dish_name, price FROM Dish where restaurant_id =" + String.valueOf(idRestoran);

        try {
            Statement pstmt = connection.createStatement();
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                Dish temp = new Dish(price, name, restaurant);
                temp.id = id;
                balduEda.add(temp);
            }
        } catch (SQLException e) {
        }

        return balduEda;
    }
    @Override
    public Dish find(int id1) {
        Dish temp = null;
        String sql = "SELECT id, dish_name, price FROM Dish  where id=" + String.valueOf(id1);


        try {
            Statement pstmt = connection.createStatement();
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int price = rs.getInt(3);
                temp = new Dish(price, name, restaurant);
                temp.id = id;

            }
        } catch (SQLException e) {
        }
        return temp;
    }

    public static void main(String[] args) {

        Restaurant balduOk = new Restaurant("balduRoad", 32, 23, 24);
        DishDAO baldu = new DishDAO(balduOk);
        Dish dish = new Dish(18, "sup33", balduOk);
        //baldu.create(dish);
        System.out.println(dish.id + "   {)))))))))");

        dish.price = 245;

        System.out.println(baldu.getAll());

        //baldu.update(dish);


        // System.out.println(Dish.Fandu.name());
        //baldu.delete(5);


    }
}
