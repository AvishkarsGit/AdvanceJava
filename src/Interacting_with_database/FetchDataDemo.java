package Interacting_with_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);

        String Query="select *  from data";
        Statement st = con.createStatement();
        ResultSet rs =st.executeQuery(Query);
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
        con.close();
    }
}
