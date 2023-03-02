package code.jdbc;

import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram","root","root");
            Statement statement=connection.createStatement();

            String str="select*from employee";
            ResultSet rs=statement.executeQuery(str);
            ResultSetMetaData rmd=rs.getMetaData();

            System.out.println(rmd.getColumnName(1)+" "+rmd.getColumnName(2)+" "+rmd.getColumnName(3));
            while (rs.next()){
                System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("address"));
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
