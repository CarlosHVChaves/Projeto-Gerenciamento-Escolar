package dao;


import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos.chaves
 */
public class UtilitarioDAO {
    public void retornaIDCadastrado(String tabela) {
        int ultimoRegistro;
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT last_insert_id(id) FROM "+tabela+" ORDER BY id DESC LIMIT 1;";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            while (rs.next())/* itera no ResultSet*/ {
                ultimoRegistro = rs.getInt("last_insert_id(id)");
                JOptionPane.showMessageDialog(null, "O ID do cadastro é: "+ultimoRegistro+"");
            }
            rs.close();
            con.close();
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
            throw new RuntimeException(u);
        }
    }
}
