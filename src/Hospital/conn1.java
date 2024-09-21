package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn1 {
    Connection c1;
    Statement s1;

    conn1() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/appiontment";
        try {
            c1= DriverManager.getConnection(url,username,password);
            s1 = c1.createStatement();
            System.out.println("connetion successful!!");

        } catch (Exception e1) {
            System.out.println("Connection failed");
        }
    }
}


