package br.SisAgenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    //setar o tempo certo: SET @@global.time_zone = '+3:00';

                    "jdbc:mysql://127.0.0.1/sistema_agenda", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
