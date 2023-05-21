package agentespatologicos;

import esqueletotrabalho.AgentePatologico;
import esqueletotrabalho.Protozoario;
import esqueletotrabalho.Paciente;

public class Giardia extends Protozoario{
    
    public Giardia(String identificacao) {
        super(identificacao, 500, "Giárdia");
    }
    
    public void atacar(Paciente paciente, AgentePatologico giardia) {
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
           giardia.setEnergia_vital(giardia.getEnergia_vital() + 50);
        }
    }
    
}
