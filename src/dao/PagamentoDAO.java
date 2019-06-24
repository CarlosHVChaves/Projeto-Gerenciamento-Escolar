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
import model.Pagamento;

/**
 *
 * @author carlos.chaves
 */
public class PagamentoDAO implements Persistencia<Pagamento>{

    @Override
    public int insert(Pagamento obj) {
        Connection con = ConnectionFactory.getConnection();
//        String query = "INSERT INTO curso (obj.getCodigo(), obj.";     
//        Connection con = new Connect().getConnection();
        String sql = "INSERT INTO pagamento(id_aluno,Id_curso,valor,percentual_desconto,valor_final,dia_vencimento,) VALUES(?,?,?,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, obj.getAluno().getCodigo());
            stmt.setInt(2, obj.getCurso().getCodigo());
            stmt.setDouble(3, obj.getValorCurso());
            stmt.setInt(4, obj.getDescontoMensalidade());
            stmt.setDouble(5, obj.getValorFinalMensalidade());
            stmt.setInt(6, obj.getDiaVencimento());
            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException u) {
            //throw new RuntimeException(u);
            System.out.println(u);
            JOptionPane.showMessageDialog(null, "Erro ao Inserir");
        }
        System.out.println("ID do pagamento: "+Statement.RETURN_GENERATED_KEYS);
        return  Statement.RETURN_GENERATED_KEYS;
    }

    @Override
    public boolean update(Pagamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Pagamento obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagamento> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pagamento findByCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
