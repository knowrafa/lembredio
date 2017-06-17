package lembredio;


import java.awt.Container;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lembredio.ValidarLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elrafa
 */
public class NovoJInternalFrame extends javax.swing.JInternalFrame {
    
    ValidarLogin vlogin = new ValidarLogin();
    /**
     * Creates new form NovoJInternalFrame
     */
    public NovoJInternalFrame() {
        initComponents();
        //setVisible(true);
        EfetuarLogin.setEnabled(false);
        jLabel1.setVisible(false);
        dispose();
        
        Container parent = getParent();
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
        DigitarLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EfetuarLogin = new javax.swing.JButton();
        EfetuarCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DigitarSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ImagemTelaDeLogin = new javax.swing.JLabel();

        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFocusable(false);
        setName(""); // NOI18N
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        DigitarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitarLoginActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        EfetuarLogin.setText("Login");
        EfetuarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfetuarLoginActionPerformed(evt);
            }
        });

        EfetuarCadastro.setText("Cadastre-se!");
        EfetuarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfetuarCadastroActionPerformed(evt);
            }
        });

        jLabel2.setText("Não tem conta?");

        DigitarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DigitarSenhaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1497671163_scull.png"))); // NOI18N
        jLabel1.setText("Login ou Senha incorretos!!!");

        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DigitarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DigitarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EfetuarCadastro)
                                        .addGap(91, 91, 91)
                                        .addComponent(EfetuarLogin))))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(DigitarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DigitarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EfetuarCadastro)
                    .addComponent(EfetuarLogin))
                .addContainerGap())
        );

        ImagemTelaDeLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panic.attack.symptoms.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(ImagemTelaDeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImagemTelaDeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DigitarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigitarLoginActionPerformed
        this.vlogin.setLogin(evt.getActionCommand());
        System.out.println(vlogin.getLogin());

// TODO add your handling code here:
    }//GEN-LAST:event_DigitarLoginActionPerformed

    private void EfetuarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfetuarLoginActionPerformed
        
        try {
            if(vlogin.verificaLogin()){
             setVisible(false);
             //getParent().add(new CadastroInternal());
             
            }
        } catch (IOException ex) {
            Logger.getLogger(NovoJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_EfetuarLoginActionPerformed

    private void DigitarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DigitarSenhaActionPerformed
        this.vlogin.setSenha(evt.getActionCommand());
        EfetuarLogin.setEnabled(true);
    }//GEN-LAST:event_DigitarSenhaActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        this.setLocation(0, 0);// TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void EfetuarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfetuarCadastroActionPerformed
        getParent().add(new CadastroInternal());   
        
        //getParent().removeAll();       // TODO add your handling code here:
    }//GEN-LAST:event_EfetuarCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DigitarLogin;
    private javax.swing.JPasswordField DigitarSenha;
    private javax.swing.JButton EfetuarCadastro;
    private javax.swing.JButton EfetuarLogin;
    private javax.swing.JLabel ImagemTelaDeLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
