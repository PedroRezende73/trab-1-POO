package classeEspecifica;

import classeGeral.Fungo;
import trabalho.Paciente;


public class Histoplasma extends Fungo{

    public Histoplasma(String identificacao) {
        super(identificacao, 1000, "Histoplasma");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
