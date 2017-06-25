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
    int type;
    Pessoa pessoa = new Pessoa();
    
   public void setLogin(String login){
       this.login = login;
   } 
   public void setSenha(String senha){
       this.senha = senha;
   }
   
   public boolean verificaLogin() throws FileNotFoundException, IOException {
       
       InputStream is = new FileInputStream("CADASTRADOS.txt");
       InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       
        try {
            String linha;
            int i=0;
          
          do{
            linha = br.readLine();
            if(linha == null) break;
              System.out.println(linha + "  " + this.login);
                switch (Integer.parseInt(linha)) {
                    case 0:
                        if(br.readLine().equals(this.login) && br.readLine().equals(this.senha)){
                            this.type = Integer.parseInt(linha);
                            System.out.println(this.type);
                            br.close();
                            return true;
                        }       for(i=0; i< 2; i++) br.readLine();
                        break;
                    case 1:
                        if(br.readLine().equals(this.login) && br.readLine().equals(this.senha)){
                           this.type = Integer.parseInt(linha);
                           pessoa.nome = br.readLine();
                           System.out.println(this.type);
                           
                           br.close();
                            return true;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    case 2:
                        if(br.readLine().equals(this.login) && br.readLine().equals(this.senha)){
                            this.type = Integer.parseInt(linha);
                            System.out.println(this.type);
                            br.close();
                            return true;
                        }       for(i=0; i< 2; i++) br.readLine();
                        break;
                    default:
                        break;
                }
            
          }while(true);

            
        } catch (IOException ex) {
            Logger.getLogger(ValidarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       br.close();
       return false;
   }
   
   public boolean verificaCadastro() throws FileNotFoundException, IOException {
       
       InputStream is = new FileInputStream("CADASTRADOS.txt");
       InputStreamReader isr = new InputStreamReader(is);
       BufferedReader br = new BufferedReader(isr);
       
        try {
            String linha;
            int i =0;
          do{
            
              linha = br.readLine();
              
              System.out.println(linha + " - " + this.login);
              
              if(linha == null) break;
              
             
                switch (Integer.parseInt(linha)) {
                    case 0:
                        if(br.readLine().equals(this.login)){
                            br.close();
                            return false;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    case 1:
                        if(br.readLine().equals(this.login)){
                            br.close();
                            return false;
                        }       for(i=0; i< 4; i++) br.readLine();
                        break;
                    case 2:
                        if(br.readLine().equals(this.login)){
                            br.close();
                            return false;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    default:
                        break;
                }
            
          }while(linha != null);

            
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
