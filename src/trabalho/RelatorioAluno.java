/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import javax.swing.JOptionPane;
import static trabalho.FormMenuPrincipal.alunos;
public class RelatorioAluno extends javax.swing.JFrame {



    /**
     * Creates new form RelatorioAluno
     */
    public RelatorioAluno() {
        initComponents();
        relPorCurso();
        relTipoIngresso();
        relAnoIngresso();
        //relGeral();
    }
    String tipoIngresso, curso;
    int ano;
    
    public void relPorCurso(){
        
        for(Aluno a : alunos){
            if(a.getCurso().equalsIgnoreCase(curso))
                taSaida.append("\n\t"+a.getCodigo()+"\t"+a.getNome()+"\t"+a.getTipoIngresso()+"\t"+a.getTipoIngresso()+"\t"+a.getCurso());
        }
        //cancelar();
    }
    public void relTipoIngresso(){
        for(Aluno a : alunos){
            if(a.getTipoIngresso().equalsIgnoreCase(tipoIngresso))
                taSaida.append("\n\t"+a.getCodigo()+"\t"+a.getNome()+"\t"+a.getTipoIngresso()+"\t"+a.getTipoIngresso()+"\t"+a.getCurso());
        }
        //cancelar();
    }
    public void relAnoIngresso(){
        for(Aluno a: alunos){
            if(a.getAnoIgresso()== ano)
                taSaida.append("\n\t"+a.getCodigo()+"\t"+a.getNome()+"\t"+a.getTipoIngresso()+"\t"+a.getTipoIngresso()+"\t"+a.getCurso());
        }
        
    }
//    public void relGeral(){
//        for(Aluno a: alunos)
//            taSaida.append("\n\t"+a.getCodigo()+"\t"+a.getNome()+"\t"+a.getTipoIngresso()+"\t"+a.getTipoIngresso()+"\t"+a.getCurso());
//    
//    }
    public void limpar(){
        taSaida.setText(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        radioCurso = new javax.swing.JRadioButton();
        radioTipoIngresso = new javax.swing.JRadioButton();
        radioAnoIngresso = new javax.swing.JRadioButton();
        radioGeral = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));

        buttonGroup1.add(radioCurso);
        radioCurso.setText("Curso");
        radioCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCursoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTipoIngresso);
        radioTipoIngresso.setText("Tipo de Ingresso");
        radioTipoIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipoIngressoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioAnoIngresso);
        radioAnoIngresso.setText("Ano de Ingresso");
        radioAnoIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAnoIngressoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioGeral);
        radioGeral.setText("Relatório Geral");
        radioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGeralActionPerformed(evt);
            }
        });

        jLabel1.setText("Opções de Relatório");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioAnoIngresso)
                            .addComponent(radioCurso)
                            .addComponent(radioTipoIngresso)
                            .addComponent(radioGeral))
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimpar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioAnoIngresso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioTipoIngresso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioGeral)
                                .addGap(0, 441, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGeralActionPerformed
        for(Aluno a: alunos)
            taSaida.append("\n\t"+a.getCodigo()+"\t"+a.getNome()+"\t"+a.getTipoIngresso()+"\t"+a.getTipoIngresso()+"\t"+a.getCurso());
        //limpar();
    }//GEN-LAST:event_radioGeralActionPerformed

    private void radioAnoIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAnoIngressoActionPerformed
        curso = JOptionPane.showInputDialog("Informe o ano a ser pesquisado.");
        relAnoIngresso();
        limpar();
    }//GEN-LAST:event_radioAnoIngressoActionPerformed

    private void radioCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCursoActionPerformed
        curso = JOptionPane.showInputDialog("Informe o curso a ser pesquisado.");
        relPorCurso();
        limpar();
    }//GEN-LAST:event_radioCursoActionPerformed

    private void radioTipoIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipoIngressoActionPerformed
        tipoIngresso = JOptionPane.showInputDialog("Informe o tipo de ingresso.");
        relTipoIngresso();
        limpar();
    }//GEN-LAST:event_radioTipoIngressoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton radioAnoIngresso;
    private javax.swing.JRadioButton radioCurso;
    private javax.swing.JRadioButton radioGeral;
    private javax.swing.JRadioButton radioTipoIngresso;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
