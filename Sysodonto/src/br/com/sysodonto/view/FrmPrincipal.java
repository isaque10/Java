/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Samsung
 */
public class FrmPrincipal extends javax.swing.JFrame {
    FormPaciente formPaciente = new FormPaciente();
    FormDentista formDentista = new FormDentista();
    FormRecepcionista formRecepcionista = new FormRecepcionista();
    FormConsulta formConsulta = new FormConsulta();
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDentista = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnRecepcionista = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        painel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysOdonto v1.0");
        setResizable(false);

        btnDentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dentista.png"))); // NOI18N
        btnDentista.setText("Dentista");
        btnDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDentistaActionPerformed(evt);
            }
        });

        btnProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prontuario.png"))); // NOI18N
        btnProntuario.setText("Prontuario");
        btnProntuario.setMaximumSize(new java.awt.Dimension(127, 59));
        btnProntuario.setMinimumSize(new java.awt.Dimension(127, 59));
        btnProntuario.setPreferredSize(new java.awt.Dimension(127, 59));
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        btnPaciente.setText("Paciente");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        btnRecepcionista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recepcionista.png"))); // NOI18N
        btnRecepcionista.setText("Recepcionista");
        btnRecepcionista.setAutoscrolls(true);
        btnRecepcionista.setMaximumSize(new java.awt.Dimension(127, 59));
        btnRecepcionista.setMinimumSize(new java.awt.Dimension(127, 59));
        btnRecepcionista.setPreferredSize(new java.awt.Dimension(127, 59));
        btnRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionistaActionPerformed(evt);
            }
        });

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        btnConsulta.setText("Consulta");
        btnConsulta.setMaximumSize(new java.awt.Dimension(127, 59));
        btnConsulta.setMinimumSize(new java.awt.Dimension(127, 59));
        btnConsulta.setPreferredSize(new java.awt.Dimension(127, 59));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_Transparente.png"))); // NOI18N
        logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logo.setFocusable(false);
        logo.setMaximumSize(new java.awt.Dimension(140, 113));
        logo.setMinimumSize(new java.awt.Dimension(140, 113));
        logo.setPreferredSize(new java.awt.Dimension(110, 113));

        painel.setBackground(new java.awt.Color(204, 204, 204));
        painel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painel.setToolTipText("");
        painel.setPreferredSize(new java.awt.Dimension(1100, 4));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRecepcionista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProntuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDentista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDentista)
                        .addGap(18, 18, 18)
                        .addComponent(btnProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnRecepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
            
            painel.removeAll();
            
            painel.add(formPaciente);
            formPaciente.listarPacientes();
            
            formPaciente.setVisible(true);
        
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        
        painel.removeAll();
        painel.add(formConsulta);
        
        formConsulta.preparaComboBox();
        formConsulta.setVisible(true);
        
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDentistaActionPerformed
        
        painel.removeAll();
        painel.add(formDentista);
        
        formDentista.listarDentistas();
        
        formDentista.setVisible(true);
        
    }//GEN-LAST:event_btnDentistaActionPerformed

    private void btnRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionistaActionPerformed
        
        painel.removeAll();
        painel.add(formRecepcionista);
        
        formRecepcionista.listarRecepcionistas();
        
        formRecepcionista.setVisible(true);
        
    }//GEN-LAST:event_btnRecepcionistaActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        JOptionPane.showMessageDialog(null, "Função não disponível na versão 1.0!", "Versão 1.0", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnProntuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDentista;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnRecepcionista;
    private javax.swing.JLabel logo;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables
}
