package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import classeGeral.Fungo;
import basics.Paciente;
import java.util.ArrayList;

public class Histoplasma extends Fungo {

    public Histoplasma(String identificacao) {
        super(identificacao, 1000, "Histoplasma");
    }

    public void atacar(Paciente paciente, ArrayList<AgentePatologico> listaDeAgentes) {
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
        
        // Verifica se existe bacteria antes na fila 
        if (index > 0 && listaDeAgentes.get(index - 1) instanceof Bacteria) {
            listaDeAgentes.remove(index - 1); 
        }
        // Verifica se existe bacteria depois na fila
        if (index < listaDeAgentes.size() - 1 && listaDeAgentes.get(index + 1) instanceof Bacteria) {
            listaDeAgentes.remove(index + 1); 
        }
    }

}
