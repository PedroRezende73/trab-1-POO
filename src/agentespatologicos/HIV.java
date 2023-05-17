package agentespatologicos;

import esqueletotrabalho.AgentePatologico;
import esqueletotrabalho.Paciente;

public class HIV extends AgentePatologico{

    public HIV(String identificacao) {
        super(identificacao, 0, "Vírus", "HIV");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
