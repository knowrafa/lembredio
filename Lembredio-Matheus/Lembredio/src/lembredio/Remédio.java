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
public class Remédio {
    protected String nomeRemedio;
    protected double dosagem,//quantidade a ser consumida a cada vez
            quantidadeDeEmbalagens,//quantidade de embalagens compradadas do 
                                    //mesmo remédio
            quantidadePorEmbalagem;//quantidade do remédio contido na embalagem
    
    Remédio (String nomeRemedio, double dosagem, double quantidadeDeEmbalagens,
            double quantidadePorEmbalagem) {
        setNomeRemedio (nomeRemedio);
        setDosagem (dosagem);
        setQuantidadeDeEmbalagens (quantidadeDeEmbalagens);
        setQuantidadePorEmbalagem (quantidadePorEmbalagem);
    }
    
    public void setNomeRemedio (String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }
    
    public String getNomeRemedio () {
        return nomeRemedio;
    }
    
    public void setDosagem (double dosagem) {
        this.dosagem = dosagem;
    }
    
    public double getDosagem () {
        return dosagem;
    }
    
    public void setQuantidadeDeEmbalagens (double quantidadeDeEmbalagens) {
        this.quantidadeDeEmbalagens = quantidadeDeEmbalagens;
    }
    
    public double getQuantidadeDeEmbalagens () {
        return quantidadeDeEmbalagens;
    }
    
    public void setQuantidadePorEmbalagem (double quantidadePorEmbalagem) {
        this.quantidadePorEmbalagem = quantidadePorEmbalagem;
    }
    
    public double getQuantidadePorEmbalagem () {
        return quantidadePorEmbalagem;
    }
    
    //calcula a quantidade total de um determinado remédio em posse do usuário
    public double quantidadeTotalRemedio (double quantidadeDeEmbalagens,
            double quantidadePorEmbalagem) {
        double total = quantidadeDeEmbalagens * quantidadePorEmbalagem;
        
        return total;
    }
    /**/
}
