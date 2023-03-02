package code.jdbc;

import java.sql.*;
import java.util.Scanner;

public class PrepareStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram","root","root");
            int id;
            String name;
            String address;

            Scanner scan=new Scanner(System.in);
            System.out.println("ENTER ID");
            id= scan.nextInt();
            System.out.println("ENTER NAME");
            name= scan.next();
            System.out.println("ENTER ADDRESS");
            address= scan.next();


            String insert="insert into employee(id,name,address) values(?,?,?)";
            PreparedStatement statement=connection.prepareStatement(insert);
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setString(3,address);

            int i=statement.executeUpdate();                                               //dml
            System.out.println("record insert->"+i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
