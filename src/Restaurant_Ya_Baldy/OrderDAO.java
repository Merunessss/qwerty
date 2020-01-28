package Restaurant_Ya_Baldy;

import java.sql.*;
import java.util.List;

public class OrderDAO implements DAO<Order> {

    Connection connection = MyConnect.getConnection("jdbc:sqlite:E:/123/Restaurant.db");

    Restaurant restaurant21;

    public OrderDAO(Restaurant restaurant) {
        this.restaurant21 = restaurant;
    }

    public static void main(String[] args) {

        Restaurant restaurantKLASS = new Restaurant("Klass", 20, 12, 24);

        OrderDAO orderDAO = new OrderDAO(restaurantKLASS);

        Order orderFour = new Order(4);

        orderDAO.create(orderFour);


    }


    public boolean create(Order newObj) {

        String sql = "INSERT INTO Orders ( OrderNum) VALUES (?)";

        try (
                PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, newObj.orderNum);

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

//    @Override
//    public boolean create(Object newObj) {
//        return false;
//    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Order newObj) {
        return false;
    }

    @Override
    public Order find(int id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }
}
