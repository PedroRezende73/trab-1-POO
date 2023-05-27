package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Protozoario;
import basics.Paciente;
import java.util.LinkedList;

public class Giardia extends Protozoario{
    
    public Giardia(String identificacao) {
        super(identificacao, 500, "Giárdia");
    }
    
    @Override
    public LinkedList atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        /*
        O ataque da Giárdia retira 8 células T e 9 células K. Se o número de hemárcias for 2
        ou mais vezes o número de leucócitos a Giárdia recupera 50 unidades de energia
        vital.
        */
        
        // Ataque da Giardia
        paciente.setCelulasT(paciente.getCelulasT() - 8);
        paciente.setCelulasK(paciente.getCelulasK() - 9);
        
        // Recupearar energia vital
        if (paciente.getHemacias() >= paciente.getLeucocitos() * 2){
           this.setEnergiaVital(this.getEnergiaVital() + 50);
        }
        
        return listaDeAgentes;
    }
    
}
