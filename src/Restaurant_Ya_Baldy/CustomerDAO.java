package Restaurant_Ya_Baldy;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CustomerDAO implements DAO<Customer> {
    Connection connection = MyConnect.connect("jdbc:sqlite:E:/123/Restaurant.db");

    @Override
    public boolean create(Customer newObj) {
        String sql = "INSERT INTO Customer (  Name,telephone)  VALUES (?,?)";
        // String sql1 ="INSERT INTO Customer (  Name,telephone)  VALUES ("+newObj.name+","+newObj.telNumber)";
        try (Connection conn = connection;
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, newObj.name);
            pstmt.setString(2, newObj.telNumber);


            pstmt.executeUpdate();
            ResultSet generatedKeys = pstmt.getGeneratedKeys();
            int newId;
            while (generatedKeys.next()) {
                newId = generatedKeys.getInt(1);
                System.out.println(newId + "  }}}}}}}}}}}}}}");
                newObj.setiD(newId);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return false;
    }

    @Override
    public boolean delete(int id) {

        String sql = "DELETE FROM Customer WHERE ID = ?";

        try (Connection conn = connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Customer newObj) {

        String sql = "UPDATE Customer SET Name = ?,telephone = ? WHERE ID = ?";
        System.out.println(newObj.iD + "   +++++++++++");
        try (Connection conn = connection;
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(3, String.valueOf(newObj.iD));
            pstmt.setString(2, newObj.telNumber);
            pstmt.setString(1, newObj.name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public List<Customer> getAll() {

        ArrayList<Customer> customers = new ArrayList<>();

        String sql = "SELECT ID,Name,telephone FROM Customer";

        try {
            Connection conn = connection;
            Statement pstmt = conn.createStatement();
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String telephone = rs.getString(3);
                Customer temp = new Customer(name, telephone);
                temp.setiD(id);
                customers.add(temp);
            }
        } catch (SQLException e) {
        }
        return customers;
    }


    public static void main(String[] args) {
        Customer vasya = new Customer("Vasyqqqqqq", "12123");

        CustomerDAO castDao = new CustomerDAO();

        castDao.create(vasya);

        // castDao.delete(2);
        vasya.name = "qwerty";
      castDao.update(vasya);

        System.out.println(castDao.getAll());

    }
}
