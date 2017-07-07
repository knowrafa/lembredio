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
public class Médico extends Pessoa{
    private int CRM;
    
    public Médico(){
    
    }
            
    public Médico(Login login){
        this.loginInfo = login;
        
    }
    public void setCRM(int CRM){
        this.CRM = CRM;
    }
    
    public int getCRM(){
        return this.CRM;
    }
}
