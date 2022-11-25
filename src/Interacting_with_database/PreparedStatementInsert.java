package Interacting_with_database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class PreparedStatementInsert {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);
        String sql = "insert into emp values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter ID:");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter Name:");
        String name = br.readLine();
        System.out.println("Enter Salary:");
        int salary=Integer.parseInt(br.readLine());

        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,salary);

        System.out.println("Record Inserted ...");
        con.close();

    }
}
