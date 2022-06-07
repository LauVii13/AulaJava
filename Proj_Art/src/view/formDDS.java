package view;

import control.controleClient;
import control.controlePintura;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Client;
import model.Pintura;

public class formDDS extends javax.swing.JFrame {

    private DefaultTableModel tblC;
    private DefaultTableModel tblP;
    String excluirC;
    String excluirP;
    
    public formDDS() {
        tblC = new DefaultTableModel();
        tblP = new DefaultTableModel();   
        
        tblC.addColumn("ID");
        tblC.addColumn("Nome");
        tblC.addColumn("Usuário");
        tblC.addColumn("Email");
        tblC.addColumn("Senha");
        tblC.addColumn("Idade");
        
        tblC.setNumRows(0);
        
        tblP.addColumn("ID");
        tblP.addColumn("Nome");
        tblP.addColumn("Autor");
        tblP.addColumn("Desc");
        tblP.addColumn("Estilo");
        tblP.addColumn("Largura");
        tblP.addColumn("Altura");
        tblP.addColumn("Preço");

        tblP.setNumRows(0);

        initComponents();
        this.setLocationRelativeTo(null);   
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ac = new javax.swing.JLabel();
        bntVolta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClient = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPintura = new javax.swing.JTable();
        btnExcluirC = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnExcluirP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNameC = new javax.swing.JButton();
        btnUserC = new javax.swing.JButton();
        btnEmailC = new javax.swing.JButton();
        btnIdC = new javax.swing.JButton();
        btnNameP = new javax.swing.JButton();
        btnAutorP = new javax.swing.JButton();
        btnIdP = new javax.swing.JButton();
        btnDescP = new javax.swing.JButton();
        btnFVelhoC = new javax.swing.JButton();
        btnFNovoC = new javax.swing.JButton();
        btnFVidadeC = new javax.swing.JButton();
        btnFMediaC = new javax.swing.JButton();
        btnFCaroP = new javax.swing.JButton();
        btnFBaratoP = new javax.swing.JButton();
        btnFMediaP = new javax.swing.JButton();
        btnFAcMediaP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ac.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        ac.setText("Dados do Sistema");

        bntVolta.setText("Voltar");
        bntVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltaActionPerformed(evt);
            }
        });

        tblClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Usuário", "Email", "Senha", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClient);

        tblPintura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Estilo", "Autor", "Desc", "Largura", "Altura", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPintura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPinturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPintura);

        btnExcluirC.setText("Exclusão Cliente");
        btnExcluirC.setEnabled(false);
        btnExcluirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCActionPerformed(evt);
            }
        });

        txtPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesquisaFocusLost(evt);
            }
        });

        btnExcluirP.setText("Exclusão Obra");
        btnExcluirP.setEnabled(false);
        btnExcluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Busca:");

        btnNameC.setText("Nome Cliente");
        btnNameC.setEnabled(false);
        btnNameC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameCActionPerformed(evt);
            }
        });

        btnUserC.setText("Usuário Cliente");
        btnUserC.setEnabled(false);
        btnUserC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserCActionPerformed(evt);
            }
        });

        btnEmailC.setText("Email Cliente");
        btnEmailC.setEnabled(false);
        btnEmailC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailCActionPerformed(evt);
            }
        });

        btnIdC.setText("ID Cliente");
        btnIdC.setEnabled(false);
        btnIdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdCActionPerformed(evt);
            }
        });

        btnNameP.setText("Nome Obra");
        btnNameP.setEnabled(false);
        btnNameP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNamePActionPerformed(evt);
            }
        });

        btnAutorP.setText("Autor Obra");
        btnAutorP.setEnabled(false);
        btnAutorP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorPActionPerformed(evt);
            }
        });

        btnIdP.setText("ID Obra");
        btnIdP.setEnabled(false);
        btnIdP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdPActionPerformed(evt);
            }
        });

        btnDescP.setText("Descrição Obra");
        btnDescP.setEnabled(false);
        btnDescP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescPActionPerformed(evt);
            }
        });

        btnFVelhoC.setText("C > Idade");
        btnFVelhoC.setEnabled(false);
        btnFVelhoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFVelhoCActionPerformed(evt);
            }
        });

        btnFNovoC.setText("C < Idade");
        btnFNovoC.setEnabled(false);
        btnFNovoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFNovoCActionPerformed(evt);
            }
        });

        btnFVidadeC.setText("Verif Idade");
        btnFVidadeC.setEnabled(false);
        btnFVidadeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFVidadeCActionPerformed(evt);
            }
        });

        btnFMediaC.setText("Média Idades");
        btnFMediaC.setEnabled(false);
        btnFMediaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFMediaCActionPerformed(evt);
            }
        });

        btnFCaroP.setText("P > Valor");
        btnFCaroP.setToolTipText("");
        btnFCaroP.setEnabled(false);
        btnFCaroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFCaroPActionPerformed(evt);
            }
        });

        btnFBaratoP.setText("P < Valor");
        btnFBaratoP.setEnabled(false);
        btnFBaratoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFBaratoPActionPerformed(evt);
            }
        });

        btnFMediaP.setText("Média Preço");
        btnFMediaP.setEnabled(false);
        btnFMediaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFMediaPActionPerformed(evt);
            }
        });

        btnFAcMediaP.setText("Valor > Média");
        btnFAcMediaP.setEnabled(false);
        btnFAcMediaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAcMediaPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(ac))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnIdC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEmailC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNameC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUserC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNameP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAutorP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDescP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIdP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnFCaroP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFBaratoP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFMediaP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFAcMediaP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnExcluirP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnExcluirC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFVelhoC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFNovoC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFMediaC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFVidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addComponent(bntVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(ac)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNameC)
                            .addComponent(btnNameP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUserC)
                            .addComponent(btnAutorP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEmailC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDescP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIdC)
                            .addComponent(btnIdP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFCaroP)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFVelhoC)
                        .addComponent(btnFNovoC)
                        .addComponent(btnFMediaC)
                        .addComponent(btnFVidadeC)
                        .addComponent(btnFBaratoP)
                        .addComponent(btnFMediaP)
                        .addComponent(btnFAcMediaP)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirC)
                    .addComponent(btnExcluirP)
                    .addComponent(bntVolta))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){
        btnExcluirC.setEnabled(false);
        btnExcluirP.setEnabled(false);
        
        excluirC = "";
        excluirP = "";
        
        clearP();
        
        txtPesquisa.setText("");
    }
    
    public void clearP(){
        btnNameC.setEnabled(false);
        btnUserC.setEnabled(false);
        btnEmailC.setEnabled(false);
        btnIdC.setEnabled(false);
            
        btnNameP.setEnabled(false);
        btnAutorP.setEnabled(false);
        btnIdP.setEnabled(false);
        btnDescP.setEnabled(false);
    }
    
    private void bntVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltaActionPerformed
        JFrame j = new formArt();
        j.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntVoltaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mostrarC();
        mostrarP();
    }//GEN-LAST:event_formWindowOpened

    private void btnExcluirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o usuário de ID: " + excluirC);
       
        if(resp == 0)
        {
            controleClient.excluir(excluirC);
        }     
        
        mostrarC();
        clear();
    }//GEN-LAST:event_btnExcluirCActionPerformed

    private void tblClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientMouseClicked
        int linhaSelec = tblClient.getSelectedRow();
        excluirC = tblClient.getValueAt(linhaSelec, 0).toString();      
        btnExcluirC.setEnabled(true);
    }//GEN-LAST:event_tblClientMouseClicked

    private void btnExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir a obra de ID: " + excluirP);
       
        if(resp == 0)
        {
            controlePintura.excluir(excluirP);
        }        
        
        mostrarP();
        clear();
    }//GEN-LAST:event_btnExcluirPActionPerformed

    private void tblPinturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPinturaMouseClicked
        int linhaSelec = tblPintura.getSelectedRow();
        excluirP = tblPintura.getValueAt(linhaSelec, 0).toString();      
        btnExcluirP.setEnabled(true);
    }//GEN-LAST:event_tblPinturaMouseClicked

    private void btnNameCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        String resp = "";
        int aux = 0;
        
        for(Client c: listaC)
        {
            if(c.getName().startsWith(txtPesquisa.getText()) || c.getName().contains(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + c.getId() + " | Nome: " + c.getName() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "Cliente(s) com '" + txtPesquisa.getText() +"' no Nome:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum Cliente com '" + txtPesquisa.getText() +"' no Nome");
        }
        
    }//GEN-LAST:event_btnNameCActionPerformed

    private void btnUserCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        String resp = "";
        int aux = 0;
        
        for(Client c: listaC)
        {
            if(c.getUser().startsWith(txtPesquisa.getText()) || c.getUser().contains(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + c.getId() + " | Usúario: " + c.getUser() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "Cliente(s) com '" + txtPesquisa.getText() +"' em Usuário:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum Cliente com '" + txtPesquisa.getText() +"' em Usuário");
        }
    }//GEN-LAST:event_btnUserCActionPerformed

    private void btnEmailCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        String resp = "";
        int aux = 0;
        
        for(Client c: listaC)
        {
            if(c.getEmail().startsWith(txtPesquisa.getText()) || c.getEmail().contains(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + c.getId() + " | Email: " + c.getEmail() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "Cliente(s) com '" + txtPesquisa.getText() +"' no Email:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum Cliente com '" + txtPesquisa.getText() +"' no Email");
        }
    }//GEN-LAST:event_btnEmailCActionPerformed

    private void btnIdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        String resp = "";
        int aux = 0;
        
        for(Client c: listaC)
        {
            if(String.valueOf(c.getId()).trim().equals(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + c.getId() + " | Nome: " + c.getName() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "O Cliente com ID igual a '" + txtPesquisa.getText() +"' é:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhum Cliente com ID igual a '" + txtPesquisa.getText() +"'");
        }
    }//GEN-LAST:event_btnIdCActionPerformed

    private void btnNamePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNamePActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        String resp = "";
        int aux = 0;
        
        for(Pintura p: listaP)
        {
            if(p.getName().startsWith(txtPesquisa.getText()) || p.getName().contains(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + p.getId() + " | Nome: " + p.getName() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "Pintura(s) com '" + txtPesquisa.getText() +"' no Nome:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhuma Pintura com '" + txtPesquisa.getText() +"' no Nome");
        }
    }//GEN-LAST:event_btnNamePActionPerformed

    private void btnAutorPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorPActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        String resp = "";
        int aux = 0;
        
        for(Pintura p: listaP)
        {
            if(p.getAutor().startsWith(txtPesquisa.getText()) || p.getAutor().contains(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + p.getId() + " | Autor: " + p.getAutor() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "Pintura(s) com '" + txtPesquisa.getText() +"' no Autor:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhuma Pintura com '" + txtPesquisa.getText() +"' no Autor");
        }
    }//GEN-LAST:event_btnAutorPActionPerformed

    private void btnIdPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdPActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        String resp = "";
        int aux = 0;
        
        for(Pintura p: listaP)
        {
            if(String.valueOf(p.getId()).trim().equals(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + p.getId() + " | Nome: " + p.getAutor() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "O Pintura com ID igual a '" + txtPesquisa.getText() +"' é:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhuma Pintura com ID igual a '" + txtPesquisa.getText() +"'");
        }
    }//GEN-LAST:event_btnIdPActionPerformed

    private void btnDescPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescPActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        String resp = "";
        int aux = 0;
        
        for(Pintura p: listaP)
        {
            if(p.getDesc().startsWith(txtPesquisa.getText()) || p.getDesc().contains(txtPesquisa.getText()))
            {
                resp = resp + "ID: " + p.getId() + " | Desc: " + p.getDesc() + "\n";
                aux++;
            }
        }
        
        if(aux != 0)
        {
            JOptionPane.showMessageDialog(null, "Pintura(s) com '" + txtPesquisa.getText() +"' na Descrição:\n\n" + resp);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não foi encontrado nenhuma Pintura com '" + txtPesquisa.getText() +"' na Descrição");
        }
    }//GEN-LAST:event_btnDescPActionPerformed

    private void txtPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisaFocusLost
        if(!txtPesquisa.getText().equals("") && !txtPesquisa.getText().trim().equals(""))
        {
            btnNameC.setEnabled(true);
            btnUserC.setEnabled(true);
            btnEmailC.setEnabled(true);
            btnIdC.setEnabled(true);
            
            btnNameP.setEnabled(true);
            btnAutorP.setEnabled(true);
            btnIdP.setEnabled(true);
            btnDescP.setEnabled(true);

        }
        else{
            clearP();
        }
    }//GEN-LAST:event_txtPesquisaFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(!txtPesquisa.getText().equals("") && !txtPesquisa.getText().trim().equals(""))
        {
            btnNameC.setEnabled(true);
            btnUserC.setEnabled(true);
            btnEmailC.setEnabled(true);
            btnIdC.setEnabled(true);
            
            btnNameP.setEnabled(true);
            btnAutorP.setEnabled(true);
            btnIdP.setEnabled(true);
            btnDescP.setEnabled(true);

        }
        else{
            clearP();
        }
    }//GEN-LAST:event_formMouseClicked

    private void btnFVelhoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFVelhoCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        Client mVelho = new Client();
        
        for(Client c: listaC)
        {
            if(c.getAge()>mVelho.getAge())
            {
                mVelho = c;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O Cliente mais velho é: \n\nID: " + mVelho.getId() + " | Nome: " +  mVelho.getName() + " | Idade: " +  mVelho.getAge());
    }//GEN-LAST:event_btnFVelhoCActionPerformed

    private void btnFNovoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFNovoCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        Client mNovo = listaC.get(0);
        
        for(Client c: listaC)
        {
            if(c.getAge()<mNovo.getAge())
            {
                mNovo = c;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O Cliente mais novo é: \n\nID: " + mNovo.getId() + " | Nome: " +  mNovo.getName() + " | Idade: " +  mNovo.getAge());
    }//GEN-LAST:event_btnFNovoCActionPerformed

    
    private void btnFMediaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFMediaCActionPerformed
        DecimalFormat nF = new DecimalFormat("#.00");
        ArrayList <Client> listaC = controleClient.getConClient();
        double media = 0;
        int aux = 0;
        
        for(Client c: listaC)
        {
            media += c.getAge();
            aux++;
        }

        JOptionPane.showMessageDialog(null, "A média das idades dos Clientes é: " + nF.format(media/aux));
    }//GEN-LAST:event_btnFMediaCActionPerformed

    private void btnFVidadeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFVidadeCActionPerformed
        ArrayList <Client> listaC = controleClient.getConClient();
        int m60 = 0;
        int m18 = 0;
        int aux = 0;
        
        for(Client c: listaC)
        {
            if(c.getAge() >= 60)
            {
                m60++;
            }
            if(c.getAge() <= 18 )
            {
                m18++;
            }
                
            aux++;
        }
        
        JOptionPane.showMessageDialog(null, "60 | " + String.valueOf(m60) + " de " + String.valueOf(aux) +" Clientes tem mais que 60 anos\n18 | " + String.valueOf(m18) + " de " + String.valueOf(aux) +" Clientes tem menos que 18 anos");

    }//GEN-LAST:event_btnFVidadeCActionPerformed

    private void btnFCaroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFCaroPActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        Pintura mCaro = new Pintura();
        
        for(Pintura p: listaP)
        {
            if(p.getValue()>mCaro.getValue())
            {
                mCaro = p;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A Pintura mais cara é: \n\nID: " + mCaro.getId() + " | Nome: " +  mCaro.getName() + " | Preço: " +  mCaro.getValue());
    }//GEN-LAST:event_btnFCaroPActionPerformed

    private void btnFBaratoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFBaratoPActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        Pintura mBarato = listaP.get(0);
        
        for(Pintura p: listaP)
        {
            if(p.getValue()<mBarato.getValue())
            {
                mBarato = p;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A Pintura mais barata é: \n\nID: " + mBarato.getId() + " | Nome: " +  mBarato.getName() + " | Preço: " +  mBarato.getValue());
    }//GEN-LAST:event_btnFBaratoPActionPerformed

    public double mediaP()
    {
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        double media = 0;
        int aux = 0;
        
        for(Pintura p: listaP)
        {
            media += p.getValue();
            aux++;
        }
        
        return(media/aux);
    }
    
    private void btnFMediaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFMediaPActionPerformed
        DecimalFormat nF = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, "A média de Preço da(s) Pintura(s) é: " + nF.format(mediaP()));
    }//GEN-LAST:event_btnFMediaPActionPerformed

    private void btnFAcMediaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAcMediaPActionPerformed
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        String resp = "";
        
        for(Pintura p: listaP)
        {
            if(p.getValue()>mediaP())
            {
                resp = resp + "ID: " + p.getId() + " | Nome: " + p.getName() + " | Value: " + p.getValue()+ "\n";
            }
        }
        
        JOptionPane.showMessageDialog(null, "Pintura(s) acima da média de Preço:\n\n" + resp);
    }//GEN-LAST:event_btnFAcMediaPActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formDDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDDS().setVisible(true);
            }
        });
    }

    
    public void mostrarC(){
        tblC.setNumRows(0);
        
        ArrayList <Client> listaC = controleClient.getConClient();
        
        if(!listaC.isEmpty())
        {
            btnFVelhoC.setEnabled(true);
            btnFNovoC.setEnabled(true);
            btnFMediaC.setEnabled(true);
            btnFVidadeC.setEnabled(true);
        }
        else{
            btnFVelhoC.setEnabled(false);
            btnFNovoC.setEnabled(false);
            btnFMediaC.setEnabled(false);
            btnFVidadeC.setEnabled(false);
        }
                
        for(Client a : listaC)
        {
            tblC.addRow(new Object[]{a.getId(), a.getName(), a.getUser(), a.getEmail(), a.getPass(), a.getAge()});
        }
                
        tblClient.setModel(tblC);
    }
    
    public void mostrarP(){
        tblP.setNumRows(0);
        
        ArrayList <Pintura> listaP = controlePintura.getConPintura();
        
        if(!listaP.isEmpty())
        {
            btnFCaroP.setEnabled(true);
            btnFBaratoP.setEnabled(true);
            btnFMediaP.setEnabled(true);
            btnFAcMediaP.setEnabled(true);
        }
        else{
            btnFCaroP.setEnabled(false);
            btnFBaratoP.setEnabled(false);
            btnFMediaP.setEnabled(false);
            btnFAcMediaP.setEnabled(false);
        }
                
        for(Pintura a : listaP)
        {
            tblP.addRow(new Object[]{a.getId(), a.getName(), a.getStyle(), a.getAutor(), a.getDesc(), a.getSizeX(), a.getSizeY(), a.getValue()});
        }
                
        tblPintura.setModel(tblP);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac;
    private javax.swing.JButton bntVolta;
    private javax.swing.JButton btnAutorP;
    private javax.swing.JButton btnDescP;
    private javax.swing.JButton btnEmailC;
    private javax.swing.JButton btnExcluirC;
    private javax.swing.JButton btnExcluirP;
    private javax.swing.JButton btnFAcMediaP;
    private javax.swing.JButton btnFBaratoP;
    private javax.swing.JButton btnFCaroP;
    private javax.swing.JButton btnFMediaC;
    private javax.swing.JButton btnFMediaP;
    private javax.swing.JButton btnFNovoC;
    private javax.swing.JButton btnFVelhoC;
    private javax.swing.JButton btnFVidadeC;
    private javax.swing.JButton btnIdC;
    private javax.swing.JButton btnIdP;
    private javax.swing.JButton btnNameC;
    private javax.swing.JButton btnNameP;
    private javax.swing.JButton btnUserC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClient;
    private javax.swing.JTable tblPintura;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
