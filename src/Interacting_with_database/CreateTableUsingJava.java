package Interacting_with_database;

import java.sql.*;

public class CreateTableUsingJava {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);
        String query="create table emp(ID int(10),Name varchar(20),Salary int(20))";
        Statement st = con.createStatement();
        st.execute(query);
        System.out.println("Table created Success..");
        con.close();
    }
}
