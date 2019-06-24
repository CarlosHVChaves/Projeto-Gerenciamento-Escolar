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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author carlos.chaves
 */
public class AlunoDAO implements Persistencia<Aluno> {

    @Override
    public int insert(Aluno obj) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO aluno(nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,"
                + "complemento,bairro,cidade,uf_endereco,dt_nascimento,naturalidade,estado_civil,profissao,cpf,rg,uf_rg,"
                + "sexo,nome_mae,nome_pai,formacao,nome_responsavel,cpf_responsavel,rg_responsavel,uf_rg_responsavel,dt_nascimento_responsavel) "
                + "VALUES(?,DATE_FORMAT(NOW(),'%d/%b/%Y %T'),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getTelefone());
            stmt.setString(3, obj.getCelular());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getLogradouro());
            stmt.setInt(7, obj.getNumlogradouro());
            stmt.setString(8, obj.getComplementoLogradouro());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getUfLogradouro());
            stmt.setString(12, obj.getDataNascimento());
            stmt.setString(13, obj.getNaturalidade());
            stmt.setString(14, obj.getEstadoCivil());
            stmt.setString(15, obj.getProfissao());
            stmt.setString(16, obj.getCpf());
            stmt.setString(17, obj.getRg());
            stmt.setString(18, obj.getUfRg());
            stmt.setString(19, obj.getSexo());
            stmt.setString(20, obj.getNomeMae());
            stmt.setString(21, obj.getNomePai());
            stmt.setString(22, obj.getFormacao());
            stmt.setString(23, obj.getNomeResponsavel());
            stmt.setString(24, obj.getCpfResponsavel());
            stmt.setString(25, obj.getRgResponsavel());
            stmt.setString(26, obj.getUfRGResponsavel());
            stmt.setString(27, obj.getDataNascResponsavel());
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            stmt.execute();
            stmt.close();
            con.close();

        } catch (SQLException u) {
            //throw new RuntimeException(u);
            System.out.println(u);
            JOptionPane.showMessageDialog(null, "Erro ao Inserir");
        }
        return obj.getCodigo();
    }

    @Override
    public boolean update(Aluno obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Aluno obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Aluno> select() {
        List<Aluno> alunos = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT id,nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,"
                + "complemento,bairro,cidade,uf_endereco,dt_nascimento,naturalidade,estado_civil,cpf,rg,uf_rg,sexo,nome_mae,nome_pai,"
                + "formacao,cargo from funcionario WHERE cargo = 'Professor'";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            while (rs.next())/* itera no ResultSet*/ {
                Aluno aluno = new Aluno();
                //coloca tudo as info no cliente provisório aqui ja pega direto do BD
                aluno.setCodigo(Integer.parseInt(rs.getString("id")));
                aluno.setNome(rs.getString("nome"));
                aluno.setDatacadastro(rs.getString("dt_cadastro"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCep(rs.getString("cep"));
                aluno.setLogradouro(rs.getString("logradouro"));
                aluno.setNumlogradouro(Integer.parseInt(rs.getString("numero_logradouro")));
                aluno.setComplementoLogradouro(rs.getString("complemento"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setUfLogradouro(rs.getString("uf_endereco"));
                aluno.setDataNascimento(rs.getString("dt_nascimento"));
                aluno.setNaturalidade(rs.getString("naturalidade"));
                aluno.setEstadoCivil(rs.getString("estado_civil"));
                aluno.setProfissao(rs.getString("profissao"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setRg(rs.getString("rg"));
                aluno.setUfRg(rs.getString("uf_rg"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setNomeMae(rs.getString("nome_mae"));
                aluno.setNomePai(rs.getString("nome_pai"));
                aluno.setFormacao(rs.getString("formacao"));
                aluno.setNomeResponsavel(rs.getString("nome_responsavel"));
                aluno.setCpfResponsavel(rs.getString("cpf_responsavel"));
                aluno.setRgResponsavel(rs.getString("rg_responsavel"));
                aluno.setUfRGResponsavel(rs.getString("uf_rg_responsavel"));
                aluno.setDataNascResponsavel(rs.getString("dt_nascimento_responsavel"));

                alunos.add(aluno);
            }
            rs.close();
            con.close();
            return alunos;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado");
            throw new RuntimeException(u);
        }
    }

    @Override
    public Aluno findByCodigo(int codigo) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,complemento,bairro,cidade,"
                + "uf_endereco,dt_nascimento,naturalidade,estado_civil,profissao,cpf,rg,uf_rg,sexo,nome_mae,nome_pai,formacao,"
                + "nome_responsavel,cpf_responsavel,rg_responsavel,uf_rg_responsavel,dt_nascimento_responsavel FROM aluno WHERE id =" + codigo + "";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            Aluno aluno = new Aluno();
            while (rs.next())/* itera no ResultSet*/ {
                aluno.setNome(rs.getString("nome"));
                aluno.setDatacadastro(rs.getString("dt_cadastro"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setEmail(rs.getString("email"));
                aluno.setCep(rs.getString("cep"));
                aluno.setLogradouro(rs.getString("logradouro"));
                aluno.setNumlogradouro(Integer.parseInt(rs.getString("numero_logradouro")));
                aluno.setComplementoLogradouro(rs.getString("complemento"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setUfLogradouro(rs.getString("uf_endereco"));
                aluno.setDataNascimento(rs.getString("dt_nascimento"));
                aluno.setNaturalidade(rs.getString("naturalidade"));
                aluno.setEstadoCivil(rs.getString("estado_civil"));
                aluno.setProfissao(rs.getString("profissao"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setRg(rs.getString("rg"));
                aluno.setUfRg(rs.getString("uf_rg"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setNomeMae(rs.getString("nome_mae"));
                aluno.setNomePai(rs.getString("nome_pai"));
                aluno.setFormacao(rs.getString("formacao"));
                aluno.setNomeResponsavel(rs.getString("nome_responsavel"));
                aluno.setCpfResponsavel(rs.getString("cpf_responsavel"));
                aluno.setRgResponsavel(rs.getString("rg_responsavel"));
                aluno.setUfRGResponsavel(rs.getString("uf_rg_responsavel"));
                aluno.setDataNascResponsavel(rs.getString("dt_nascimento_responsavel"));
            }
            rs.close();
            con.close();
            return aluno;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado");
            throw new RuntimeException(u);
        }
    }
}
