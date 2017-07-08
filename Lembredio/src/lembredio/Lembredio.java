/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author elrafa
 */
public class Lembredio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException, PropertyVetoException, UnsupportedAudioFileException, LineUnavailableException {
       File file = new File("CADASTRADOS.txt");
       
       if(!file.exists()){
        file.createNewFile();// TODO code application logic here
       }
       File dir = new File("CadastroRemedios");
       if(!dir.exists()){
           dir.mkdir();
       }
       
       LoginInterface inFrame = new LoginInterface();
       CadastroInterface inCadas = new CadastroInterface();
       TelaInicial tl = new TelaInicial(inFrame);
       tl.setVisible(true);
        System.out.println("Permitir Alteração");
       inFrame.setVisible(true);

    }
    
}
