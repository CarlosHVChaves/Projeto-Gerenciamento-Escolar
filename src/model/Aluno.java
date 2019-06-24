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
public class Aluno extends SerHumano {

    private String nomeResponsavel;
    private String cpfResponsavel;
    private String rgResponsavel;
    private String ufRGResponsavel;
    private String dataNascResponsavel;

    public Aluno() {

    }

    /**
     * @return the nomeResponsavel
     */
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    /**
     * @param nomeResponsavel the nomeResponsavel to set
     */
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    /**
     * @return the cpfResponsavel
     */
    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    /**
     * @param cpfResponsavel the cpfResponsavel to set
     */
    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    /**
     * @return the rgResponsavel
     */
    public String getRgResponsavel() {
        return rgResponsavel;
    }

    /**
     * @param rgResponsavel the rgResponsavel to set
     */
    public void setRgResponsavel(String rgResponsavel) {
        this.rgResponsavel = rgResponsavel;
    }

    /**
     * @return the ufRGResponsavel
     */
    public String getUfRGResponsavel() {
        return ufRGResponsavel;
    }

    /**
     * @param ufRGResponsavel the ufRGResponsavel to set
     */
    public void setUfRGResponsavel(String ufRGResponsavel) {
        this.ufRGResponsavel = ufRGResponsavel;
    }

    /**
     * @return the dataNascResponsavel
     */
    public String getDataNascResponsavel() {
        return dataNascResponsavel;
    }

    /**
     * @param dataNascResponsavel the dataNascResponsavel to set
     */
    public void setDataNascResponsavel(String dataNascResponsavel) {
        this.dataNascResponsavel = dataNascResponsavel;
    }

}
