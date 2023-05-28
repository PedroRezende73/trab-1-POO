package classeEspecifica;

import basics.AgentePatologico;
import basics.Paciente;
import classeGeral.Virus;
import java.util.LinkedList;

public class HIV extends Virus {

    public HIV(String identificacao) {
        super(identificacao, 0, "HIV");
    }

    @Override
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
       paciente.setLeucocitos(paciente.getLeucocitos() - 10);
       paciente.setCelulasK(paciente.getCelulasK() - 5);
       paciente.setCelulasT(paciente.getCelulasT() - 3);
       
        if(paciente.taVivo()){
            paciente.contraAtaque(this);
        }
       
    }
    
    @Override
    public void morrer(LinkedList<AgentePatologico> listaDeAgentes) {
        //Output para teste;
        System.out.println("Menos eu que sou o Vírus da HIV");
    }
}
