/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static util.Configura.lookAndFeel;
import view.TelaPrincipal;
/**
 *
 * @author Henrique Vieira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        lookAndFeel();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }
   
}
