/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;

/**
 *
 * @author elrafa
 */
public class Lembredio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
       File file = new File("CADASTRADOS.txt");
       if(!file.exists()){
        file.createNewFile();// TODO code application logic here
       }
       
       LoginInterface inFrame = new LoginInterface();
       CadastroInternal inCadas = new CadastroInternal();
       TelaInicial tl = new TelaInicial(inFrame);
       tl.setVisible(true);

       inFrame.setVisible(true);
       
       //sleep(5000);
     
       //inFrame.setTitle("VAI SE FUDER");
       //inFrame.repaint();
       //tl.addFrame(inFrame);
       // tl.repaint();
    }
    
}
