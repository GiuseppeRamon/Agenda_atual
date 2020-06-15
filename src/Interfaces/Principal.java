/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Contato.Agenda;
import Contato.Contato;
import Pessoa.PessoaFisica;
import Pessoa.PessoaJuridica;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public final class Principal extends javax.swing.JFrame {

    Agenda agenda = new Agenda();

    public Principal() {
        setIcon();
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dataSistema = new Date();
        lData.setText(sdf.format(dataSistema));

        Timer timer = new Timer(1000, new hora());
        timer.start();
        BtNovoContato.setEnabled(true);
        BtAlterar.setEnabled(false);
        BtExcluirContato.setEnabled(false);
        BtSalvaContato.setEnabled(false);
        BtExcluirContato.setEnabled(false);
        BtCancelar.setEnabled(false);
        habilitaCaixdetexto(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtNome = new javax.swing.JTextField();
        LbNome = new javax.swing.JLabel();
        TxtCpfCnpj = new javax.swing.JTextField();
        LbCpfCnpj = new javax.swing.JLabel();
        RdPessoaFisica = new javax.swing.JRadioButton();
        RdPessoaJuridica = new javax.swing.JRadioButton();
        LbTelefone = new javax.swing.JLabel();
        LbEmail = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        BtNovoContato = new javax.swing.JButton();
        BtLimparContato = new javax.swing.JButton();
        BtExcluirContato = new javax.swing.JButton();
        BtSalvaContato = new javax.swing.JButton();
        TxtTelefone = new javax.swing.JTextField();
        JScrollTabelaContato = new javax.swing.JScrollPane();
        TbPessoa = new javax.swing.JTable();
        lData = new javax.swing.JLabel();
        lHora = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtCancelar = new javax.swing.JButton();
        BtAlterar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoa");
        setResizable(false);

        TxtNome.setAutoscrolls(false);
        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        LbNome.setText("Nome");

        TxtCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCpfCnpjActionPerformed(evt);
            }
        });

        LbCpfCnpj.setText("CPF-CNPJ");

        RdPessoaFisica.setText("Pessoa Física");
        RdPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdPessoaFisicaActionPerformed(evt);
            }
        });

        RdPessoaJuridica.setText("Pessoa Jurídica");
        RdPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdPessoaJuridicaActionPerformed(evt);
            }
        });

        LbTelefone.setText("Telefone");

        LbEmail.setText("Email");

        TxtEmail.setAutoscrolls(false);

        BtNovoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        BtNovoContato.setText("Novo");
        BtNovoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoContatoActionPerformed(evt);
            }
        });

        BtLimparContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fechar.png"))); // NOI18N
        BtLimparContato.setText("Limpar");
        BtLimparContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparContatoActionPerformed(evt);
            }
        });

        BtExcluirContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        BtExcluirContato.setText("Excluir");
        BtExcluirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirContatoActionPerformed(evt);
            }
        });

        BtSalvaContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        BtSalvaContato.setText("Salvar");
        BtSalvaContato.setDefaultCapable(false);
        BtSalvaContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvaContatoActionPerformed(evt);
            }
        });

        TbPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "Código"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbPessoaMouseClicked(evt);
            }
        });
        TbPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TbPessoaKeyReleased(evt);
            }
        });
        JScrollTabelaContato.setViewportView(TbPessoa);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fechar.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setMaximumSize(new java.awt.Dimension(87, 41));
        jButton1.setMinimumSize(new java.awt.Dimension(87, 41));
        jButton1.setPreferredSize(new java.awt.Dimension(87, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Data:");

        jLabel2.setText("Hora:");

        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        BtAlterar.setText("Alterar");
        BtAlterar.setToolTipText("");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/me.png"))); // NOI18N
        jButton2.setText("Sobre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbEmail)
                                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNome)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(RdPessoaJuridica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdPessoaFisica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LbCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbTelefone)
                    .addComponent(TxtCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(TxtTelefone)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lHora, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JScrollTabelaContato)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtExcluirContato, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtSalvaContato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtLimparContato, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdPessoaJuridica, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RdPessoaFisica)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lData, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lHora, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbNome)
                    .addComponent(LbCpfCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbEmail)
                    .addComponent(LbTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtLimparContato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtNovoContato)
                        .addComponent(BtExcluirContato)
                        .addComponent(BtSalvaContato)
                        .addComponent(BtCancelar)
                        .addComponent(BtAlterar)))
                .addGap(18, 18, 18)
                .addComponent(JScrollTabelaContato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RdPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdPessoaJuridicaActionPerformed
        if (RdPessoaJuridica.isSelected()) {
            LbCpfCnpj.setText("CNPJ");
            RdPessoaFisica.setEnabled(false);
            //RdPessoaFisica.setSelected(false);
        }
        if (!RdPessoaJuridica.isSelected()) {
            LbCpfCnpj.setText("CPF-CNPJ");
            RdPessoaFisica.setEnabled(true);
            //RdPessoaFisica.setSelected(true);
        }

    }//GEN-LAST:event_RdPessoaJuridicaActionPerformed

    private void BtLimparContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparContatoActionPerformed
        TxtNome.setText("");
        TxtCpfCnpj.setText("");
        TxtTelefone.setText("");
        TxtEmail.setText("");
        LbCpfCnpj.setText("CPF-CNPJ");
        RdPessoaFisica.setEnabled(true);
        RdPessoaJuridica.setEnabled(true);
        RdPessoaFisica.setSelected(false);
        RdPessoaJuridica.setSelected(false);
    }//GEN-LAST:event_BtLimparContatoActionPerformed

    private void BtSalvaContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvaContatoActionPerformed

        if (!RdPessoaFisica.isSelected() && !RdPessoaJuridica.isSelected()) {

            pessoaJDialog dialog = new pessoaJDialog(new javax.swing.JFrame(), true);
            dialog.setVisible(true);

        } else {
            if (TxtNome.getText().equals("") || TxtEmail.getText().equals("") || TxtCpfCnpj.getText().equals("") || TxtTelefone.getText().equals("")) {

                dadosJDialog dialog = new dadosJDialog(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            } else {
                String nome, codigo, telefone, email;
                telefone = TxtTelefone.getText();
                email = TxtEmail.getText();
                Contato contato = new Contato(email, telefone);
                nome = TxtNome.getText();
                codigo = TxtCpfCnpj.getText();
                if (RdPessoaFisica.isSelected()) {
                    PessoaFisica pessoa = new PessoaFisica(nome, codigo);
                    pessoa.setContato(contato);
                    agenda.addPessoa(pessoa);
                } else {
                    PessoaJuridica pessoa = new PessoaJuridica(nome, codigo);
                    pessoa.setContato(contato);
                    agenda.addPessoa(pessoa);
                }
                DefaultTableModel dtb = (DefaultTableModel) TbPessoa.getModel();
                Object[] pessoas = {TxtNome.getText(), TxtTelefone.getText(), TxtEmail.getText(), TxtCpfCnpj.getText()};
                dtb.addRow(pessoas);
                BtNovoContatoActionPerformed(evt);
                habilitaBotoes(true);
                BtAlterar.setEnabled(false);
                habilitaCaixdetexto(true);

            }

        }


    }//GEN-LAST:event_BtSalvaContatoActionPerformed

    private void BtNovoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoContatoActionPerformed
        habilitaBotoes(false);
        habilitaCaixdetexto(false);
        BtLimparContato.setEnabled(true);
        BtExcluirContato.setEnabled(false);
        BtLimparContatoActionPerformed(evt);

    }//GEN-LAST:event_BtNovoContatoActionPerformed

    private void RdPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdPessoaFisicaActionPerformed
        if (RdPessoaFisica.isSelected()) {
            //RdPessoaFisica.setEnabled(true);
            LbCpfCnpj.setText("CPF");
            //RdPessoaJuridica.setSelected(false);
            RdPessoaJuridica.setEnabled(false);
        }
        if (!RdPessoaFisica.isSelected()) {
            LbCpfCnpj.setText("CPF-CNPJ");
            //RdPessoaJuridica.setSelected(true);
            RdPessoaJuridica.setEnabled(true);
        }
    }//GEN-LAST:event_RdPessoaFisicaActionPerformed

    private void BtExcluirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirContatoActionPerformed

        if (TbPessoa.getSelectedRow() != -1) {
            for (int i = 0; i > agenda.getPessoas().size(); i++) {
                if (agenda.getPessoas().get(i) instanceof PessoaFisica) {
                    PessoaFisica pessoa = (PessoaFisica) agenda.getPessoas().get(i);
                    if (pessoa.getCpf().equals((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 2))) {
                        agenda.removePessoa(pessoa);
                    }
                } else {
                    PessoaJuridica pessoa = (PessoaJuridica) agenda.getPessoas().get(i);
                    if (pessoa.getCnpj().equals((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 2))) {
                        agenda.removePessoa(pessoa);
                    }
                }
            }
            DefaultTableModel dtb = (DefaultTableModel) TbPessoa.getModel();
            dtb.removeRow(TbPessoa.getSelectedRow());

        }
        if (TbPessoa.getSelectedRow() <= 0) {
            BtNovoContato.setEnabled(true);
            BtAlterar.setEnabled(false);
            BtSalvaContato.setEnabled(false);
            BtExcluirContato.setEnabled(false);
            BtCancelar.setEnabled(false);
            BtLimparContato.setEnabled(false);
            habilitaCaixdetexto(true);

        }
    }//GEN-LAST:event_BtExcluirContatoActionPerformed

    private void TbPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbPessoaMouseClicked
        if (TbPessoa.getSelectedRow() != -1) {
            habilitaCaixdetexto(false);
            BtAlterar.setEnabled(true);
            BtExcluirContato.setEnabled(true);
            BtLimparContato.setEnabled(true);
            BtCancelar.setEnabled(true);
            TxtNome.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 0));
            TxtTelefone.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 1));
            TxtEmail.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 2));
            TxtCpfCnpj.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 3));

        }
    }//GEN-LAST:event_TbPessoaMouseClicked

    private void TbPessoaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TbPessoaKeyReleased
        if (TbPessoa.getSelectedRow() != -1) {
            habilitaCaixdetexto(false);
            BtAlterar.setEnabled(true);
            BtExcluirContato.setEnabled(true);
            BtLimparContato.setEnabled(true);
            BtCancelar.setEnabled(true);
            TxtNome.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 0));
            TxtEmail.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 2));
            TxtCpfCnpj.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 3));
            TxtTelefone.setText((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 1));
        } else {
            BtAlterar.setEnabled(false);
            BtExcluirContato.setEnabled(false);
        }
    }//GEN-LAST:event_TbPessoaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sairJDialog dialog = new sairJDialog(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        habilitaBotoes(true);
        habilitaCaixdetexto(true);
        BtAlterar.setEnabled(false);
        RdPessoaFisica.setEnabled(true);
        RdPessoaJuridica.setEnabled(true);
        RdPessoaFisica.setSelected(false);
        RdPessoaJuridica.setSelected(false);

    }//GEN-LAST:event_BtCancelarActionPerformed

    private void TxtCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCpfCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCpfCnpjActionPerformed

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed

    }//GEN-LAST:event_TxtNomeActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed

        if (TbPessoa.getSelectedRow() != -1) {
            for (int i = 0; i > agenda.getPessoas().size(); i++) {
                if (agenda.getPessoas().get(i) instanceof PessoaFisica) {
                    PessoaFisica pessoa = (PessoaFisica) agenda.getPessoas().get(i);
                    if (pessoa.getCpf().equals((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 2))) {
                        pessoa.setNome(TxtNome.getText());
                        pessoa.getContato().setEmail(TxtEmail.getText());
                        pessoa.getContato().setTelefone(TxtTelefone.getText());
                    }
                } else {
                    PessoaJuridica pessoa = (PessoaJuridica) agenda.getPessoas().get(i);
                    if (pessoa.getCnpj().equals((String) TbPessoa.getValueAt(TbPessoa.getSelectedRow(), 2))) {
                        pessoa.setNome(TxtNome.getText());
                        pessoa.getContato().setEmail(TxtEmail.getText());
                        pessoa.getContato().setTelefone(TxtTelefone.getText());
                    }
                }
            }
        }
        TbPessoa.setValueAt(TxtNome.getText(), TbPessoa.getSelectedRow(), 0);
        TbPessoa.setValueAt(TxtTelefone.getText(), TbPessoa.getSelectedRow(), 1);
        TbPessoa.setValueAt(TxtEmail.getText(), TbPessoa.getSelectedRow(), 2);
        TbPessoa.setValueAt(TxtCpfCnpj.getText(), TbPessoa.getSelectedRow(), 3);
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sobreDialog dialog = new sobreDialog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    public void habilitaBotoes(boolean estado) {
        BtNovoContato.setEnabled(estado);
        BtAlterar.setEnabled(estado);
        BtSalvaContato.setEnabled(!estado);
        BtExcluirContato.setEnabled(!estado);
        BtCancelar.setEnabled(!estado);
    }

    public void habilitaCaixdetexto(boolean estado2) {
        TxtCpfCnpj.setEnabled(!estado2);
        TxtNome.setEnabled(!estado2);
        TxtEmail.setEnabled(!estado2);
        TxtTelefone.setEnabled(!estado2);
        BtLimparContato.setEnabled(false);
        RdPessoaJuridica.setSelected(false);
        RdPessoaJuridica.setEnabled(false);
        RdPessoaFisica.setSelected(false);
        RdPessoaFisica.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtExcluirContato;
    private javax.swing.JButton BtLimparContato;
    private javax.swing.JButton BtNovoContato;
    private javax.swing.JButton BtSalvaContato;
    private javax.swing.JScrollPane JScrollTabelaContato;
    private javax.swing.JLabel LbCpfCnpj;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbNome;
    private javax.swing.JLabel LbTelefone;
    private javax.swing.JRadioButton RdPessoaFisica;
    private javax.swing.JRadioButton RdPessoaJuridica;
    private javax.swing.JTable TbPessoa;
    private javax.swing.JTextField TxtCpfCnpj;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lData;
    private javax.swing.JLabel lHora;
    // End of variables declaration//GEN-END:variables

    public class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            lHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
