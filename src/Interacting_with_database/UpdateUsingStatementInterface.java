package Interacting_with_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUsingStatementInterface {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement stmt=con.createStatement();
        int x=stmt.executeUpdate("update data set ID=4 where Name='Dennis'");
        System.out.println("No of Rows Updated into table:"+x);;
        con.close();
    }
}
