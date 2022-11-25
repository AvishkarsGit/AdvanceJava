package Interacting_with_database;

import java.sql.*;
public class DBConnectDemo {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uname = "root";
            String pass = "system";
            String url = "jdbc:mysql://localhost:3306/jdbc";
            Connection con = DriverManager.getConnection(url,uname,pass);
            if (con.isClosed()){
                System.out.println("Connection Closed");
            }
            else {
                System.out.println("Connection Established..");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
