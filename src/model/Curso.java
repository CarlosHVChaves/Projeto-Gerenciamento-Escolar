/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LL
 */
public class Curso {

    private int codigo;
    private String nome;
    private int cargaHoraria;
    private int duraçãoCurso;
    private double valormensalidade;

    public Curso() {

    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the duraçãoCurso
     */
    public int getDuraçãoCurso() {
        return duraçãoCurso;
    }

    /**
     * @param duraçãoCurso the duraçãoCurso to set
     */
    public void setDuraçãoCurso(int duraçãoCurso) {
        this.duraçãoCurso = duraçãoCurso;
    }

    /**
     * @return the valormensalidade
     */
    public double getValormensalidade() {
        return valormensalidade;
    }

    /**
     * @param valormensalidade the valormensalidade to set
     */
    public void setValormensalidade(double valormensalidade) {
        this.valormensalidade = valormensalidade;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
