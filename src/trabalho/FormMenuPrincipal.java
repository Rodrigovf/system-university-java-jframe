package trabalho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
/**
 *
 * @author Mari Caramello
 */
public class FormMenuPrincipal extends javax.swing.JFrame {
    static ArrayList<Disciplina> disciplinas = new ArrayList();
    static ArrayList<Turma> turmas = new ArrayList();
    static ArrayList<Professor> professores = new ArrayList();
    static ArrayList<Curso> cursos = new ArrayList();
    static ArrayList<Pessoa> pessoas = new ArrayList();
    static ArrayList<Aluno> alunos = new ArrayList();
    static ArrayList<Coordenador> coordenadores = new ArrayList(); //EM OBSERVAÇÃO
   // Relatorios rel = null;
    RelatorioAluno relAluno = null;
    RelatorioCurso relCurso = null;
    RelatorioDisciplina relDisc = null;
    RelatorioProfessor relProf = null;
    RelatorioTurma relTurma = null;
    public FormMenuPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemDisciplina = new javax.swing.JMenuItem();
        itemTurma = new javax.swing.JMenuItem();
        itemCurso = new javax.swing.JMenuItem();
        itemProfessor = new javax.swing.JMenuItem();
        itemAluno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRelAluno = new javax.swing.JMenuItem();
        menuRelCurso = new javax.swing.JMenuItem();
        menuRelDisciplina = new javax.swing.JMenuItem();
        menuRelProfessor = new javax.swing.JMenuItem();
        menuRelTurma = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1300, 750));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        itemDisciplina.setText("Disciplina");
        itemDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDisciplinaActionPerformed(evt);
            }
        });
        jMenu1.add(itemDisciplina);

        itemTurma.setText("Turma");
        itemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTurmaActionPerformed(evt);
            }
        });
        jMenu1.add(itemTurma);

        itemCurso.setText("Curso");
        itemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCursoActionPerformed(evt);
            }
        });
        jMenu1.add(itemCurso);

        itemProfessor.setText("Professor");
        itemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfessorActionPerformed(evt);
            }
        });
        jMenu1.add(itemProfessor);

        itemAluno.setText("Aluno");
        itemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(itemAluno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        menuRelAluno.setText("Aluno");
        menuRelAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelAlunoActionPerformed(evt);
            }
        });
        jMenu2.add(menuRelAluno);

        menuRelCurso.setText("Curso");
        menuRelCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelCursoActionPerformed(evt);
            }
        });
        jMenu2.add(menuRelCurso);

        menuRelDisciplina.setText("Disciplina");
        menuRelDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelDisciplinaActionPerformed(evt);
            }
        });
        jMenu2.add(menuRelDisciplina);

        menuRelProfessor.setText("Professor");
        menuRelProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelProfessorActionPerformed(evt);
            }
        });
        jMenu2.add(menuRelProfessor);

        menuRelTurma.setText("Turma");
        menuRelTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelTurmaActionPerformed(evt);
            }
        });
        jMenu2.add(menuRelTurma);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDisciplinaActionPerformed
        CadastroDisciplina ifCad = new CadastroDisciplina();
        this.jDesktopPane1.add(ifCad);
        ifCad.show();
    }//GEN-LAST:event_itemDisciplinaActionPerformed

    private void itemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTurmaActionPerformed
        CadastroTurma ifCad = new CadastroTurma();
        this.jDesktopPane1.add(ifCad);
        ifCad.show();
    }//GEN-LAST:event_itemTurmaActionPerformed

    private void itemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfessorActionPerformed
        CadastroProfessor ifCad = new CadastroProfessor();
        this.jDesktopPane1.add(ifCad);
        ifCad.show();
    }//GEN-LAST:event_itemProfessorActionPerformed

    private void itemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCursoActionPerformed
        CadastroCurso ifCad = new CadastroCurso();
        this.jDesktopPane1.add(ifCad);
        ifCad.show();
    }//GEN-LAST:event_itemCursoActionPerformed

    private void itemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunoActionPerformed
        CadastroAluno ifCad = new CadastroAluno();
        this.jDesktopPane1.add(ifCad);
        ifCad.show();
    }//GEN-LAST:event_itemAlunoActionPerformed

    private void menuRelTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelTurmaActionPerformed
        if (relTurma == null)
        relTurma = new RelatorioTurma();

        relTurma.setVisible(true);
    }//GEN-LAST:event_menuRelTurmaActionPerformed

    private void menuRelProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelProfessorActionPerformed
        if (relProf == null)
        relProf = new RelatorioProfessor();

        relProf.setVisible(true);
    }//GEN-LAST:event_menuRelProfessorActionPerformed

    private void menuRelDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelDisciplinaActionPerformed
        if (relDisc == null)
        relDisc = new RelatorioDisciplina();

        relDisc.setVisible(true);
    }//GEN-LAST:event_menuRelDisciplinaActionPerformed

    private void menuRelCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelCursoActionPerformed
        if (relCurso == null)
        relCurso = new RelatorioCurso();

        relCurso.setVisible(true);

    }//GEN-LAST:event_menuRelCursoActionPerformed

    private void menuRelAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelAlunoActionPerformed
        if (relAluno == null)
        relAluno = new RelatorioAluno();

        relAluno.setVisible(true);
    }//GEN-LAST:event_menuRelAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAluno;
    private javax.swing.JMenuItem itemCurso;
    private javax.swing.JMenuItem itemDisciplina;
    private javax.swing.JMenuItem itemProfessor;
    private javax.swing.JMenuItem itemTurma;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuRelAluno;
    private javax.swing.JMenuItem menuRelCurso;
    private javax.swing.JMenuItem menuRelDisciplina;
    private javax.swing.JMenuItem menuRelProfessor;
    private javax.swing.JMenuItem menuRelTurma;
    // End of variables declaration//GEN-END:variables
}
