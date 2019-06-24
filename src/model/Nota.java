/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class Nota {

    private int codAluno;
    private int codCurso;
    private int faltas;
    private int nota;
    private String status;
    private int notaFinal;
    private String statusFinal;

    public Nota() {

    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the notaFinal
     */
    public int getNotaFinal() {
        return notaFinal;
    }

    /**
     * @param notaFinal the notaFinal to set
     */
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    /**
     * @return the statusFinal
     */
    public String getStatusFinal() {
        return statusFinal;
    }

    /**
     * @param statusFinal the statusFinal to set
     */
    public void setStatusFinal(String statusFinal) {
        this.statusFinal = statusFinal;
    }

    /**
     * @return the codAluno
     */
    public int getCodAluno() {
        return codAluno;
    }

    /**
     * @param codAluno the codAluno to set
     */
    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    /**
     * @return the codCurso
     */
    public int getCodCurso() {
        return codCurso;
    }

    /**
     * @param codCurso the codCurso to set
     */
    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }
}
