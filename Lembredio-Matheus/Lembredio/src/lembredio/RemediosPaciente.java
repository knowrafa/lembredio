/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Matheus
 */
public class RemediosPaciente {
      
    public RemediosPaciente() throws IOException{
        File Remedios = new File("Remedios.txt");
        Remedios.createNewFile();
    }
    
    
    //FALTA PASSAR O HORARIO
    public RemediosPaciente(String nome, String NomeRemedio) throws IOException{
        File Remedios = new File("Remedios.txt");
        FileWriter fw = new FileWriter(Remedios, true);
        
        fw.write(nome);
        fw.write("\r\n");
        fw.write(NomeRemedio);
        fw.write("\r\n");
        fw.flush();
        fw.close();
    }  
    
}
