package Interacting_with_database;

import java.sql.*;

public class InserUsingStatementInterface {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        int row =st.executeUpdate("insert into data values (4040,'Dennis','Alandi')");
        System.out.println("Row inserted :"+row);
        con.close();
    }
}
