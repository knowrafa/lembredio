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
