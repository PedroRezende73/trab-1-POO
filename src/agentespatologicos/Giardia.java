package agentespatologicos;

import esqueletotrabalho.Protozoario;
import esqueletotrabalho.Paciente;

public class Giardia extends Protozoario{
    
    public Giardia(String identificacao) {
        super(identificacao, 500, "Protozoário", "Giárdia");
    }
    
    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
