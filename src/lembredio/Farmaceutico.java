/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

/**
 *
 * @author Matheus
 */
public class Farmaceutico extends Pessoa{
    private String nomeFarmacia;
    
    public Farmaceutico(){
        
    }
    
    public Farmaceutico(Login login){
        this.loginInfo = login;
        
    }
    
    public void setnomeFarmacia(String nomeFarmacia){
        this.nomeFarmacia = nomeFarmacia;
    }
    
    public String getnomeFarmacia(){
        return this.nomeFarmacia;
    }
}
