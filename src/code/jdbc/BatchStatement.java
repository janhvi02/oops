package code.jdbc;

import java.sql.*;

public class BatchStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//registration of driver
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprogram","root","root");
            String insert ="insert into employee(id,name,address) values(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(insert);

            for(int i=2;i<=10;i++){
                preparedStatement.setInt(1,i);
                preparedStatement.setString(2,"name="+i);
                preparedStatement.setString(3,"address"+i);
                preparedStatement.addBatch();
            }
            int[] arr=preparedStatement.executeBatch();
            System.out.println("Record added" +arr.length);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
/**
 * call getEmpData();/
 * +------+---------+-----------+
 * | id   | name    | address   |
 * +------+---------+-----------+
 * |    1 | harsh   | pune      |
 * |    2 | name=2  | address2  |
 * |    3 | name=3  | address3  |
 * |    4 | name=4  | address4  |
 * |    5 | name=5  | address5  |
 * |    6 | name=6  | address6  |
 * |    7 | name=7  | address7  |
 * |    8 | name=8  | address8  |
 * |    9 | name=9  | address9  |
 * |   10 | name=10 | address10 |
 * +------+---------+-----------+
 */