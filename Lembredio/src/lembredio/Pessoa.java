/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

/**
 *
 * @author elrafa
 */
public class Pessoa {
    protected String nome;
    protected Login loginInfo;
    protected String email;
    public boolean verificaNome(){
        if("".equals(nome)) return false;
        if(" ".equals(nome)) return false;
        String[] ary = nome.split("");
        for(int i= 0; i < nome.length(); i++){
            
            for(int k = 0; k < 10; k++)

            if(ary[i].equals(Integer.toString(k))) return false;
            
            if("#".equals(ary[i]) || "@".equals(ary[i]) || "/".equals(ary[i])  || "!".equals(ary[i])  || "$".equals(ary[i]) || ary[i] == "%" ) return false;
        
        }
       //this.setNome(nome);
    
        return true;
    }
    public boolean verificaEmail(){
        
        return true;
    }
    
    public void setNome(String nome){
    
        this.nome = nome;
    }
    public String getNome(){
    
        return this.nome;
    }
    
    public void setEmail(String email){
    
        this.nome = nome;
    }
    public String getEmail(){
    
        return this.email;
    }
}
