package main;

import basics.*;
import classeGeral.*;
import java.util.LinkedList;


public class Trabalho {

    public static void main(String[] args) {
        LinkedList <AgentePatologico> listaAgentes;
        Paciente paciente;
        
        Leitor leitorPatologicos = new Leitor("patologicos.txt");
        listaAgentes = leitorPatologicos.lerPatologicos();
        
        Leitor leitorPaciente = new Leitor("paciente.txt");
        paciente = leitorPaciente.lerPaciente();
        
        LinkedList<Object[]> patologias = new LinkedList<>();
        patologias.add(new Object[]{"Virus", Virus.getQtdFilhos()});
        patologias.add(new Object[]{"Bacterias", Bacteria.getQtdFilhos()});
        patologias.add(new Object[]{"Fungos", Fungo.getQtdFilhos()});
        patologias.add(new Object[]{"Protozoarios", Protozoario.getQtdFilhos()});
        
        System.out.println(Utils.obterClassesMaisInstanciadas(patologias));

        Acao.atacar(paciente, listaAgentes);

        /*
        System.out.println(paciente.getLeucocitos());
        System.out.println(paciente.getHemacias());
        System.out.println(paciente.getCelulasT());
        System.out.println(paciente.getCelulasK());
        */
    
    }

}

