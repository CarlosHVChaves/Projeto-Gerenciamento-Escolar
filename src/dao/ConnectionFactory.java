/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author linux
 */
public class ConnectionFactory {

//    private static final String URL = "jdbc:sqlite:/home/linux/NetBeansProjects/InfoSysManha/db/InfoSysDB.db";
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciamento_escolar";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            System.out.println(e+"");
            throw new RuntimeException("Erro de conexão com o banco de dados!");
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro no fechamento da conexão com o banco de dados!");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement pst) {
        try {
            if (pst != null) {
                pst.close();
            }
            closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException("Erro no fechamento da conexão com o banco de dados!");
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            closeConnection(con,pst);
        } catch (SQLException e) {
            throw new RuntimeException("Erro no fechamento da conexão com o banco de dados!");
        }
    }

}
