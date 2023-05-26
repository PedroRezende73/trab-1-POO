/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Acao {
    private static int qtdDias = 0;
    
    public static void atacar(Paciente paciente, ArrayList<AgentePatologico> arrAgentes){
        AgentePatologico agenteP = null;
        do {
            qtdDias++;

            Iterator<AgentePatologico> iterator = arrAgentes.iterator();
            
            while (iterator.hasNext()) {
                AgentePatologico agente = iterator.next();
                
                agente.atacar(paciente);
                
                if(paciente.taVivo() == 1){
                    paciente.contraAtaque(agente);
                    agenteP = agente;
                }else{
                    System.out.println("O paciente vai morrer");
                    System.out.println("O paciente morre em " + Acao.getQtdDias() + " dias");
                    System.out.println("O último agente patológico foi "+agente.getIdentificacao());

                            
                    return;
                }
                
                if (agente.getEnergiaVital() <= 0 && agente.getClasseEspecifica() != "HIV") {
                    iterator.remove();
                }
            }
            
        } while (paciente.taVivo() != 0 && !arrAgentes.isEmpty());
        
        if(paciente.taVivo() == 1){
            System.out.println("O paciente vai viver");
            System.out.println("O paciente foi curado em " + Acao.getQtdDias() + " dias");
            System.out.println("O último agente patológico foi "+agenteP.getIdentificacao());
        }
    }

    public static int getQtdDias() {
        return qtdDias;
    }

    
    
    
    
    
}
