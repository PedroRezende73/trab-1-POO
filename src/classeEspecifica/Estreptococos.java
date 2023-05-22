package classeEspecifica;

import classeGeral.Bacteria;
import trabalho.Paciente;

public class Estreptococos extends Bacteria{
    
    public Estreptococos(String identificacao) {
        super(identificacao, 200, "Estreptococos");
    }
    
    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
