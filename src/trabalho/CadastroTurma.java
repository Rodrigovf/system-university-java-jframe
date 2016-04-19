package trabalho;

import javax.swing.JOptionPane;
import static trabalho.FormMenuPrincipal.turmas;
import static trabalho.FormMenuPrincipal.disciplinas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mari Caramello
 */
public class CadastroTurma extends javax.swing.JInternalFrame{
    Relatorios rel=null;
    Turma tPesq;
    

    public CadastroTurma() {
        initComponents();
        diretoNoCodigo();
        for (Disciplina d : disciplinas)
            cbxDisc.addItem(d.getNomeDisciplina());
        tfNumTurma.setDocument(new LimitaTecla());
        tfQtdVagas.setDocument(new LimitaTecla());
    }

    public void diretoNoCodigo(){
     // (int numeroTurma, int quantVagas, String idTurno, String disciplina
        turmas.add(new Turma(5001, 50, "2N(segunda noite)", "Cultura Religiosa"));
        turmas.add(new Turma(5002, 50, "3T(terça tarde)", "Sociedade Contemporânea"));
        turmas.add(new Turma(5003, 50, "4M(quarta manhã)", "Comunicação e Expressão"));
        cancelar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNumTurma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfQtdVagas = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTurno = new javax.swing.JComboBox();
        cbxDisc = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Turmas");

        jLabel1.setText("Numero da turma:");

        jLabel2.setText("Quantidade de vagas:");

        tfQtdVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtdVagasActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jLabel4.setText("Disciplina:");

        jLabel5.setText("Horário:");

        cbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "2M(segunda manhã)", "2T(segunda tarde)", "2N(segunda noite)", "3M(terça manhã)", "3T(terça tarde)", "3N(terça noite)", "4M(quarta manhã)", "4T(quarta tarde)", "4N(quarta noite)", "5M(quinta manhã)", "5T(quinta tarde)", "5N(quinta noite)", "6M(sexta manhã)", "6T(sexta tarde)", "6N(sexta noite)", "7M(sábado manhã)", "7T(sábado tarde)" }));
        cbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTurnoActionPerformed(evt);
            }
        });

        cbxDisc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        cbxDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnImprimir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfQtdVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNumTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfQtdVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnImprimir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfQtdVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtdVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQtdVagasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserir();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        turmas.remove(tPesq);
        cancelar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        taSaida.setText(null);
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void cbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTurnoActionPerformed

    private void cbxDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiscActionPerformed
         
    }//GEN-LAST:event_cbxDiscActionPerformed
    public void cancelar() {
        tfNumTurma.setText(null);
        tfQtdVagas.setText(null);
        cbTurno.setSelectedIndex(0);
        btnInserir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        taSaida.setText(null);
        cbxDisc.setSelectedIndex(0);
    }

    public Turma existeTurma(int codigo) {
        for (Turma t : turmas) {
            if (t.getNumeroTurma() == codigo) {
                return t;
            }
        }
        return null;
    }

    public void inserir() {
        Turma t;
        if (tfNumTurma.getText().equals("") || tfQtdVagas.getText().equals("")||cbTurno.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            t = existeTurma(Integer.parseInt(tfNumTurma.getText()));
            if (t != null) {
                JOptionPane.showMessageDialog(null, "Turma já cadastrada!");
            } else {
                String turno = cbTurno.getSelectedItem().toString();
                String pos = cbxDisc.getSelectedItem().toString();//ESTÁ DIFERENDE DO E-MAIL QUE A TEACHER PASSOU
                t = new Turma();
                t.setNumeroTurma(Integer.parseInt(tfNumTurma.getText()));
                t.setQuantVagas(Integer.parseInt(tfQtdVagas.getText()));
                t.setDisciplina(pos);
               
                t.setIDturno(turno);
               
               // t.setIDturno(cbTurno.getSelectedIndex());
                turmas.add(t);
                //JOptionPane.showMessageDialog(null, turmas);
                cancelar();
            }
        }

    }

    public void pesquisar() {
        if (tfNumTurma.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o número da turma a ser pesquisada!");
        } else {
            tPesq = existeTurma(Integer.parseInt(tfNumTurma.getText()));
            if (tPesq == null) {
                JOptionPane.showMessageDialog(null, "Turma não localizada!");
            } else {
                tfNumTurma.setText(tPesq.getNumeroTurma() + "");
                tfQtdVagas.setText(tPesq.getQuantVagas() + "");
                cbxDisc.setSelectedItem(tPesq.getDisciplina());
                cbTurno.setSelectedItem(tPesq.getIDturno());
                btnInserir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
    }

    public void alterar() {
        String turno = cbTurno.getSelectedItem().toString();
        tPesq.setNumeroTurma(Integer.parseInt(tfNumTurma.getText()));
        tPesq.setQuantVagas(Integer.parseInt(tfQtdVagas.getText()));
        tPesq.setIDturno(turno);

        cancelar();
    }

    public void imprimir() {
        for (Turma t : turmas) {
            taSaida.append(t.toString() + "\n");

        }
    }

    
    public void incrementaCombo() {
        cbxDisc.removeAllItems();
        disciplinas.stream().forEach((d) -> {
            cbxDisc.addItem(d); //addItem(d); //ADICIONO OS OBJETOS DA LISTA
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cbTurno;
    private javax.swing.JComboBox cbxDisc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfNumTurma;
    private javax.swing.JTextField tfQtdVagas;
    // End of variables declaration//GEN-END:variables
}
