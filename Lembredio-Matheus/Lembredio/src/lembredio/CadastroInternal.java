/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author elrafa
 */
public class CadastroInternal extends javax.swing.JInternalFrame {
    ValidarLogin vlogin = new ValidarLogin();
    Pessoa plogin = new Pessoa();
    int type;
    Médico medico = new Médico();
    
    /**
     * Creates new form CadastroInternal
     */
    public CadastroInternal() {
        this.type = -1;
        initComponents();
        setVisible(true);
        RadioButtonHandler handler = new RadioButtonHandler();
        jRadioButton3.addItemListener(handler);
        jRadioButton1.addItemListener(handler);
        jRadioButton2.addItemListener(handler);
        jLabel4.setVisible(false);
        CRM.setVisible(false);
        jLabel8.setText("eae");
    }
    public void cadastroInfo() throws IOException{
        if(vlogin.verificaCadastro() && plogin.verificaEmail()){
                      
        FileWriter outputfile = new FileWriter("CADASTRADOS.txt");
        PrintWriter out = new PrintWriter(outputfile);
        out.flush();
        out.close();
        }else{
            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        EfetuarCadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        loginDesejado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SENHA = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        CRM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nomePessoa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setTitle("Cadastro");
        setToolTipText("");

        EfetuarCadastro.setText("Continuar");
        EfetuarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfetuarCadastroActionPerformed(evt);
            }
        });

        jLabel6.setText("O que você é para com o aplicativo?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Médico");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Enfermeiro(a)");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Paciente");

        jLabel2.setText("Digite o login desejado:");

        jLabel3.setText("Digite a senha:");

        jLabel4.setText("Digite seu CRM");

        jLabel5.setText("Digite seu nome");

        jLabel7.setText("Digite seu e-mail");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CRM, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EfetuarCadastro)))
                        .addGap(6, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(nomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EfetuarCadastro)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(SENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EfetuarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfetuarCadastroActionPerformed
        try {
            
                plogin.nome = nomePessoa.getText();
                plogin.email = email.getText();
                vlogin.senha = SENHA.getText();
                vlogin.login = loginDesejado.getText();
                if(type == 1) medico.setCRM(Integer.parseInt(CRM.getText()));
                
            
            if(vlogin.verificaCadastro() && plogin.verificaEmail() && type != -1){
                
               swapFile("CADASTRADOS.txt"); 
               this.nomePessoa.setText("");
               this.email.setText("");
               this.loginDesejado.setText("");
               this.SENHA.setText("");
               if(type == 1) this.CRM.setText("");
               
             JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
               
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os dados");
                    }// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(CadastroInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EfetuarCadastroActionPerformed

    public class RadioButtonHandler implements ItemListener{
        @Override
        public void itemStateChanged (ItemEvent evt){
                    
        if(evt.getSource()== jRadioButton3){
            jLabel4.setVisible(false);
            CRM.setVisible(false);
            type = 0;
            
        }else if(evt.getSource()== jRadioButton1){
            jLabel4.setVisible(true);
            CRM.setVisible(true);
            type = 1;
        }
        else if(evt.getSource()== jRadioButton2){
            jLabel4.setVisible(false);
            CRM.setVisible(false);
            type = 2;
        }
        
        
        }
    }
    
    public void swapFile(String file1) throws FileNotFoundException, IOException{
                
                FileWriter outputfile = new FileWriter(file1, true);
                PrintWriter out = new PrintWriter(outputfile);

                    out.println(type);
                    out.println(vlogin.login);
                    out.println(vlogin.senha);
                    out.println(plogin.nome);
                    out.println(plogin.email);
                    if(type==1) out.println(medico.getCRM());
                    

              out.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CRM;
    private javax.swing.JButton EfetuarCadastro;
    private javax.swing.JPasswordField SENHA;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField loginDesejado;
    private javax.swing.JTextField nomePessoa;
    // End of variables declaration//GEN-END:variables
}
