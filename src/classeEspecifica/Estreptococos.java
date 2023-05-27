package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import basics.Paciente;
import java.util.ArrayList;

public class Estreptococos extends Bacteria {

    public Estreptococos(String identificacao) {
        super(identificacao, 200, "Estreptococos");
    }

    @Override
  public void atacar(Paciente paciente, ArrayList<AgentePatologico> listaDeAgentes) {
        /*
        Quando ataca, o Estreptococos diminui a quantidade de hemárcias do paciente em 10
        unidades e de células K em 3 unidades. Imediatamente antes de seu ataque, se
        houver um outro Estreptococos na sequência, na fila (próximo da fila), eles geram um
        novo Estreptococos que é colocado no final da fila (vai atacar apenas no dia
        seguinte). Esse novo Estreptococos gerado recebe Identificação feita a partir da
        combinação da identificação de seus “pais”: <identificação do primeiro da fila>--
        <identificação do segundo da fila>
        */
        
        // Ataque do Estreptococos
        paciente.setHemacias(paciente.getHemacias() - 10);
        paciente.setCelulasK(paciente.getCelulasK() - 3);
        
        // Verificar se há outro Estreptococos na sequência
        int index = listaDeAgentes.indexOf(this); // Índice do Estreptococos atual na lista
        
        // Verifica se existe um próximo elemento na lista e se ele é do tipo Estreptococos
        if (index < listaDeAgentes.size() - 1 && listaDeAgentes.get(index + 1) instanceof Estreptococos) {
            Estreptococos pai1 = this; // Estreptococos pai 1 (Estreptococos atual)
            Estreptococos pai2 = (Estreptococos) listaDeAgentes.get(index + 1); // Estreptococos pai 2 (próximo Estreptococos)
            
            // Combina as identificações dos pais para criar a identificação do filho
            String identificacaoFilho = pai1.getIdentificacao() + "--" + pai2.getIdentificacao();
            
            // Cria um novo Estreptococos com a identificação do filho
            Estreptococos filho = new Estreptococos(identificacaoFilho);
            
            // Adiciona o filho ao final da lista de agentes
            listaDeAgentes.add(filho);
        }
    }
}
