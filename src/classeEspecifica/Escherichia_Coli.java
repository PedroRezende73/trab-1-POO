package classeEspecifica;

import classeGeral.Bacteria;
import trabalho.Paciente;


public class Escherichia_Coli extends Bacteria{

    public Escherichia_Coli(String identificacao) {
        super(identificacao, 64, "Escherichia coli");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
