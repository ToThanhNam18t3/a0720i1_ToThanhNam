package utils;

import com.sun.jndi.dns.DnsContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String jdbcURL = "jdbc:mysql://localhost:3308/casestudy?useSSL=false&allowPublicKeyRetrieval=true";
    private static String jdbcUsername = "thanhnam";
    private static String jdbcPassword = "ToThanhNam123@#!";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(new DBConnection().getConnection());
    }
}
