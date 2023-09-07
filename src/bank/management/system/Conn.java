package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "nitesh@1234");
            System.out.print(c);
            s = c.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

}
