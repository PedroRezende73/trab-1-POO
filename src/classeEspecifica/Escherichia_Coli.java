package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import basics.Paciente;
import java.util.ArrayList;
import java.util.Random;

public class Escherichia_Coli extends Bacteria {

    public Escherichia_Coli(String identificacao) {
        super(identificacao, 12, "Escherichia coli");
    }

    @Override
    public void atacar(Paciente paciente, ArrayList<AgentePatologico> listaDeAgentes) {
        /*
        Essa Bactéria mata apenas 1 unidade de cada uma das células (leucócitos, hemárcias,
        celulas K e T). Mas possuem uma propriedade: Quando morrem, geram 2 filhas com
        metade da energia vital original e as dispersam pela fila (as colocam em posições
        aleatórias). Quando a energia vital inicial de uma Escherichia coli chega a 1 não
        ocorre mais a divisão no momento da morte.
         */
        // Ataque Escherichia_Coli
        paciente.setLeucocitos(paciente.getLeucocitos() - 1);
        paciente.setHemacias(paciente.getHemacias() - 1);
        paciente.setCelulasK(paciente.getCelulasK() - 1);
        paciente.setCelulasT(paciente.getCelulasT() - 1);

        // Criação de duas Escherichia_Coli apos sua morte 
        if (this.getEnergiaVital() <= 0) {
        } else {
            // Criação de um objeto random da classe java.util.Random para obter numeros aleatorios  
            Random random = new Random();

            // Geração dos números aleatórios
            int index1 = random.nextInt(listaDeAgentes.size());
            int index2 = random.nextInt(listaDeAgentes.size());

            // Criação das filhas da Escherichia_Coli após sua morte, dividindo sua energia vital por 2 para obter metade da energia vital
            AgentePatologico filha1 = new Escherichia_Coli("filha1");
            filha1.setEnergiaVital(this.getEnergiaVital() / 2);
            AgentePatologico filha2 = new Escherichia_Coli("filha2");
            filha2.setEnergiaVital(this.getEnergiaVital() / 2);

            // Adicionando as duas filhas na lista de agentes, em índices aleatórios gerados pelo random
            listaDeAgentes.add(index1, filha1);
            listaDeAgentes.add(index2, filha2);
        }
    }
}
