package basics;

import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public abstract class Acao {
    private static int qtdDias = 0;
    
    public static void iniciarBatalha(Paciente paciente, LinkedList<AgentePatologico> arrAgentes){
        AgentePatologico lastAgente = null;
   
        LinkedList<AgentePatologico> agentesCopiados = new LinkedList<>(arrAgentes); 
        
        while(paciente.taVivo() && !arrAgentes.isEmpty()){
            Iterator<AgentePatologico> iterator = agentesCopiados.iterator();
            qtdDias++;
                        
            //Output para teste
            //System.out.println("=====CONTADOR=====");
            //System.out.println("Dia "+qtdDias);
            //System.out.println("==================");
            
            while (iterator.hasNext()) {
                AgentePatologico agente = iterator.next();
                
                //Output para teste
                //System.out.println("_________________________");
                //System.out.println("Identificador: " + agente.getIdentificacao());
                //System.out.println("Energia Vital: " + agente.getEnergiaVital());
                //System.out.println("-------------------------");
                
                if(agente.getEnergiaVital() <= 0 && agente.getClasseEspecifica() != "HIV"){
                    //Output para teste
                    //System.out.println("O Agente Patológico " + agente.getIdentificacao() + " morreu!");
                    agente.morrer(arrAgentes);
                }else{
                    agente.atacar(paciente, arrAgentes);
                }
                
                if(paciente.taVivo()){
                    lastAgente = agente;
                }else{
                    System.out.println("O paciente vai morrer");
                    System.out.println("O paciente morre em " + Acao.getQtdDias() + " dias");
                    System.out.println("O último agente patológico foi "+agente.getIdentificacao());

                    return;
                }
            }
            
            //Output para teste
            //System.out.println("=======RELATORIO PACIENTE DIA "+qtdDias+"=========");
            //System.out.println("Leucocitos: "+paciente.getLeucocitos());
            //System.out.println("Hemacias: "+paciente.getHemacias());
            //System.out.println("Celulas T: "+paciente.getCelulasT());
            //System.out.println("Celulas K: "+paciente.getCelulasK());
            //System.out.println("========================================");

            
            agentesCopiados.clear();
            agentesCopiados.addAll(arrAgentes);
        }

        if(paciente.taVivo()){
            System.out.println("O paciente vai viver");
            System.out.println("O paciente foi curado em " + Acao.getQtdDias() + " dias");
            System.out.println("O último agente patológico foi "+lastAgente.getIdentificacao());
        }
        
    }
    
    public static void obterClassesMaisInstanciadas(int bacteria, int fungo, int protozoario, int virus){
        int maior = bacteria;
        String valores = "Bacterias";

        if (fungo > maior) {
            maior = fungo;
            valores = "Fungos";
        } else if (fungo == maior) {
            valores += ", Fungos";
        }

        if (protozoario > maior) {
            maior = protozoario;
            valores = "Protozoários";
        } else if (protozoario == maior) {
            valores += ", Protozoários";
        }

        if (virus > maior) {
            maior = virus;
            valores = "Vírus";
        } else if (virus == maior) {
            valores += ", Vírus";
        }

        System.out.println("As classes que mais aparecem - " + maior + " indivíduos - são " + valores);

    }

    public static int getQtdDias() {
        return qtdDias;
    }
}
