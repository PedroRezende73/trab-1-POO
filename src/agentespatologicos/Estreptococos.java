
package agentespatologicos;

import esqueletotrabalho.Bacteria;
import esqueletotrabalho.Paciente;


public class Estreptococos extends Bacteria {
    private final int energiaVital = 200;
    
    public Estreptococos(String identificacao) {
        super(identificacao);
    }

    /**
     *
     * @param paciente
     */
    @Override
    public void atacar(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
