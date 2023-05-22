package main;

import basics.Leitor;
import basics.Paciente;
import basics.Utils;
import basics.AgentePatologico;
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
        /*
        for (Object[] patologiaInfo : patologias) {
            String nome = (String) patologiaInfo[0];
            int quantidade = (int) patologiaInfo[1];
            System.out.println("Nome: " + nome + ", Quantidade: " + quantidade);
        }
        */
        
        System.out.println(Utils.obterClassesMaisInstanciadas(patologias));
        
        /*
        System.out.println("---------------------------------");
        for (int i = 0; i < listaAgentes.size(); i++) {
            AgentePatologico elemento = listaAgentes.get(i);
            System.out.println(AgentePatologico.getClasseGeral());
        }
        
        System.out.println("---------------------------------");
        
        System.out.println(paciente.getNome());
        */
    }

}

