package br.edu.faeterj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection createConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/clienteladb";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url, user, password);
    }
}
