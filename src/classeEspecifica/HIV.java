package classeEspecifica;

import basics.Paciente;
import classeGeral.Virus;

public class HIV extends Virus {

    public HIV(String identificacao) {
        super(identificacao, 0, "HIV");
    }

    @Override
    public void atacar(Paciente paciente) {
        /*
        Quando ataca o HIV diminui a quantidade de leucócitos do paciente em 10 unidades,
        de células K em 5 unidades e de células T em 3 unidades. A reação do paciente não os
        afeta, ou seja, um HIV não morre quando sua energia vital chega a 0 (o paciente
        sempre perde no caso de haver um agente patológico do tipo HIV).
        */
        
       // Ataques do HIV
       paciente.setLeucocitos(paciente.getLeucocitos() - 10);
       paciente.setCelulasK(paciente.getCelulasK() - 5);
       paciente.setCelulasT(paciente.getCelulasT() - 3);  
       
       // Ele não irá morrer quando sua energia vital chegar a 0 irá ser implementado essa restrição após a criação da movimentação da lista 
    }
}
