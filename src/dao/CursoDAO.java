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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Curso;

/**
 *
 * @author carlos.chaves
 */
public class CursoDAO implements Persistencia<Curso> {

    @Override
    public int insert(Curso obj) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO curso(nome,dt_cadastro,carga_horaria,duracao,valor) VALUES(?,DATE_FORMAT(NOW(),'%d/%b/%Y %T'),?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, obj.getNome());
            //datacadastro n conta
            stmt.setInt(2, obj.getCargaHoraria());
            stmt.setInt(3, obj.getDuraçãoCurso());
            stmt.setDouble(4, obj.getValormensalidade());
            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException u) {
            //throw new RuntimeException(u);
            JOptionPane.showMessageDialog(null, "Erro ao Inserir");
        }
        return obj.getCodigo();
    }

    @Override
    public boolean update(Curso obj) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "UPDATE curso"
                + "SET nome = " + obj.getNome() + ", carga_horaria = " + obj.getCargaHoraria() + ", duracao =" + obj.getCargaHoraria() + ", valor =" + obj.getValormensalidade()
                + "WHERE id =" + obj.getCodigo() + "";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            return true;
        } catch (SQLException u) {
            //throw new RuntimeException(u);
            JOptionPane.showMessageDialog(null, "Erro ao Alterar");
            throw new RuntimeException(u);
        }
    }

    @Override
    public boolean delete(Curso obj) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "DELETE FROM curso WHERE id =" + obj.getCodigo() + "";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            Curso curso = new Curso();
            while (rs.next())/* itera no ResultSet*/ {
                curso.setNome(rs.getString("nome"));
                curso.setCargaHoraria(rs.getInt("carga_horaria"));
                curso.setDuraçãoCurso(Integer.parseInt(rs.getString("duracao")));
                curso.setValormensalidade(Double.parseDouble(rs.getString("valor")));
            }
            rs.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Curso Deletado");
            return true;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Curso não encontrado");
            throw new RuntimeException(u);
        }
    }

    @Override
    public List<Curso> select() {
        List<Curso> cursos = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT nome,carga_horaria,duracao,valor FROM curso ";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            while (rs.next())/* itera no ResultSet*/ {
                Curso curso = new Curso();
                curso.setNome(rs.getString("nome"));
                curso.setCargaHoraria(rs.getInt("carga_horaria"));
                curso.setDuraçãoCurso(Integer.parseInt(rs.getString("duracao")));
                curso.setValormensalidade(Double.parseDouble(rs.getString("valor")));

                cursos.add(curso);
            }
            rs.close();
            con.close();
            return cursos;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Curso não encontrado");
            throw new RuntimeException(u);
        }
    }

    @Override
    public Curso findByCodigo(int codigo) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT nome,carga_horaria,duracao,valor FROM curso WHERE id =" + codigo + "";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            Curso curso = new Curso();
            while (rs.next())/* itera no ResultSet*/ {
                curso.setNome(rs.getString("nome"));
                curso.setCargaHoraria(rs.getInt("carga_horaria"));
                curso.setDuraçãoCurso(Integer.parseInt(rs.getString("duracao")));
                curso.setValormensalidade(Double.parseDouble(rs.getString("valor")));
            }
            rs.close();
            con.close();
            return curso;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Curso não encontrado");
            throw new RuntimeException(u);
        }
    }

//    public Curso findByNome(String nome) {
//        Connection con = ConnectionFactory.getConnection();
//        String sql = "SELECT id FROM curso WHERE nome ='" + nome + "'";
//        PreparedStatement stmt;
//        try {
//            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
//            ResultSet rs = stmt.executeQuery();//executa um select
//            Curso curso = new Curso();
//            while (rs.next())/* itera no ResultSet*/ {
//                curso.setCodigo(rs.getInt("id"));
//            }
//            rs.close();
//            con.close();
//            JOptionPane.showMessageDialog(null, "O ID do cadastro é: "+curso.getCodigo());
//            return curso;
//        } catch (SQLException u) {
//            JOptionPane.showMessageDialog(null, "Curso não encontrado");
//            throw new RuntimeException(u);
//        }
//    }
}
