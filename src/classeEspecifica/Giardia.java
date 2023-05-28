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
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {

        paciente.setCelulasT(paciente.getCelulasT() - 8);
        paciente.setCelulasK(paciente.getCelulasK() - 9);
        
        if(paciente.taVivo()){
            paciente.contraAtaque(this);
        }
        
        if (paciente.getHemacias() >= paciente.getLeucocitos() * 2){
           this.setEnergiaVital(this.getEnergiaVital() + 50);
           //Output para teste
            System.out.println("Me curei em 50 de Energia Vital pois sou uma Giárdia");
        }

    }
    
    @Override
    public void morrer(LinkedList<AgentePatologico> listaDeAgentes) {
        listaDeAgentes.remove(this);
    }
    
}
