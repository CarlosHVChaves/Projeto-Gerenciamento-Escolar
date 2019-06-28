/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author CarlosHVChaves
 */
@Entity
@Table(name = "funcionario", catalog = "gerenciamento_escolar", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f")
    , @NamedQuery(name = "Funcionario.findById", query = "SELECT f FROM Funcionario f WHERE f.id = :id")
    , @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome")
    , @NamedQuery(name = "Funcionario.findByDtCadastro", query = "SELECT f FROM Funcionario f WHERE f.dtCadastro = :dtCadastro")
    , @NamedQuery(name = "Funcionario.findByTelefone", query = "SELECT f FROM Funcionario f WHERE f.telefone = :telefone")
    , @NamedQuery(name = "Funcionario.findByCelular", query = "SELECT f FROM Funcionario f WHERE f.celular = :celular")
    , @NamedQuery(name = "Funcionario.findByEmail", query = "SELECT f FROM Funcionario f WHERE f.email = :email")
    , @NamedQuery(name = "Funcionario.findByCep", query = "SELECT f FROM Funcionario f WHERE f.cep = :cep")
    , @NamedQuery(name = "Funcionario.findByLogradouro", query = "SELECT f FROM Funcionario f WHERE f.logradouro = :logradouro")
    , @NamedQuery(name = "Funcionario.findByNumeroLogradouro", query = "SELECT f FROM Funcionario f WHERE f.numeroLogradouro = :numeroLogradouro")
    , @NamedQuery(name = "Funcionario.findByComplemento", query = "SELECT f FROM Funcionario f WHERE f.complemento = :complemento")
    , @NamedQuery(name = "Funcionario.findByBairro", query = "SELECT f FROM Funcionario f WHERE f.bairro = :bairro")
    , @NamedQuery(name = "Funcionario.findByCidade", query = "SELECT f FROM Funcionario f WHERE f.cidade = :cidade")
    , @NamedQuery(name = "Funcionario.findByUfEndereco", query = "SELECT f FROM Funcionario f WHERE f.ufEndereco = :ufEndereco")
    , @NamedQuery(name = "Funcionario.findByDtNascimento", query = "SELECT f FROM Funcionario f WHERE f.dtNascimento = :dtNascimento")
    , @NamedQuery(name = "Funcionario.findByNaturalidade", query = "SELECT f FROM Funcionario f WHERE f.naturalidade = :naturalidade")
    , @NamedQuery(name = "Funcionario.findByEstadoCivil", query = "SELECT f FROM Funcionario f WHERE f.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf")
    , @NamedQuery(name = "Funcionario.findByRg", query = "SELECT f FROM Funcionario f WHERE f.rg = :rg")
    , @NamedQuery(name = "Funcionario.findByUfRg", query = "SELECT f FROM Funcionario f WHERE f.ufRg = :ufRg")
    , @NamedQuery(name = "Funcionario.findBySexo", query = "SELECT f FROM Funcionario f WHERE f.sexo = :sexo")
    , @NamedQuery(name = "Funcionario.findByNomeMae", query = "SELECT f FROM Funcionario f WHERE f.nomeMae = :nomeMae")
    , @NamedQuery(name = "Funcionario.findByNomePai", query = "SELECT f FROM Funcionario f WHERE f.nomePai = :nomePai")
    , @NamedQuery(name = "Funcionario.findByFormacao", query = "SELECT f FROM Funcionario f WHERE f.formacao = :formacao")
    , @NamedQuery(name = "Funcionario.findByCargo", query = "SELECT f FROM Funcionario f WHERE f.cargo = :cargo")})
public class FuncionarioViewer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dt_cadastro")
    private String dtCadastro;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "celular")
    private String celular;
    @Column(name = "email")
    private String email;
    @Column(name = "cep")
    private String cep;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "numero_logradouro")
    private String numeroLogradouro;
    @Column(name = "complemento")
    private String complemento;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "uf_endereco")
    private String ufEndereco;
    @Column(name = "dt_nascimento")
    private String dtNascimento;
    @Column(name = "naturalidade")
    private String naturalidade;
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "uf_rg")
    private String ufRg;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "nome_mae")
    private String nomeMae;
    @Column(name = "nome_pai")
    private String nomePai;
    @Column(name = "formacao")
    private String formacao;
    @Column(name = "cargo")
    private String cargo;

    public FuncionarioViewer() {
    }

    public FuncionarioViewer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        String oldDtCadastro = this.dtCadastro;
        this.dtCadastro = dtCadastro;
        changeSupport.firePropertyChange("dtCadastro", oldDtCadastro, dtCadastro);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        String oldCelular = this.celular;
        this.celular = celular;
        changeSupport.firePropertyChange("celular", oldCelular, celular);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        changeSupport.firePropertyChange("logradouro", oldLogradouro, logradouro);
    }

    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(String numeroLogradouro) {
        String oldNumeroLogradouro = this.numeroLogradouro;
        this.numeroLogradouro = numeroLogradouro;
        changeSupport.firePropertyChange("numeroLogradouro", oldNumeroLogradouro, numeroLogradouro);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        String oldUfEndereco = this.ufEndereco;
        this.ufEndereco = ufEndereco;
        changeSupport.firePropertyChange("ufEndereco", oldUfEndereco, ufEndereco);
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        String oldDtNascimento = this.dtNascimento;
        this.dtNascimento = dtNascimento;
        changeSupport.firePropertyChange("dtNascimento", oldDtNascimento, dtNascimento);
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        String oldNaturalidade = this.naturalidade;
        this.naturalidade = naturalidade;
        changeSupport.firePropertyChange("naturalidade", oldNaturalidade, naturalidade);
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        String oldEstadoCivil = this.estadoCivil;
        this.estadoCivil = estadoCivil;
        changeSupport.firePropertyChange("estadoCivil", oldEstadoCivil, estadoCivil);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getUfRg() {
        return ufRg;
    }

    public void setUfRg(String ufRg) {
        String oldUfRg = this.ufRg;
        this.ufRg = ufRg;
        changeSupport.firePropertyChange("ufRg", oldUfRg, ufRg);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        String oldNomeMae = this.nomeMae;
        this.nomeMae = nomeMae;
        changeSupport.firePropertyChange("nomeMae", oldNomeMae, nomeMae);
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        String oldNomePai = this.nomePai;
        this.nomePai = nomePai;
        changeSupport.firePropertyChange("nomePai", oldNomePai, nomePai);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        String oldFormacao = this.formacao;
        this.formacao = formacao;
        changeSupport.firePropertyChange("formacao", oldFormacao, formacao);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        String oldCargo = this.cargo;
        this.cargo = cargo;
        changeSupport.firePropertyChange("cargo", oldCargo, cargo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuncionarioViewer)) {
            return false;
        }
        FuncionarioViewer other = (FuncionarioViewer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Funcionario[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
