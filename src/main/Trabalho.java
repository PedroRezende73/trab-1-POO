package main;

import basics.*;
import classeGeral.*;
import java.util.ArrayList;


public class Trabalho {

    public static void main(String[] args) {
        ArrayList <AgentePatologico> listaAgentes;
        Paciente paciente;
        
        Leitor leitorPatologicos = new Leitor("patologicos.txt");
        listaAgentes = leitorPatologicos.lerPatologicos();
        
        Leitor leitorPaciente = new Leitor("paciente.txt");
        paciente = leitorPaciente.lerPaciente();
        
        ArrayList<Object[]> patologias = new ArrayList<>();
        patologias.add(new Object[]{"Vírus", Virus.getQtdFilhos()});
        patologias.add(new Object[]{"Bactérias", Bacteria.getQtdFilhos()});
        patologias.add(new Object[]{"Fungos", Fungo.getQtdFilhos()});
        patologias.add(new Object[]{"Protozoários", Protozoario.getQtdFilhos()});
        
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

