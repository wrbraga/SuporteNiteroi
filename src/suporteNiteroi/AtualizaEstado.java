/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suporteNiteroi;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author WRBraga
 */
public class AtualizaEstado implements Runnable{
  
    private Map<Integer,Equipamento> EQUIPAMENTOS= new HashMap<>();
       
    public AtualizaEstado(Map<Integer,Equipamento> lista) {
        EQUIPAMENTOS = lista;
    }

    @Override
    public void run() {      
        long intervalo = (60 * 1000);   // Intervalo de 1 minuto
        try {
            while(true) {
                System.err.println("Atualizando estado dos equipamentos!");
                for(Integer e : EQUIPAMENTOS.keySet()) {
                    //System.out.println("Verificando " + EQUIPAMENTOS.get(e).host);
                    new Thread(EQUIPAMENTOS.get(e)).start();
                }                
                Thread.sleep(intervalo);
            }
        } catch(InterruptedException e) {
        }
    }
    
}
