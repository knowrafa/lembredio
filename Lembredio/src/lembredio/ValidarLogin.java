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
   
   public boolean verificaLogin() throws FileNotFoundException, IOException{
       
       File file = new File("CADASTRADOS.txt");
      /* if(!file.exists()){
           file.createNewFile();
           
       }
       */
       InputStream is = new FileInputStream("CADASTRADOS.txt");
       InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       
       for(int i=0; i <"CADASTRADOS.txt".length(); i++ ){
       
        try {
            String linha = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ValidarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }
       return true;
   }
   
   public String getLogin(){
       return this.login;
   }
   
}
