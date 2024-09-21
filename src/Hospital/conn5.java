package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn5 {
    Connection c5;
    Statement s5;

    conn5() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/receptionlogin";
        try {
            c5 = DriverManager.getConnection(url, username, password);
            s5 = c5.createStatement();
            System.out.println("connetion successful!!");

        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}

