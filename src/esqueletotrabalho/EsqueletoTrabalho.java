package esqueletotrabalho;

import java.util.ArrayList;


public class EsqueletoTrabalho {

    public static void main(String[] args) {
        ArrayList <AgentePatologico> listaAgentes;
        Paciente paciente;
        
        Leitor leitorPatologicos = new Leitor("patologicos.txt");
        listaAgentes = leitorPatologicos.lerPatologicos();
        
        Leitor leitorPaciente = new Leitor("paciente.txt");
        paciente = leitorPaciente.lerPaciente();
        
        System.out.println(Utils.getMasterClass());
        System.out.println("---------------------------------");
        for (int i = 0; i < listaAgentes.size(); i++) {
            AgentePatologico elemento = listaAgentes.get(i);
            System.out.println(AgentePatologico.getClasseGeral());
        }
        
        System.out.println("---------------------------------");
        
        System.out.println(paciente.getNome());
    }

}

