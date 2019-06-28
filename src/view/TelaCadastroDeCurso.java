/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.CursoDAO;
import dao.UtilitarioDAO;
import java.awt.Dimension;
import model.Curso;


/**
 *
 * @author CarlosHVChaves
 */
public class TelaCadastroDeCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroDeCurso
     */
    public TelaCadastroDeCurso() {
        initComponents();
        limpaTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDuracaoCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        btBuscarCurso = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btGravarCurso = new javax.swing.JButton();
        btLimparCurso = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Curso");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jLabel1.setText("Nome:");

        jLabel3.setText("Carga Horária:");

        jLabel4.setText("Duração:");

        jLabel5.setText("Valor:");

        jLabel7.setText("Código:");

        btBuscarCurso.setText("Buscar");
        btBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Horas");

        jLabel6.setText("Meses");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(71, 71, 71)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuracaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtDuracaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btGravarCurso.setText("Salvar");
        btGravarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarCursoActionPerformed(evt);
            }
        });

        btLimparCurso.setText("Limpar");
        btLimparCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimparCurso)
                .addGap(18, 18, 18)
                .addComponent(btGravarCurso)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravarCurso)
                    .addComponent(btLimparCurso)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparCursoActionPerformed
        limpaTela();
    }//GEN-LAST:event_btLimparCursoActionPerformed

    private void btGravarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarCursoActionPerformed
        CursoDAO dao = new CursoDAO();
        UtilitarioDAO utilDAO = new UtilitarioDAO();
        Curso curso = new Curso();
        curso.setNome(txtNomeCurso.getText());
        curso.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
        curso.setDuraçãoCurso(Integer.parseInt(txtDuracaoCurso.getText()));
        curso.setValormensalidade(Double.parseDouble(txtValor.getText()));
        dao.insert(curso);
        utilDAO.retornaIDCadastrado("curso");
    }//GEN-LAST:event_btGravarCursoActionPerformed

    private void btBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCursoActionPerformed
        CursoDAO daoC = new CursoDAO();
        Curso curso = daoC.findByCodigo(Integer.parseInt(txtCodigoCurso.getText()));
        txtNomeCurso.setText(curso.getNome());
        txtCargaHoraria.setText(curso.getCargaHoraria()+"");
        txtDuracaoCurso.setText(curso.getDuraçãoCurso() + "");
        txtValor.setText(curso.getValormensalidade()+"");
    }//GEN-LAST:event_btBuscarCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCurso;
    private javax.swing.JButton btGravarCurso;
    private javax.swing.JButton btLimparCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtDuracaoCurso;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    public void limpaTela(){
        txtCargaHoraria.setText("");
        txtValor.setText("");
        txtNomeCurso.setText("");
        txtCodigoCurso.setText("");
        txtDuracaoCurso.setText("");
    }
}
