package Interacting_with_database;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname = "root";
        String pass = "system";
        String url = "jdbc:mysql://localhost:3306/jdbc";
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from emp");
        ResultSetMetaData rsmt = rs.getMetaData();

        System.out.println("No of Coloumns :"+rsmt.getColumnCount());
        System.out.println("1st Coloumn Name:"+rsmt.getColumnName(1));
        System.out.println("1st Coloumn Type:"+rsmt.getColumnTypeName(1));
        System.out.println("2nd Coloumn Name:"+rsmt.getColumnName(2));
        System.out.println("2nd Coloumn Type:"+rsmt.getColumnTypeName(2));
        System.out.println("3rd Coloumn Name:"+rsmt.getColumnName(3));
        System.out.println("3rd Coloumn Type:"+rsmt.getColumnTypeName(3));
        String t1 = rsmt.getTableName(2);
        System.out.println("table Name:"+t1);
        con.close();
    }
}
