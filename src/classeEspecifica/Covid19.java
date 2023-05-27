package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Virus;
import basics.Paciente;
import java.util.LinkedList;

public class Covid19 extends Virus {

    public Covid19(String identificacao) {
        super(identificacao, 100, "COVID 19");
    }

    @Override
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        /*
        O COVID19 elimina 10 leucócitos, 2 células T e 15 hemárcias. Se o número de
        hemárcias ficar menor que 200, o COVID19 promove um segundo ataque (antes de ir
        para o final da fila). O procedimento de segundo ataque não é recursivo, ou seja, não
        haverá um novo ataque depois do segundo ataque (notar que um segundo ataque
        promove também um segundo contra-ataque do corpo do paciente).
         */

        // Ataque do Covid19
        paciente.setLeucocitos(paciente.getLeucocitos() - 10);
        paciente.setCelulasT(paciente.getCelulasT() - 2);
        paciente.setHemacias(paciente.getHemacias() - 15);

        // Segundo ataque do Covid19
        if (paciente.getHemacias() < 200) {
            paciente.setLeucocitos(paciente.getLeucocitos() - 10);
            paciente.setCelulasT(paciente.getCelulasT() - 2);
            paciente.setHemacias(paciente.getHemacias() - 15);

            // Implementar um contra ataque para classe paciente
            paciente.contraAtaque(this);
        }
    }
}
