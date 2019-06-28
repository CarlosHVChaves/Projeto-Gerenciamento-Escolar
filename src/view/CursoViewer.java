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
@Table(name = "curso", catalog = "gerenciamento_escolar", schema = "")
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findById", query = "SELECT c FROM Curso c WHERE c.id = :id")
    , @NamedQuery(name = "Curso.findByNome", query = "SELECT c FROM Curso c WHERE c.nome = :nome")
    , @NamedQuery(name = "Curso.findByDtCadastro", query = "SELECT c FROM Curso c WHERE c.dtCadastro = :dtCadastro")
    , @NamedQuery(name = "Curso.findByCargaHoraria", query = "SELECT c FROM Curso c WHERE c.cargaHoraria = :cargaHoraria")
    , @NamedQuery(name = "Curso.findByDuracao", query = "SELECT c FROM Curso c WHERE c.duracao = :duracao")
    , @NamedQuery(name = "Curso.findByValor", query = "SELECT c FROM Curso c WHERE c.valor = :valor")})
public class CursoViewer implements Serializable {

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
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    @Column(name = "duracao")
    private Integer duracao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;

    public CursoViewer() {
    }

    public CursoViewer(Integer id) {
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

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        Integer oldCargaHoraria = this.cargaHoraria;
        this.cargaHoraria = cargaHoraria;
        changeSupport.firePropertyChange("cargaHoraria", oldCargaHoraria, cargaHoraria);
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        Integer oldDuracao = this.duracao;
        this.duracao = duracao;
        changeSupport.firePropertyChange("duracao", oldDuracao, duracao);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        Double oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
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
        if (!(object instanceof CursoViewer)) {
            return false;
        }
        CursoViewer other = (CursoViewer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Curso[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
