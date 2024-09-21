package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn6 {
    Connection c6;
    Statement s6;

    conn6() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/pharmarcy";
        try {
            c6 = DriverManager.getConnection(url, username, password);
            s6 = c6.createStatement();
            System.out.println("Connection successful!!");

        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}

