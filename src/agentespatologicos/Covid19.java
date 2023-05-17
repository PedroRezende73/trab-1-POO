package agentespatologicos;

import esqueletotrabalho.AgentePatologico;
import esqueletotrabalho.Paciente;


public class Covid19 extends AgentePatologico{

    public Covid19(String identificacao) {
        super(identificacao, 100, "Vírus", "COVID 19");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
