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
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elrafa
 */
public class Login {
    String login;
    String senha;
    int type;
    Pessoa pessoa = new Pessoa();

   public void setLogin(String login){
       this.login = login;
   } 
   public void setSenha(String senha) throws NoSuchAlgorithmException{
       String s = senha;
       MessageDigest m=MessageDigest.getInstance("MD5");
       m.update(s.getBytes(),0,s.length());
       this.senha = new BigInteger(1,m.digest()).toString(16);
   }
   public String getLogin(){
       return this.login;
   }
   public void setType(int type){
       this.type = type;
   } 
   public int getType(){
       return this.type;
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
          
                switch (Integer.parseInt(linha)) {
                    case 0:
                        if(br.readLine().equals(this.login) & br.readLine().equals(this.senha)){
                            this.type = Integer.parseInt(linha);
                            
                            pessoa.nome = br.readLine();
                            
                            br.close();
                            
                            return true;
                        }       for(i=0; i< 2; i++) br.readLine();
                        break;
                    case 1:
                        if(br.readLine().equals(this.login) & br.readLine().equals(this.senha)){
                           this.type = Integer.parseInt(linha);
                           pessoa.nome = br.readLine();
                           
                           br.close();
                            return true;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    case 2:
                        if(br.readLine().equals(this.login) & br.readLine().equals(this.senha)){
                            this.type = Integer.parseInt(linha);
                            pessoa.nome = br.readLine();
                            br.close();
                            return true;
                        }       for(i=0; i< 3; i++) br.readLine();
                        break;
                    default:
                        break;
                }
            
          }while(true);

            
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
                        }       for(i=0; i< 4; i++) br.readLine();
                        break;
                    default:
                        break;
                }
            
          }while(linha != null);

            
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       br.close();
       return true;
   }
   

}
