package classeEspecifica;

import classeGeral.Protozoario;
import trabalho.Paciente;

public class Giardia extends Protozoario{
    
    public Giardia(String identificacao) {
        super(identificacao, 500, "Giárdia");
    }
    
    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
