package Hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn4 {
    Connection c4;
    Statement s4;

    conn4() {
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/patientlogin";
        try {
            c4 = DriverManager.getConnection(url, username, password);
            s4 = c4.createStatement();
            System.out.println("connetion successful!!");

        } catch (Exception e) {
            System.out.println("Connection failed");
        }
    }
}
