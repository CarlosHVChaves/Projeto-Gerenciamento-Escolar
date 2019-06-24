/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Nota;

/**
 *
 * @author Daniel
 */
public class NotaDAO implements Persistencia<Nota> {

    @Override
    public int insert(Nota obj) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO nota(id_aluno,id_curso,faltas,nota,status,nota_final,status_final) "
                + "VALUES(?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, obj.getCodAluno());
            stmt.setInt(2, obj.getCodCurso());
            stmt.setInt(3, obj.getFaltas());
            stmt.setInt(4, obj.getNota());
            stmt.setString(5, obj.getStatus());
            stmt.setInt(6, obj.getNotaFinal());
            stmt.setString(7, obj.getStatusFinal());
            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException u) {
            //throw new RuntimeException(u);
            System.out.println(u);
            JOptionPane.showMessageDialog(null, "Erro ao Inserir");
        }
        return obj.getNota();
    }

    @Override
    public boolean update(Nota obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Nota obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Nota> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nota findByCodigos(int codigoAluno,int codigoCurso) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT faltas,nota,status,nota_final,status_final FROM funcionario WHERE id_aluno =" + codigoAluno + "AND id_curso ="+codigoCurso+"";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            Nota nota = new Nota();
            while (rs.next())/* itera no ResultSet*/ {
                //coloca tudo as info no cliente provisório aqui ja pega direto do BD
                nota.setFaltas(rs.getInt("faltas"));
                nota.setNota(rs.getInt("nota"));
                nota.setStatus(rs.getString("status"));
                nota.setNotaFinal(rs.getInt("nota_final"));
                nota.setStatusFinal(rs.getString("status_final"));
            }
            
            rs.close();
            con.close();
            
            return nota;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException(u);
        }
    }

    @Override
    public Nota findByCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
