package agentespatologicos;

import esqueletotrabalho.AgentePatologico;
import esqueletotrabalho.Bacteria;
import esqueletotrabalho.Paciente;
import java.util.ArrayList;
import java.util.Random;

public class Escherichia_Coli extends Bacteria {

    public Escherichia_Coli(String identificacao) {
        super(identificacao, 64, "Escherichia coli");
    }

    public void atacar(Paciente paciente, ArrayList<AgentePatologico> listaDeAgentes, AgentePatologico escherichia_coli) {
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
        if (escherichia_coli.getEnergia_vital() == 0) {
            
            // Criação de um objeto random da classe java.util.Random para obter numeros aleatorios  
            Random random = new Random();
            
            // Geração desses numeros aleatorios
            int index1 = random.nextInt(listaDeAgentes.size() + 1);
            int index2 = random.nextInt(listaDeAgentes.size() + 1);
            
            // Criação das filhas da Escherichia_Coli após sua morte dividindo sua energia vital por 2 para obter metade da energia vital
            AgentePatologico filha1 = new Escherichia_Coli("filha1");
            filha1.setEnergia_vital(filha1.getEnergia_vital() / 2);
            AgentePatologico filha2 = new Escherichia_Coli("filha2");
            filha2.setEnergia_vital(filha2.getEnergia_vital() / 2);
            
            // Adicionando as duas filhas em index aleatorios gerados pelo random a lista 
            listaDeAgentes.add(index1, filha1);
            listaDeAgentes.add(index2, filha2);
        }
    }
}
