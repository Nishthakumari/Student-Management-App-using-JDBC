package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {

    static Connection con;
    public static Connection createC() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String user = "root";
            String password = "password";
            String url = "jdbc:mysql://localhost:3306/student_manage";

            con = DriverManager.getConnection(url, user, password);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
