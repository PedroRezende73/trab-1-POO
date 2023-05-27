package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import classeGeral.Fungo;
import basics.Paciente;
import java.util.Iterator;
import java.util.LinkedList;

public class Histoplasma extends Fungo {

    public Histoplasma(String identificacao) {
        super(identificacao, 1000, "Histoplasma");
    }

    @Override
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        /*
        O Histoplasma ataca apenas hemárcias, matando 50 hemárcias no ataque. Além
        disso, se estiverem do lado de uma Bactéria na fila, essa é eliminada. Esse verificação
        deve ser feita toda vez que um Histoplasma ataca e afeta a fila toda, ou seja, deve ser
        feita uma varredura na lista verificando se antes ou depois de um histoplasma há uma
        Bactéria, se houver, ela morre.
        */
        
        // Ataque do Histoplasma
        paciente.setHemacias(paciente.getHemacias() - 50);
        
        // Índice do Histoplasma atual na lista
        int index = listaDeAgentes.indexOf(this); 
        
        Iterator<AgentePatologico> iterator = listaDeAgentes.iterator();
                
        int posicao = 0;
        while(iterator.hasNext()){
            
            // Verifica se existe bacteria antes na fila 
            if (index - 1 == posicao &&  iterator.next() instanceof Bacteria) {
                iterator.remove(); 
                System.out.println("bacteria antes dele removida");
            }

            // Verifica se existe bacteria depois na fila
            if (index + 1 == posicao &&  iterator.next() instanceof Bacteria) {
                iterator.remove(); 
            }
            posicao++;
        }

        
        
    }

}
