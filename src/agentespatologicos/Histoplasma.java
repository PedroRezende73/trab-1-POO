
package agentespatologicos;

import esqueletotrabalho.Fungo;
import esqueletotrabalho.Paciente;


public class Histoplasma extends Fungo {
    private final int energiaVital = 1000;
    
    public Histoplasma(String identificacao) {
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
