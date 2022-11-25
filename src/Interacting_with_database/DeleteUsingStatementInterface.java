package Interacting_with_database;

import java.sql.*;

public class DeleteUsingStatementInterface {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement stmt=con.createStatement();
        int x=stmt.executeUpdate("delete from data where Name='Dennis'");
        System.out.println("No of Rows Delete from table:"+x);;
        con.close();
    }
}
