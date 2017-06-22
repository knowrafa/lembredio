/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lembredio;

import java.time.LocalDateTime;
/**
 *
 * @author elrafa
 */
public class Posologia {
    protected LocalDateTime dataInicio,//data e hora de início do tratamento
            dataProxima;//data da próxima dosagem
    protected int duracaoTotal,//duração de dias totais do tratamento
            duracaoRestante,//duração de dias restante do tratamento
            intervaloHoras;//intervalo entre um dose e outra
    
    Posologia (LocalDateTime dataInicio, int duracaoTotal, int intervaloHoras) {
        //setDataInicio(dataInicio);
        setDuracaoTotal(duracaoTotal);
        setIntervaloHoras(intervaloHoras);
    }
    
    
    public void setDataInicio (LocalDateTime dataInicio) {
        //this.dataInicio = dataInicio;
    }
    
    public LocalDateTime getDataInicio () {
        return dataInicio;
    }
    public void setDataProxima (LocalDateTime dataProxima) {
        //this.dataProxima = dataProxima;
    }
    
    public LocalDateTime getDataProxima () {
        return dataProxima;
    }
    public void setDuracaoTotal (int duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }
    
    public int getDuracaoTotal () {
        return duracaoTotal;
    }
    public void setDuracaoRestante (int duracaoRestante) {
        //this.duracaoRestante = duracaoRestante;
    }
    
    public int getDuracaoRestante () {
        return duracaoRestante;
    }
    
    public void setIntervaloHoras (int intervaloHoras) {
        this.intervaloHoras = intervaloHoras;
    }
    
    public int getIntervaloHoras () {
        return intervaloHoras;
    }
    
    public int dosesTotaisDoTratamento (int duracaoTotal, int intervaloHoras) {
        //int total = (duracaoTotal * 24) / intervaloHoras;
        
        return total;
    }
}
