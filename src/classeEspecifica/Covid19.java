package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Virus;
import basics.Paciente;
import java.util.LinkedList;

public class Covid19 extends Virus {

    public Covid19(String identificacao) {
        super(identificacao, 100, "COVID 19");
    }

    @Override
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        paciente.setLeucocitos(paciente.getLeucocitos() - 10);
        paciente.setCelulasT(paciente.getCelulasT() - 2);
        paciente.setHemacias(paciente.getHemacias() - 15);
        
        if(paciente.taVivo()){
            paciente.contraAtaque(this);
        }

        if (paciente.getHemacias() < 200) {
            //Output para teste
            System.out.println("Sou o COVID e realizei um segundo ataque pois o paciente possui "+paciente.getHemacias()+" hemácias");
            paciente.setLeucocitos(paciente.getLeucocitos() - 10);
            paciente.setCelulasT(paciente.getCelulasT() - 2);
            paciente.setHemacias(paciente.getHemacias() - 15);
            
            if(paciente.taVivo()){
                paciente.contraAtaque(this);
            }
        }
        
    }

    @Override
    public void morrer(LinkedList<AgentePatologico> listaDeAgentes) {
        listaDeAgentes.remove(this);
    }
    
}
