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
import model.Funcionario;

/**
 *
 * @author carlos.chaves
 */
public class FuncionarioDAO implements Persistencia<Funcionario> {

    @Override
    public int insert(Funcionario obj) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "INSERT INTO funcionario(nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,"
                + "complemento,bairro,cidade,uf_endereco,dt_nascimento,naturalidade,estado_civil,cpf,rg,uf_rg,sexo,nome_mae,nome_pai,"
                + "formacao,cargo) VALUES(?,DATE_FORMAT(NOW(),'%d/%b/%Y %T'),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
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
            stmt.setString(15, obj.getCpf());
            stmt.setString(16, obj.getRg());
            stmt.setString(17, obj.getUfRg());
            stmt.setString(18, obj.getSexo());
            stmt.setString(19, obj.getNomeMae());
            stmt.setString(20, obj.getNomePai());
            stmt.setString(21, obj.getFormacao());
            stmt.setString(22, obj.getCargo());
            stmt.execute();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException u) {
            //throw new RuntimeException(u);
            System.out.println(u);
            JOptionPane.showMessageDialog(null, "Erro ao Inserir");
        }
        return obj.getCodigo();
    }

    @Override
    public boolean update(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> select() {
        List<Funcionario> funcionarios = new ArrayList<>();

        Connection con = ConnectionFactory.getConnection();
//        String query = "INSERT INTO curso (obj.getCodigo(), obj.";     
//        Connection con = new Connect().getConnection();

        String sql = "SELECT id,nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,"
                + "complemento,bairro,cidade,uf_endereco,dt_nascimento,naturalidade,estado_civil,cpf,rg,uf_rg,sexo,nome_mae,nome_pai,"
                + "formacao,cargo FROM funcionario";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            while (rs.next())/* itera no ResultSet*/ {
                Funcionario funcionario = new Funcionario();
                //coloca tudo as info no cliente provisório aqui ja pega direto do BD
                funcionario.setCodigo(Integer.parseInt(rs.getString("id")));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDatacadastro(rs.getString("dt_cadastro"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setLogradouro(rs.getString("logradouro"));
                funcionario.setNumlogradouro(Integer.parseInt(rs.getString("numero_logradouro")));
                funcionario.setComplementoLogradouro(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUfLogradouro(rs.getString("uf_endereco"));
                funcionario.setDataNascimento(rs.getString("dt_nascimento"));
                funcionario.setNaturalidade(rs.getString("naturalidade"));
                funcionario.setEstadoCivil(rs.getString("estado_civil"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setUfRg(rs.getString("uf_rg"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setNomeMae(rs.getString("nome_mae"));
                funcionario.setNomePai(rs.getString("nome_pai"));
                funcionario.setFormacao(rs.getString("formacao"));
                funcionario.setFormacao(rs.getString("cargo"));

                funcionarios.add(funcionario);
            }
            rs.close();
            con.close();
            return funcionarios;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException(u);
        }
    }
    public List<Funcionario> selectProfessor() {
        List<Funcionario> funcionarios = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT id,nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,"
                + "complemento,bairro,cidade,uf_endereco,dt_nascimento,naturalidade,estado_civil,cpf,rg,uf_rg,sexo,nome_mae,nome_pai,"
                + "formacao,cargo FROM funcionario WHERE cargo = 'Professor'";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            while (rs.next())/* itera no ResultSet*/ {
                Funcionario funcionario = new Funcionario();
                //coloca tudo as info no cliente provisório aqui ja pega direto do BD
                funcionario.setCodigo(Integer.parseInt(rs.getString("id")));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDatacadastro(rs.getString("dt_cadastro"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setLogradouro(rs.getString("logradouro"));
                funcionario.setNumlogradouro(Integer.parseInt(rs.getString("numero_logradouro")));
                funcionario.setComplementoLogradouro(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUfLogradouro(rs.getString("uf_endereco"));
                funcionario.setDataNascimento(rs.getString("dt_nascimento"));
                funcionario.setNaturalidade(rs.getString("naturalidade"));
                funcionario.setEstadoCivil(rs.getString("estado_civil"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setUfRg(rs.getString("uf_rg"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setNomeMae(rs.getString("nome_mae"));
                funcionario.setNomePai(rs.getString("nome_pai"));
                funcionario.setFormacao(rs.getString("formacao"));
                funcionario.setFormacao(rs.getString("cargo"));

                funcionarios.add(funcionario);
            }
            rs.close();
            con.close();
            return funcionarios;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException(u);
        }
    }

    @Override
    public Funcionario findByCodigo(int codigo) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT nome,dt_cadastro,telefone,celular,email,cep,logradouro,numero_logradouro,"
                + "complemento,bairro,cidade,uf_endereco,dt_nascimento,naturalidade,estado_civil,cpf,rg,uf_rg,sexo,nome_mae,nome_pai,"
                + "formacao,cargo FROM funcionario WHERE id =" + codigo + "";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            Funcionario funcionario = new Funcionario();
            while (rs.next())/* itera no ResultSet*/ {
                //coloca tudo as info no cliente provisório aqui ja pega direto do BD
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDatacadastro(rs.getString("dt_cadastro"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setCep(rs.getString("cep"));
                funcionario.setLogradouro(rs.getString("logradouro"));
                funcionario.setNumlogradouro(Integer.parseInt(rs.getString("numero_logradouro")));
                funcionario.setComplementoLogradouro(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUfLogradouro(rs.getString("uf_endereco"));
                funcionario.setDataNascimento(rs.getString("dt_nascimento"));
                funcionario.setNaturalidade(rs.getString("naturalidade"));
                funcionario.setEstadoCivil(rs.getString("estado_civil"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setUfRg(rs.getString("uf_rg"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setNomeMae(rs.getString("nome_mae"));
                funcionario.setNomePai(rs.getString("nome_pai"));
                funcionario.setFormacao(rs.getString("formacao"));
                funcionario.setCargo(rs.getString("cargo"));
            }
            
            rs.close();
            con.close();
            
            return funcionario;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException(u);
        }
    }
    
    public Funcionario findByCpf(String cpf) {
        Connection con = ConnectionFactory.getConnection();
        String sql = "SELECT id FROM funcionario WHERE cpf ='" + cpf + "'";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);//pega a conexao com o statment            
            ResultSet rs = stmt.executeQuery();//executa um select
            Funcionario funcionario = new Funcionario();
            while (rs.next())/* itera no ResultSet*/ {
                funcionario.setCodigo(rs.getInt("id"));
                
            }
            rs.close();
            con.close();
            JOptionPane.showMessageDialog(null, "O ID do cadastro é: "+funcionario.getCodigo());
            return funcionario;
        } catch (SQLException u) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException(u);
        }
    }

}
