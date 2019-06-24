/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import model.Parcela;

/**
 *
 * @author LL
 */
public class ParcelaDAO implements Persistencia<Parcela>{

    @Override
    public int insert(Parcela obj) {
        System.out.println(obj.getNumero());
        Connection con = ConnectionFactory.getConnection();
//        String query = "INSERT INTO curso (obj.getCodigo(), obj.";     
//        Connection con = new Connect().getConnection();
        String sql = "INSERT INTO parcela(numero,id_aluno,id_curso,valor,dt_vencimento,status,id_Pagamento) VALUES(?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, obj.getNumero());
            stmt.setInt(2, obj.getAluno().getCodigo());
            stmt.setDouble(3, obj.getCurso().getCodigo());
            stmt.setDouble(4, obj.getPagamento().getValorFinalMensalidade());
            stmt.setString(5, obj.getDataVencimento());
            stmt.setString(6, obj.getStatus());
            stmt.setInt(7, obj.getPagamento().getCodigo());
            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException u) {
            //throw new RuntimeException(u);
            System.out.println(u);
            JOptionPane.showMessageDialog(null, "Erro ao Inserir");
        }
        System.out.println("ID da parcela: "+Statement.RETURN_GENERATED_KEYS);
        return  Statement.RETURN_GENERATED_KEYS;
    }

    @Override
    public boolean update(Parcela obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Parcela obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Parcela> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Parcela findByCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
