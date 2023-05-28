package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import basics.Paciente;
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
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        paciente.setLeucocitos(paciente.getLeucocitos() - 1);
        paciente.setHemacias(paciente.getHemacias() - 1);
        paciente.setCelulasK(paciente.getCelulasK() - 1);
        paciente.setCelulasT(paciente.getCelulasT() - 1);
        
        if(paciente.taVivo()){
            paciente.contraAtaque(this);
        }
    }
    
    @Override
    public void morrer(LinkedList<AgentePatologico> listaDeAgentes) {
        if(!eFilho){
            this.gerarFilhos(listaDeAgentes);
        }
        listaDeAgentes.remove(this);
    }
    
    public void gerarFilhos(LinkedList<AgentePatologico> listaDeAgentes){
        Random random = new Random();
        int index1 = random.nextInt(listaDeAgentes.size());
        int index2 = random.nextInt(listaDeAgentes.size());
        
        AgentePatologico filha1 = new Escherichia_Coli(this.getIdentificacao()+"child-1", true);
        listaDeAgentes.add(index1, filha1);
        
        AgentePatologico filha2 = new Escherichia_Coli(this.getIdentificacao()+"child-2", true);
        listaDeAgentes.add(index2, filha2);
        
        //Output para teste
        //System.out.println("###Morri mas gerei dois filhos###");
    }
    
}
