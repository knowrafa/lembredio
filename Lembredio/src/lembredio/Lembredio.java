/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author elrafa
 */
public class Lembredio {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       File file = new File("CADASTRADOS.txt");
       if(!file.exists()){
        file.createNewFile();// TODO code application logic here
       }
       
       TelaInicial tl = new TelaInicial();
       tl.setVisible(true);
       
       TelaInicial tl2 = new TelaInicial();
       tl2.setVisible(true);
       tl2.dispose();
       
      
       NovoJInternalFrame jne = new NovoJInternalFrame();
       jne.setVisible(true);
    }
    
}
