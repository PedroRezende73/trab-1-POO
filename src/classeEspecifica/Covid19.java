package classeEspecifica;

import classeGeral.Virus;
import trabalho.Paciente;


public class Covid19 extends Virus{

    public Covid19(String identificacao) {
        super(identificacao, 100, "COVID 19");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
