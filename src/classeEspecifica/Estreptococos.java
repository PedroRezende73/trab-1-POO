package classeEspecifica;

import basics.AgentePatologico;
import classeGeral.Bacteria;
import basics.Paciente;
import java.util.LinkedList;

public class Estreptococos extends Bacteria {
    
    private boolean iniciarAtacando = true;

    public boolean getIniciarAtacando() {
        return this.iniciarAtacando;
    }

    public void setIniciarAtacando(boolean iniciarAtacando) {
        this.iniciarAtacando = iniciarAtacando;
    }
    

    public Estreptococos(String identificacao) {
        super(identificacao, 200, "Estreptococos");
    }
    
    public Estreptococos(String identificacao, boolean iniciarAtacando) {
        super(identificacao, 200, "Estreptococos");
        this.iniciarAtacando = iniciarAtacando;
    }

    @Override
    public void atacar(Paciente paciente, LinkedList<AgentePatologico> listaDeAgentes) {
        if(this.getIniciarAtacando()){
            this.verificaParceiro(listaDeAgentes);
        
            paciente.setHemacias(paciente.getHemacias() - 10);
            paciente.setCelulasK(paciente.getCelulasK() - 3);
            
            if(paciente.taVivo()){
                paciente.contraAtaque(this);
            }
            
        }else{
            System.out.println("Sou um filho e nao posso atacar de primeira, deixa pra próxima");
            this.setIniciarAtacando(true);
        }
    }
    
    @Override
    public void morrer(LinkedList<AgentePatologico> listaDeAgentes) {
        listaDeAgentes.remove(this);
    }
    
    public void verificaParceiro(LinkedList<AgentePatologico> listaDeAgentes){
        int index = listaDeAgentes.indexOf(this); 
        
        if(index == listaDeAgentes.size() - 1 && listaDeAgentes.get(0) instanceof Estreptococos){
            Estreptococos pai1 = this;
            Estreptococos pai2 = (Estreptococos) listaDeAgentes.get(0);

            String identificacaoFilho = pai1.getIdentificacao() + "--" + pai2.getIdentificacao();
            Estreptococos filho = new Estreptococos(identificacaoFilho, false);

            listaDeAgentes.add(filho);
            
            //Output para teste
            //System.out.println("=====SUCESSO AO GERAR FILHO=====");
            //System.out.println("Identificação do Filho Gerado: " + filho.getIdentificacao());
            //System.out.println("================================");
            
        }else if(index + 1 < listaDeAgentes.size() - 1 && listaDeAgentes.get(index + 1) instanceof Estreptococos){
            Estreptococos pai1 = this;
            Estreptococos pai2 = (Estreptococos) listaDeAgentes.get(index + 1);

            String identificacaoFilho = pai1.getIdentificacao() + "--" + pai2.getIdentificacao();
            Estreptococos filho = new Estreptococos(identificacaoFilho, false);

            listaDeAgentes.add(filho);
            
            //Output para teste
            //System.out.println("=====SUCESSO AO GERAR FILHO=====");
            //System.out.println("Identificação do Filho Gerado: " + filho.getIdentificacao());
            //System.out.println("================================");
            
        }
        
        

    }
    
}
