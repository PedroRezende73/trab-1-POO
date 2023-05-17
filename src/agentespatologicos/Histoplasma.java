package agentespatologicos;

import esqueletotrabalho.Fungo;
import esqueletotrabalho.Paciente;


public class Histoplasma extends Fungo{

    public Histoplasma(String identificacao) {
        super(identificacao, 1000, "Fungo", "Histoplasma");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
