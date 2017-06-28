/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import javax.swing.JLabel;

/**
 *
 * @author matheus
 */
public class MostrandoRemedios {
    
    public void MostrandoRemedios(String NomeRemedio, int PX, int PY){
        JLabel label = new JLabel(NomeRemedio);  
        label.setName(NomeRemedio);  
        
        label.setSize(300,100);
       
        label.setVisible(true);
        
    }
    
    
    
}
