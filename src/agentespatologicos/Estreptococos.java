package agentespatologicos;

import esqueletotrabalho.AgentePatologico;
import esqueletotrabalho.Paciente;

public class Estreptococos extends AgentePatologico{
    
    public Estreptococos(String identificacao) {
        super(identificacao, 200, "Bactéria", "Estreptococos");
    }
    
    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
