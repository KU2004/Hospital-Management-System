package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn3 {
    Connection c3;
    Statement s3;

    conn3() {
        String username = "root";
        String password = "kgp@2004";
        String url = "jdbc:mysql://localhost:3306/docotorslist";
        try {
            c3 = DriverManager.getConnection(url, username, password);
            s3 = c3.createStatement();
            System.out.println("connetion successful!!");

        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}

