/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import java.net.URL;

/**
 *
 * @author elrafa
 */
public class Lembredio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException, PropertyVetoException {
       File file = new File("CADASTRADOS.txt");
       
       if(!file.exists()){
        file.createNewFile();// TODO code application logic here
       }
       File dir = new File("CadastroRemedios");
       if(!dir.exists()){
           dir.mkdir();
       }
       
       for(int i=0; i < 10; i++){
           sleep(1000);
           java.awt.Toolkit.getDefaultToolkit().beep();
       }
       LoginInterface inFrame = new LoginInterface();
       CadastroInternal inCadas = new CadastroInternal();
       TelaInicial tl = new TelaInicial(inFrame);
       tl.setVisible(true);
        System.out.println("Permitir Alteração");
       inFrame.setVisible(true);

    }
    
}
