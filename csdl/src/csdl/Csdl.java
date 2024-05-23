/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Csdl {

    private static String DB_URL = "jdbc:mysql://localhost:3306/company";
    private static String user_name = "root";
    private static String password = "anh1710gdt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, user_name, password);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from company.product where name = 'pc'");

            // show data
            ArrayList<Object> a =new ArrayList<>();
            a.addAll(show(rs));
            String[] s=String.valueOf(a.get(0)).split(" ");
            for (String string : s) {
                System.out.println(string);
            }
//            System.out.println(s[0]);

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public static ArrayList show(ResultSet rs) throws SQLException {
        ArrayList<String> a = new ArrayList<>();
        while (rs.next()) {
            String s = rs.getString(1) + " " + rs.getInt(2)
                    + " " + rs.getString(3);
            a.add(s);
        }
        return a;
    }

}
