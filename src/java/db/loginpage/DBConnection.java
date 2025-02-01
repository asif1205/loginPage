package db.loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    public static void main(String args[]){
       
    }
    private static final String URL = "jdbc:oracle:thin:@DESKTOP-A8CBMS9/xe";
    private static final String USER = "Enote";
    private static final String PASSWORD = "asif";
    private static Connection conn = null;

    static {
        try {
            // Load the Oracle JDBC driver
           // Class.forName("oracle.jdbc.OracleDriver");
            // Create a connection instance
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","Enote","asif");
            System.out.println("Connected Successfully!!!!");
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
