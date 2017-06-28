package lembredio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.List;
import static java.awt.SystemColor.desktop;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import static javafx.scene.text.Font.font;
import static javafx.scene.text.Font.font;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elrafa
 */
public class PacienteInterface extends javax.swing.JInternalFrame {
    String nomeUser;
    /**
     * Creates new form PacienteInterface
     */
      
   
     public PacienteInterface(String nome) throws FileNotFoundException, IOException{
        
        
         int x = 50, y = 50, k = 175;
       
        initComponents();
        nomeUser = nome;
        jLabel2NP.setText(nome);
        setVisible(true);
       
        String linha;
        File file = new File("CadastroRemedios/" + nome +".txt");
        if(!file.exists()) file.createNewFile();
        InputStream is = new FileInputStream("CadastroRemedios/" + nome +".txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
       
         scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         scroll.setViewportBorder(BorderFactory.createLoweredBevelBorder());
         scroll.setAutoscrolls(true);
         scroll.setViewportView(jPanel6);
     
       
        linha = br.readLine();
       
        while ((linha) != null){  
           
            if(linha.equals(nome)){
               
                linha = br.readLine();
                
                if(linha == null) break;
                System.out.println("PRIMEIRO IF");
                
                JLabel remedio= new JLabel();
                JLabel horario = new JLabel("Nada");
                remedio.setText("Remédio: " +linha);
                remedio.setFont(new Font("Sherif", Font.ITALIC + Font.BOLD, 15));
                //remedio.setFont(new Font("Sherif",, 15));
                jPanel6.add(remedio);
                jPanel6.add(horario);
               
                remedio.setBounds(x, y, 200, 100);
                
                remedio.setVisible(true);
                linha = br.readLine();
                
                if(linha==null) break;
                System.out.println("SEGUNDO IF");
                horario.setText("Horário Inicial: " + linha);
                horario.setBounds(x+300, y, 200, 100);
                horario.setVisible(true);
                
                y +=30;
                k += 30;
                
                jPanel6.setPreferredSize(new Dimension(0,k));
 
                JLabel dias = new JLabel();
                jPanel6.add(dias);
                dias.setText("Dias da Semana:");
                dias.setBounds(x, y, 200, 100);
                y +=30;
                k += 30;
                jPanel6.setPreferredSize(new Dimension(0,k));
 
                   
               do{
                    linha = br.readLine();
                    if(linha == null || linha.equals(nome)) break;
                    System.out.println("IF DO WHILE");
                    
                    if(Integer.parseInt(linha) == 2)linha = "Segunda-Feira";
                    else if(Integer.parseInt(linha) == 3) linha = "Terça-Feira";
                    else if(Integer.parseInt(linha) == 4) linha = "Quarta-Feira";
                    else if(Integer.parseInt(linha) == 5) linha = "Quinta-Feira";
                    else if(Integer.parseInt(linha) == 6) linha = "Sexta-Feira";
                    else linha = "Sábado";
                    
                    JLabel remedio2= new JLabel(linha);
                     
                    jPanel6.add(remedio2);
                     remedio2.setBounds(x+125, y,100, 100);
                     remedio2.setVisible(true);
                     //remedio2.setFont(font);
                     y += 30;
                     
                     k += 30;
                     
                    jPanel6.setPreferredSize(new Dimension(0,k));
                     
                     
                }while(true);
                y+=30;
                k+=30;
                if(linha == null) break;
 
           }
 
        }
        is.close();
        isr.close();
        br.close();
        String ok = horarioRemedio.getText();
     }
     
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2NP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeRemedio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CheckDomingo = new javax.swing.JCheckBox();
        CheckSegunda = new javax.swing.JCheckBox();
        CheckTerça = new javax.swing.JCheckBox();
        CheckQuinta = new javax.swing.JCheckBox();
        CheckSexta = new javax.swing.JCheckBox();
        CheckSabado = new javax.swing.JCheckBox();
        CheckQuarta = new javax.swing.JCheckBox();
        CheckTDS = new javax.swing.JCheckBox();
        horarioRemedio = new javax.swing.JFormattedTextField();
        BotaoSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(665, 544));
        setPreferredSize(new java.awt.Dimension(665, 544));

        jLabel1.setText("Paciente :");

        jLabel2NP.setText("Nome Paciente");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2NP)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2NP))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Avisos", jPanel1);

        jLabel5.setText("Horários :");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Remédios Cadastrados", jPanel3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        scroll.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );

        jTabbedPane1.addTab("Remedios Cadastrados/2", jPanel4);

        jLabel2.setText(" Remédios :");

        jLabel3.setText("Horarios :");

        jLabel4.setText("Dias da Semana :");

        CheckDomingo.setText("Domingo");
        CheckDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDomingoActionPerformed(evt);
            }
        });

        CheckSegunda.setText("Segunda - feira");

        CheckTerça.setText("Terça - feira");

        CheckQuinta.setText("Quinta - feira");
        CheckQuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckQuintaActionPerformed(evt);
            }
        });

        CheckSexta.setText("Sexta - feira");
        CheckSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSextaActionPerformed(evt);
            }
        });

        CheckSabado.setText("Sábado");
        CheckSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSabadoActionPerformed(evt);
            }
        });

        CheckQuarta.setText("Quarta - feira");

        CheckTDS.setText("Todos os dias da semana");
        CheckTDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTDSActionPerformed(evt);
            }
        });

        try {
            horarioRemedio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horarioRemedio.setToolTipText("");
        horarioRemedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioRemedioRemedioActionPerformed(evt);
            }
        });

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Intervalo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 em 30 minutos", "1 em 1 hora", "2 em 2 horas", "3 em 3 horas", "4 em 4 horas", "5 em 5 hora", "6 em 6 horas", "7 em 7 horas", "8 em 8 horas", "9 em 9 hora", "10 em 10 horas", "11 em 11 horas", "12 em 12 horas", "1 vez ao dia" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CheckDomingo)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CheckSegunda)
                                    .addGap(18, 18, 18)
                                    .addComponent(CheckTerça))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(CheckSexta)
                                    .addGap(18, 18, 18)
                                    .addComponent(CheckSabado))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(CheckQuinta)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CheckTDS)
                                .addComponent(CheckQuarta)))
                        .addComponent(BotaoSalvar))
                    .addComponent(jLabel6))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomeRemedio)
                        .addComponent(horarioRemedio, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(horarioRemedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckDomingo)
                    .addComponent(CheckSegunda)
                    .addComponent(CheckTerça)
                    .addComponent(CheckQuarta))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckTDS)
                    .addComponent(CheckSabado)
                    .addComponent(CheckSexta)
                    .addComponent(CheckQuinta))
                .addGap(32, 32, 32)
                .addComponent(BotaoSalvar)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Cadastrar Remédios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CheckDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckDomingoActionPerformed

    private void CheckTDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTDSActionPerformed

    private void CheckQuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckQuintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckQuintaActionPerformed

    private void CheckSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckSabadoActionPerformed

    private void horarioRemedioRemedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioRemedioRemedioActionPerformed
                
    }//GEN-LAST:event_horarioRemedioRemedioActionPerformed

    private void CheckSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSextaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckSextaActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        File diretorio = new File("CadastroRemedios");
        diretorio.mkdir();  
        File Remedios = new File(diretorio,nomeUser + ".txt");
         String ok = (horarioRemedio.getText());
        String horas[] = new String[2];
        horas = ok.split(Pattern.quote(":"));
        if(Integer.parseInt(horas[0]) > 24 || Integer.parseInt(horas[0]) < 0 && Integer.parseInt(horas[1]) < 0 || Integer.parseInt(horas[1]) > 59){
            JOptionPane.showMessageDialog(null,"Horario inválido!!");
            System.out.println("Horas "+horas[0]+"minutos "+horas[1]);
        }
        else{
        try {
            FileWriter fw = new FileWriter(Remedios, true);
          if(nomeRemedio.getText().length() > 0 && CheckDomingo.isSelected()||CheckSegunda.isSelected()||CheckTerça.isSelected()||CheckQuarta.isSelected()||CheckQuinta.isSelected()||CheckSexta.isSelected()||CheckSabado.isSelected()||CheckTDS.isSelected()){
            fw.write(nomeUser);
            fw.write("\r\n");
            fw.write(nomeRemedio.getText());
            fw.write("\r\n");
            
            if(CheckDomingo.isSelected()){
               fw.write("1");
               fw.write("\r\n");              
            }
            if(CheckSegunda.isSelected()){
               fw.write("2");
               fw.write("\r\n");  
            }
            if(CheckTerça.isSelected()){
               fw.write("3");
               fw.write("\r\n");  
            }
            if(CheckQuarta.isSelected()){
               fw.write("4");
               fw.write("\r\n");  
            }
            if(CheckQuinta.isSelected()){
               fw.write("5");
               fw.write("\r\n");  
            }
            if(CheckSexta.isSelected()){
               fw.write("6");
               fw.write("\r\n");  
            }
            if(CheckSabado.isSelected()){
               fw.write("7");
               fw.write("\r\n");  
            }
            if(CheckTDS.isSelected()){
               fw.write("1");
               fw.write("\r\n");
               fw.write("2");
               fw.write("\r\n");
               fw.write("3");
               fw.write("\r\n");
               fw.write("4");
               fw.write("\r\n");
               fw.write("5");
               fw.write("\r\n");
               fw.write("6");
               fw.write("\r\n");
               fw.write("7");
               fw.write("\r\n");
                    
          }
             JOptionPane.showMessageDialog(null,"Remédio Cadastrado com sucesso!");
             
             nomeRemedio.setText("");
             horarioRemedio.setText("");
             CheckDomingo.setSelected(false);
             CheckDomingo.setSelected(false);
             CheckTerça.setSelected(false);
             CheckQuarta.setSelected(false);
             CheckQuinta.setSelected(false);
             CheckSexta.setSelected(false);
             CheckSabado.setSelected(false);
             CheckTDS.setSelected(false);
             
       }
          else{
              JOptionPane.showMessageDialog(null,"Preencha todos os dados");
          }
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(PacienteInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
   
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JCheckBox CheckDomingo;
    private javax.swing.JCheckBox CheckQuarta;
    private javax.swing.JCheckBox CheckQuinta;
    private javax.swing.JCheckBox CheckSabado;
    private javax.swing.JCheckBox CheckSegunda;
    private javax.swing.JCheckBox CheckSexta;
    private javax.swing.JCheckBox CheckTDS;
    private javax.swing.JCheckBox CheckTerça;
    private javax.swing.JFormattedTextField horarioRemedio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2NP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField nomeRemedio;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

  
}
