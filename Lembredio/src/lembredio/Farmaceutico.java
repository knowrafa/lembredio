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
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Matheus
 */
public class Farmaceutico extends Pessoa{
    private String nomeFarmacia;
    
    public boolean verificaFarmacia() throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream("FarmaciasCadastradas" +".txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String linha;
        do{
            linha = br.readLine();
            if(linha== null) break;
            if(linha.equals(nomeFarmacia)) return true;
            
        }while(linha != null);
        File file = new File("FarmaciasCadastradas.txt");
        FileWriter outputfile = new FileWriter(file, true);
        PrintWriter out = new PrintWriter(outputfile);
        System.out.println(nomeFarmacia);
        out.println(nomeFarmacia);
        out.flush();
        out.close();
        return false;
    }
    
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
