package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import basics.Paciente;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Escherichia_Coli extends Bacteria {
    
    protected boolean eFilho = false;

    public Escherichia_Coli(String identificacao) {
        super(identificacao, 64, "Escherichia coli");
    }
    
    public Escherichia_Coli(String identificacao, boolean eFilho) {
        super(identificacao, 32, "Escherichia coli");
        this.eFilho = eFilho;
    }

    @Override
    public LinkedList atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        /*
        Essa Bactéria mata apenas 1 unidade de cada uma das células (leucócitos, hemárcias,
        celulas K e T). Mas possuem uma propriedade: Quando morrem, geram 2 filhas com
        metade da energia vital original e as dispersam pela fila (as colocam em posições
        aleatórias). Quando a energia vital inicial de uma Escherichia coli chega a 1 não
        ocorre mais a divisão no momento da morte.
         */


        // Criação de duas Escherichia_Coli apos sua morte 
        if (this.getEnergiaVital() <= 0 && !eFilho) {

            Random random = new Random();
            
            int index1 = random.nextInt(listaDeAgentes.size());
            int index2 = random.nextInt(listaDeAgentes.size());
            
            Iterator<AgentePatologico> iterator = listaDeAgentes.iterator();

            int posicao = 0;
            while (iterator.hasNext()) {
                AgentePatologico agente = iterator.next();
                int indexInsercao = listaDeAgentes.indexOf(agente) + 1; // Índice de inserção após o elemento atual
                if (posicao == index1) {
                    AgentePatologico filha1 = new Escherichia_Coli(this.getIdentificacao()+"child-1", true);
                    listaDeAgentes.add(indexInsercao, filha1); // Adiciona o novo elemento na posição determinada
                    iterator = listaDeAgentes.listIterator(indexInsercao + 1); // Atualiza o iterator para continuar a iteração a partir da próxima posição
                }else if (posicao == index2){
                    AgentePatologico filha2 = new Escherichia_Coli(this.getIdentificacao()+"child-2", true);
                    listaDeAgentes.add(indexInsercao, filha2); // Adiciona o novo elemento na posição determinada
                    iterator = listaDeAgentes.listIterator(indexInsercao + 1); // Atualiza o iterator para continuar a iteração a partir da próxima posição
                }
            }
        } else {
            // Ataque Escherichia_Coli
            paciente.setLeucocitos(paciente.getLeucocitos() - 1);
            paciente.setHemacias(paciente.getHemacias() - 1);
            paciente.setCelulasK(paciente.getCelulasK() - 1);
            paciente.setCelulasT(paciente.getCelulasT() - 1);
        }
        return listaDeAgentes;
    }
}
