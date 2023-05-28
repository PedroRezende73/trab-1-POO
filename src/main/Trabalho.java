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
        
        Acao.obterClassesMaisInstanciadas(Bacteria.getQtdFilhos(), Fungo.getQtdFilhos(), Protozoario.getQtdFilhos(), Virus.getQtdFilhos());

        Acao.iniciarBatalha(paciente, listaAgentes);
    }

}

