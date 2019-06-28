/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CarlosHVChaves
 */
public class Pagamento {

    private Aluno aluno;
    private Curso curso;
    private double valorCurso;
    private int descontoMensalidade;
    private double valorFinalMensalidade;
    private int diaVencimento;
    private int codigo;

    public Pagamento() {

    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the valorCurso
     */
    public double getValorCurso() {
        return valorCurso;
    }

    /**
     * @param valorCurso the valorCurso to set
     */
    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    /**
     * @return the descontoMensalidade
     */
    public int getDescontoMensalidade() {
        return descontoMensalidade;
    }

    /**
     * @param descontoMensalidade the descontoMensalidade to set
     */
    public void setDescontoMensalidade(int descontoMensalidade) {
        this.descontoMensalidade = descontoMensalidade;
    }

    /**
     * @return the valorFinalMensalidade
     */
    public double getValorFinalMensalidade() {
        return valorFinalMensalidade;
    }

    /**
     * @param valorFinalMensalidade the valorFinalMensalidade to set
     */
    public void setValorFinalMensalidade(double valorFinalMensalidade) {
        this.valorFinalMensalidade = valorFinalMensalidade;
    }

    /**
     * @return the diaVencimento
     */
    public int getDiaVencimento() {
        return diaVencimento;
    }

    /**
     * @param diaVencimento the diaVencimento to set
     */
    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
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

}
