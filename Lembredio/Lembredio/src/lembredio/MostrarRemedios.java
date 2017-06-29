/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Matheus
 */
public class MostrarRemedios {
    
    public void MostrarRemedios(String nome) throws FileNotFoundException, IOException{
        String linha;
        
        InputStream is = new FileInputStream(nome+".txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        do{
        linha = br.readLine();
        if(linha == null) break;
                //mostrar os dados do arquivo do usuario;
        }while(true);
        
}
}
