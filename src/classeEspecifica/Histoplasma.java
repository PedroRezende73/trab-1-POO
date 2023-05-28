package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import classeGeral.Fungo;
import basics.Paciente;
import java.util.LinkedList;

public class Histoplasma extends Fungo {

    public Histoplasma(String identificacao) {
        super(identificacao, 1000, "Histoplasma");
    }

    @Override
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {

        paciente.setHemacias(paciente.getHemacias() - 50);
        this.buscaBacteria(listaDeAgentes);
        
        if(paciente.taVivo()){
            paciente.contraAtaque(this);
        }
        
    }
    
    private void buscaBacteria(LinkedList<AgentePatologico> listaDeAgentes) {
        int index = listaDeAgentes.indexOf(this); 
        
        if (index - 1 >= 0 && listaDeAgentes.get(index-1) instanceof Bacteria) {
            listaDeAgentes.get(index-1).setEnergiaVital(0);
            //Output para teste
            //System.out.println("Encontrei uma Bactéria antes de mim chamanda "+listaDeAgentes.get(index-1).getIdentificacao()+" e ela vai morrer quando sua vez chegar");
        }
        
        if (index + 1 <= listaDeAgentes.size() - 1 && listaDeAgentes.get(index+1) instanceof Bacteria) {
            listaDeAgentes.get(index+1).setEnergiaVital(0);
            //Output para teste
            //System.out.println("Encontrei uma Bactéria depois de mim chamanda "+listaDeAgentes.get(index+1).getIdentificacao()+" e ela vai morrer quando sua vez chegar");
        }
        
    }
    
    @Override
    public void morrer(LinkedList<AgentePatologico> listaDeAgentes) {
        listaDeAgentes.remove(this);
    }

}
