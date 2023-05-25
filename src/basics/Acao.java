/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Acao {
    private static int qtdDias = 0;
    
    public static void atacar(Paciente paciente, ArrayList<AgentePatologico> arrAgentes){
        
        do {
            for (int i = 0; i < arrAgentes.size(); i++) {
                AgentePatologico agente = arrAgentes.get(i);
                //System.out.println(agente.getIdentificacao());
                agente.atacar(paciente);
            }
            qtdDias++;
        } while (paciente.taVivo() != 1);
        
    }

    public static int getQtdDias() {
        return qtdDias;
    }

    
    
    
    
    
}
