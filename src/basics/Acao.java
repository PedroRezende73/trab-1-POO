package basics;

import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Acao {
    private static int qtdDias = 0;
    
    public static void atacar(Paciente paciente, LinkedList<AgentePatologico> arrAgentes){
        AgentePatologico agenteP = null;
        do {
            qtdDias++;
            
            Iterator<AgentePatologico> iterator = arrAgentes.iterator();

            
            while (iterator.hasNext()) {
                AgentePatologico agente = iterator.next();
                
                System.out.println(agente.getClasseEspecifica());
                
                agente.atacar(paciente, arrAgentes);
                
                if(paciente.taVivo() == 1){
                    paciente.contraAtaque(agente);
                    agenteP = agente;
                }else{
                    System.out.println("O paciente vai morrer");
                    System.out.println("O paciente morre em " + Acao.getQtdDias() + " dias");
                    System.out.println("O último agente patológico foi "+agente.getIdentificacao());

                    return;
                }
                
                if (agente.getEnergiaVital() <= 0 && !"HIV".equals(agente.getClasseEspecifica())) {
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
