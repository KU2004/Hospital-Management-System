package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn2 {
    Connection c2;
    Statement s2;

    conn2() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/doctorlogin";
        try {
            c2 = DriverManager.getConnection(url, username, password);
            s2 = c2.createStatement();
            System.out.println("connetion successful!!");

        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}

