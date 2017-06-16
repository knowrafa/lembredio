/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elrafa
 */
public class ValidarLogin {
    String login;
    String senha;
    
   public void setLogin(String login){
       this.login = login;
   } 
   public void setSenha(String senha){
       this.senha = senha;
   }
   
   public boolean verificaLogin() throws FileNotFoundException, IOException {
       
       File file = new File("CADASTRADOS.txt");
      /* if(!file.exists()){
           file.createNewFile();
           
       }
       */
       InputStream is = new FileInputStream("CADASTRADOS.txt");
       InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       
        try {
            String linha = br.readLine();
            int totalCadastros = Integer.parseInt(linha);
          int i=0;
          
          for(int k=0; k < totalCadastros; k++ ){
       
            linha = br.readLine();
            
                switch (Integer.parseInt(linha)) {
                    case 0:
                        if(this.login == br.readLine()){
                            br.close();
                            return false;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    case 1:
                        if(this.login == br.readLine()){
                            br.close();
                            return false;
                        }       for(i=0; i< 4; i++) br.readLine();
                        break;
                    case 2:
                        if(this.login == br.readLine()){
                            br.close();
                            return false;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    default:
                        break;
                }
            
          }

            
        } catch (IOException ex) {
            Logger.getLogger(ValidarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       br.close();
       return true;
   }
   
   public String getLogin(){
       return this.login;
   }
   
}
