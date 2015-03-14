package com.example.geoffroy.myapp.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Geoffroy on 16-02-15.
 */
public class DBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection(
                    DBinfo.HOST + DBinfo.DB_NAME,
                    DBinfo.USERNAME,
                    DBinfo.PASSWORD);

            System.out.println("DB connected");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
