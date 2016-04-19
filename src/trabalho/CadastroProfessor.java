package trabalho;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import static trabalho.FormMenuPrincipal.professores;
import static trabalho.FormMenuPrincipal.cursos;
import static trabalho.FormMenuPrincipal.coordenadores;
import static trabalho.FormMenuPrincipal.pessoas;

//import static trabalho.FormMenuPrincipal.coordenadores;


public class CadastroProfessor extends javax.swing.JInternalFrame {

    Professor pPesq;
    Coordenador cPesq;

    public CadastroProfessor() {
        initComponents();
        tfCargaHorariaP.setDocument(new LimitaTecla());
        tfCodigoProfessor.setDocument(new LimitaTecla());
        
        diretoNoCodigo();
        for (Curso c : cursos)
            cbxCurso.addItem(c.getNome());
//        for(Coordenador c : coordenadores)
//            cfkbCoordenador.add(Integer.parseInt(c.getGratificacao()+"");
    }
    public void diretoNoCodigo(){
     // int cargaHsemanal, double valorHoraAula, int codigo, String nome, String curso,boolean coordenador
        pessoas.add(new Professor(48, 65, 2001,  "Carlos", "Direito", false));
        pessoas.add(new Professor(48, 65, 2002, "Joana", "Ciência da Computação", false));
        pessoas.add(new Coordenador(10, 48, 65, 2003, "Bruno", "Ciência da Computação", true));
        cancelar();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigoProfessor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNomeProfessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCargaHorariaP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxCurso = new javax.swing.JComboBox<String>();
        btnInserir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        ckbCoordenador = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        tfValorHora = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Professor");

        jLabel1.setText("Código:");

        tfCodigoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoProfessorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Carga Horária:");

        jLabel4.setText("Curso:");

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

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

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

        ckbCoordenador.setText("Coordenador");
        ckbCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbCoordenadorActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Hora:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeProfessor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 37, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
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
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCargaHorariaP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ckbCoordenador)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 209, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCargaHorariaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbCoordenador)
                    .addComponent(jLabel5)
                    .addComponent(tfValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInserir)
                        .addComponent(btnPesquisar)
                        .addComponent(btnExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterar)
                        .addComponent(btnImprimir)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoProfessorActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserir();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        professores.remove(pPesq);
        cancelar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        taSaida.setText(null);
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void ckbCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbCoordenadorActionPerformed
        cPesq.setGratificacao(Integer.parseInt(JOptionPane.showInputDialog("Percentual de gratificação:")));
    }//GEN-LAST:event_ckbCoordenadorActionPerformed
    
    
    public void cancelar() {
        tfNomeProfessor.setText(null);
        tfCodigoProfessor.setText(null);
        tfCargaHorariaP.setText(null);
        //cbxCurso.setSelectedIndex(0);
        tfValorHora.setText(null);
        ckbCoordenador.setSelected(false);
        btnInserir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        taSaida.setText(null);
    }

    
    public Professor existeProfessor(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
    
    public Professor codProfessor(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
    
    
    public void inserir() {
        Professor p;
        if (tfNomeProfessor.getText().equals("")||tfCodigoProfessor.getText().equals("")||cbxCurso.getSelectedItem().toString().equals("")||tfCargaHorariaP.getText().equals("")||tfValorHora.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            p = existeProfessor(tfNomeProfessor.getText());
            if (p != null) {
                JOptionPane.showMessageDialog(null, "Professor já cadastrado!");
            } else {
                String pos = cbxCurso.getSelectedItem().toString();//ESTÁ DIFERENDE DO E-MAIL QUE A TEACHER PASSOU
                p = new Professor();
                p.setNome(tfNomeProfessor.getText());
                p.setCodigo(Integer.parseInt(tfCodigoProfessor.getText()));
                p.setCargaHsemanal(Integer.parseInt(tfCargaHorariaP.getText()));
                //p.setSalario(Double.parseDouble(tfSalario.getText()));
                p.setValorHoraAula(Double.parseDouble(tfValorHora.getText()));
                p.setCurso(pos);
                p.setCoordenador(ckbCoordenador.isSelected());                         
                professores.add(p);
                cancelar();
                
            }
        }
    }
    
    
    public void pesquisar(){
       if (tfNomeProfessor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o nome do professor a ser pesquisado!");
        } else {
            pPesq = existeProfessor(tfNomeProfessor.getText());
            if (pPesq == null) {
                JOptionPane.showMessageDialog(null, "Professor não localizado!");
            } else {
                tfCodigoProfessor.setText(pPesq.getCodigo() + "");
                tfNomeProfessor.setText(pPesq.getNome());
                tfCargaHorariaP.setText(pPesq.getCargaHsemanal()+ "");
                tfValorHora.setText(pPesq.getValorHoraAula()+"");
                ckbCoordenador.setSelected(pPesq.getCoordenador());
                cbxCurso.setSelectedItem(pPesq.getCurso());
                
                btnInserir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
    }
    
    
    public void alterar() {
        pPesq.setCurso(cbxCurso.getSelectedItem().toString());
        pPesq.setCodigo(Integer.parseInt(tfCodigoProfessor.getText()));
        pPesq.setNome(tfNomeProfessor.getText());
        pPesq.setCargaHsemanal(Integer.parseInt(tfCargaHorariaP.getText()));
        pPesq.setValorHoraAula(Double.parseDouble(tfValorHora.getText()));
        
        cancelar();
    }
    
    
    public void imprimir() {
        for (Professor p : professores) {
            taSaida.append(p.toString() + "\n");
        }
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JCheckBox ckbCoordenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfCargaHorariaP;
    private javax.swing.JTextField tfCodigoProfessor;
    private javax.swing.JTextField tfNomeProfessor;
    private javax.swing.JTextField tfValorHora;
    // End of variables declaration//GEN-END:variables
}
