package Restaurant_Ya_Baldy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {
    public static Connection connect(String url) {
        Connection result = null;
        try {
            // db parameters
           // String url = "jdbc:sqlite:E:/123/Restaurant.db";
            // create a connection to the database
            result = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //connect();
    }

}
