package agentespatologicos;

import esqueletotrabalho.Bacteria;
import esqueletotrabalho.Paciente;


public class Escherichia_Coli extends Bacteria{

    public Escherichia_Coli(String identificacao) {
        super(identificacao, 64, "Bactéria", "Escherichia coli");
    }

    @Override
    public void atacar(Paciente pacinete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
