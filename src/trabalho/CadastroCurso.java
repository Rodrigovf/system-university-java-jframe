package trabalho;

import javax.swing.JOptionPane;
import static trabalho.FormMenuPrincipal.cursos;

public class CadastroCurso extends javax.swing.JInternalFrame {

    Curso cPesq;

    public CadastroCurso() {
        initComponents();
        tfCodigoCurso.setDocument(new LimitaTecla());
        tfCargaHorariaC.setDocument(new LimitaTecla());
        diretoNoCodigo();
    }

    public void diretoNoCodigo() {

        cursos.add(new Curso(1, 500, "Direito", "Ciências Humanas e Sociais"));
        cursos.add(new Curso(2, 500, "Ciência da Computação", "Ciências Exatas e Tecnologia"));
        cursos.add(new Curso(3, 500, "Sistemas da Informação", "Ciências Exatas e Tecnologia"));
        cancelar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigoCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfNomeCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCargaHorariaC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxAreaConhecimento = new javax.swing.JComboBox<String>();
        btnInserir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Cursos");
        setAutoscrolls(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jLabel1.setText("Código:");

        tfCodigoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoCursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        tfNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCursoActionPerformed(evt);
            }
        });

        jLabel3.setText("Carga Horária:");

        jLabel4.setText("Área do Conhecimento:");

        cbxAreaConhecimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Ciências Agrárias", "Ciências Biológicas e da Saúde", "Ciências Exatas e Tecnologias", "Ciências Humanas e Sociais" }));

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

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCargaHorariaC, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxAreaConhecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnImprimir)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tfCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tfCargaHorariaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxAreaConhecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoCursoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        inserir();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void tfNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeCursoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        cursos.remove(cPesq);
        cancelar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        taSaida.setText(null);
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed
    public void cancelar() {
        tfNomeCurso.setText(null);
        tfCodigoCurso.setText(null);
        tfCargaHorariaC.setText(null);
        cbxAreaConhecimento.setSelectedIndex(0);

        btnInserir.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        taSaida.setText(cursos.toString());
    }

    public Curso existeCurso(int codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }

    public void inserir() {
        Curso c;
        if (tfCodigoCurso.getText().equals("") || tfNomeCurso.getText().equals("") || cbxAreaConhecimento.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            c = existeCurso(Integer.parseInt(tfCodigoCurso.getText()));
            if (c != null) {
                JOptionPane.showMessageDialog(null, "Curso já cadastrado!");
            } else {
                c = new Curso();
                c.setCodigo(Integer.parseInt(tfCodigoCurso.getText()));
                c.setNome(tfNomeCurso.getText());
                c.setTotalCargaH(Integer.parseInt(tfCargaHorariaC.getText()));
                c.setAreaConhecimento(cbxAreaConhecimento.getSelectedItem().toString());
                cursos.add(c);

                cancelar();
            }
        }
    }

    public void pesquisar() {
        if (tfCodigoCurso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o código do curso a ser pesquisada!");
        } else {
            cPesq = existeCurso(Integer.parseInt(tfCodigoCurso.getText()));
            if (cPesq == null) {
                JOptionPane.showMessageDialog(null, "Turma não localizada!");
            } else {
                tfCodigoCurso.setText(cPesq.getCodigo() + "");
                tfNomeCurso.setText(cPesq.getNome());
                tfCargaHorariaC.setText(cPesq.getTotalCargaH() + "");
                cbxAreaConhecimento.setSelectedItem(cPesq.getAreaConhecimento());

                btnInserir.setEnabled(false);
                btnPesquisar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }

    }

    public void alterar() {
        cPesq.setAreaConhecimento(cbxAreaConhecimento.getSelectedItem().toString());
        cPesq.setCodigo(Integer.parseInt(tfCodigoCurso.getText()));
        cPesq.setNome(tfNomeCurso.getText());
        cPesq.setTotalCargaH(Integer.parseInt(tfCargaHorariaC.getText()));

        cancelar();
    }

    public void imprimir() {
        for (Curso c : cursos) {
            taSaida.append(c.toString());

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cbxAreaConhecimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JTextField tfCargaHorariaC;
    private javax.swing.JTextField tfCodigoCurso;
    private javax.swing.JTextField tfNomeCurso;
    // End of variables declaration//GEN-END:variables
}
