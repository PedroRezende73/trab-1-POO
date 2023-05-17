
package agentespatologicos;

import esqueletotrabalho.Paciente;
import esqueletotrabalho.Protozoario;


public class Giardia extends Protozoario {

    private final int energiaVital = 500;
    
    public Giardia(String identificacao) {
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
