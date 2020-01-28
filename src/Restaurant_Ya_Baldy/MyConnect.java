package Restaurant_Ya_Baldy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {
    static  Connection connection;


    public static Connection getConnection(String url){
        if(connection==null){
            try {
                // db parameters
                // String url = "jdbc:sqlite:E:/123/Restaurant.db";
                // create a connection to the database
                connection = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //connect();
    }

}
