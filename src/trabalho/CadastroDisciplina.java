package trabalho;

import javax.swing.JOptionPane;
import static trabalho.FormMenuPrincipal.disciplinas;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import static aula6.FormMenu.funcionarios;
public class CadastroDisciplina extends javax.swing.JInternalFrame {
    Relatorios rel=null;
    Disciplina dPesq;
    CadastroTurma t = new CadastroTurma();

    public CadastroDisciplina() {
        initComponents();
        diretoNoCodigo();
        tfCodigoDisciplina.setDocument(new LimitaTecla());
        tfQCred.setDocument(new LimitaTecla());
    }
    
    public void diretoNoCodigo(){
        //public Disciplina (int codigoDisciplina, int qtdCredito, String nomeDisciplina)
        disciplinas.add(new Disciplina(1001, 68, "Cultura Religiosa"));
        disciplinas.add(new Disciplina(1002, 68, "Sociedade Contemporânea"));
        disciplinas.add(new Disciplina(1003, 68, "Comunicação e Expressão"));
        cancelar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigoDisciplina = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNomeDisciplina = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        tfQCred = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Disciplinas");

        jLabel1.setText("Código disciplina:");

        tfCodigoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoDisciplinaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome da disciplina:");

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

        jLabel4.setText("Qtd. Créditos: ");

        jButton1.setText("Alterar Valor de Crédito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomeDisciplina)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQCred, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfQCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnInserir)
                    .addComponent(btnImprimir)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfCodigoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoDisciplinaActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        t.incrementaCombo();
        inserir();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        disciplinas.remove(dPesq);
        cancelar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed
    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        taSaida.setText(null);
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double valorCredito = Double.parseDouble(JOptionPane.showInputDialog("Valor do crédito:"));
        Disciplina.setvCredito(valorCredito);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    public void cancelar() {
        tfNomeDisciplina.setText(null);
        tfCodigoDisciplina.setText(null);
        
        tfQCred.setText(null);
        taSaida.setText(null);
        btnInserir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }

    //CRIEI DOIS EXIXSTE DISCIPLINA PRA TENTAR BUSCAR PELO NOME E CÓDIGO, PORÉM AINDA NÃO DEU CERTO. PESQUISA APENAS PELO NOME
    public Disciplina existeDisciplina(int codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigoDisciplina() == codigo) {
                return d;
            }
        }
        return null;
    }

    public Disciplina existeDisciplina(String nome) {
        for (Disciplina d : disciplinas) {
            if (d.getNomeDisciplina().equalsIgnoreCase(nome)) {
                return d;
            }
        }
        return null;

    }

    public void inserir() {
        
        Disciplina d;
        if ("".equals(tfCodigoDisciplina.getText()) || "".equals(tfNomeDisciplina.getText()) ||"".equals(tfQCred.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            
            if (existeDisciplina(tfNomeDisciplina.getText()) != null) {
                JOptionPane.showMessageDialog(null, "Disciplina já cadastrada!");
            } else {
                if(existeDisciplina(Integer.parseInt(tfCodigoDisciplina.getText())) != null)
                    JOptionPane.showMessageDialog(null, "Código já cadastrado!");
                else{
                d = new Disciplina();
                d.setNomeDisciplina(tfNomeDisciplina.getText());
                d.setCodigoDisciplina(Integer.parseInt(tfCodigoDisciplina.getText()));
                d.setQtdCredito(Integer.parseInt(tfQCred.getText()));
                
                disciplinas.add(d);
                JOptionPane.showMessageDialog(null, "Disciplina Cadastrada com sucesso!");
                cancelar();
                }
            }
        }
    }

    public void pesquisar() {
        if (tfNomeDisciplina.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite a disciplina a ser pesquisada!");
        } else {
            dPesq = existeDisciplina(tfNomeDisciplina.getText());
            if (dPesq == null) {
                JOptionPane.showMessageDialog(null, "Disciplina não localizada!");
            } else {
                tfNomeDisciplina.setText(dPesq.getNomeDisciplina());
                tfCodigoDisciplina.setText(dPesq.getCodigoDisciplina() + "");
                tfQCred.setText(dPesq.getQtdCredito()+"");
                btnInserir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
    }
    

    public void alterar() {
        dPesq.setNomeDisciplina(tfNomeDisciplina.getText());
        dPesq.setCodigoDisciplina(Integer.parseInt(tfCodigoDisciplina.getText()));
        dPesq.setQtdCredito(Integer.parseInt(tfQCred.getText()));
        

        cancelar();
    }

    public void imprimir() {
        for (Disciplina d : disciplinas) {
            taSaida.append(d.toString() + "\n");
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfCodigoDisciplina;
    private javax.swing.JTextField tfNomeDisciplina;
    private javax.swing.JTextField tfQCred;
    // End of variables declaration//GEN-END:variables
}
