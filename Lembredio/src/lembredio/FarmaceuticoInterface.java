/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elrafa
 */
public class FarmaceuticoInterface extends javax.swing.JInternalFrame {
        
    String nomeUser;
    String loginUser;
    String nomeFarmacia;
    /**
     * Creates new form FarmaceuticoInterface
     */
    public FarmaceuticoInterface() {
        initComponents();
    }
    
    public FarmaceuticoInterface(Farmaceutico farma) {
        initComponents();
        setVisible(true);
        //jInternalFrame2.setVisible(true);
       
       nomeUser = farma.loginInfo.pessoa.getNome();
       nomeFarmacia = farma.getnomeFarmacia();
       LabelNomeFarma.setText(nomeUser);
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LabelNomeFarma = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldNomeReme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ButtonSalvar = new javax.swing.JButton();
        FormattedFieldQuantReme = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        FormattedTextFieldPU = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        logoutButton = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();

        jLabel5.setText("Farmacêutico(a) :");

        LabelNomeFarma.setText("Nome Farmacêutico(a)");

        jLabel1.setText("Farmácia : ");

        jLabel2.setText("Nome Farmácia");

        jLabel3.setText("Nome do medicamento :");

        TextFieldNomeReme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeRemeActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade :");

        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        try {
            FormattedFieldQuantReme.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormattedFieldQuantReme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormattedFieldQuantRemeActionPerformed(evt);
            }
        });

        jLabel6.setText("Preço Unitário :");

        FormattedTextFieldPU.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤ #,##0.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelNomeFarma)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldNomeReme, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(FormattedTextFieldPU)
                            .addComponent(FormattedFieldQuantReme, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSalvar)
                .addGap(144, 144, 144))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LabelNomeFarma)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldNomeReme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FormattedFieldQuantReme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FormattedTextFieldPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSalvar)
                .addGap(35, 35, 35))
        );

        jTabbedPane2.addTab("Cadastrar Remédios", jPanel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Medicamento :");

        jLabel8.setText("Quantidade :");

        jLabel9.setText("jLabel9");

        jLabel10.setText("Preço :");

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(81, 81, 81)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ver Estoque", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("tab3", jPanel3);

        jMenu2.setText("Arquivo");

        logoutButton.setText("Sair");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jMenu2.add(logoutButton);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Ajuda");

        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        jMenu1.add(sobre);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNomeRemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeRemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeRemeActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        File diretorio = new File("EstoqueFamarcias");
        diretorio.mkdir();
        File Estoque = new File(diretorio,loginUser + ".txt");

        try {
            FileWriter fw = new FileWriter(Estoque, true);
            if(TextFieldNomeReme.getText().length()>0 && FormattedFieldQuantReme.getText().length() > 0 && FormattedTextFieldPU.getText().length() > 0){
                fw.write(TextFieldNomeReme.getText());
                fw.write("\r\n");
                fw.write(FormattedFieldQuantReme.getText());
                fw.write("\r\n");
                fw.write(FormattedTextFieldPU.getText());
                fw.write("\r\n");

                TextFieldNomeReme.setText("");
                FormattedFieldQuantReme.setText("");
                FormattedTextFieldPU.setText("");
            }
            else if(TextFieldNomeReme.getText().length()<=0 || FormattedFieldQuantReme.getText().length() <= 0 || FormattedTextFieldPU.getText().length() <= 0){
                if(TextFieldNomeReme.getText().length()<= 0){
                    JOptionPane.showMessageDialog(null,"Entre com o nome do remédio!");
                }
                else if (FormattedFieldQuantReme.getText().length() <= 0){
                    JOptionPane.showMessageDialog(null,"Entre com a quantidade de remédios!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Entre com o preço!!");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(FarmaceuticoInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void FormattedFieldQuantRemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormattedFieldQuantRemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormattedFieldQuantRemeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        jTabbedPane1.setVisible(false);
        getParent().remove(jTabbedPane1);
        getParent().setVisible(false);
        getParent().getParent().add(new LoginInterface());
        getParent().remove(this);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        JOptionPane.showMessageDialog(null, "\t\tLEMBRÉDIO\t\t\n\tDesenvolvedores:\nMatheus Brito\nRafael Alessandro\n");
    }//GEN-LAST:event_sobreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JFormattedTextField FormattedFieldQuantReme;
    private javax.swing.JFormattedTextField FormattedTextFieldPU;
    private javax.swing.JLabel LabelNomeFarma;
    private javax.swing.JTextField TextFieldNomeReme;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem logoutButton;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables
}