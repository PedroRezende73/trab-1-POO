package trabalho;

import classeGeral.Virus;
import classeGeral.Protozoario;
import classeGeral.Fungo;
import classeGeral.Bacteria;
import DTO.AgentePatologicoDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class EsqueletoTrabalho {

    public static void main(String[] args) {
        ArrayList <AgentePatologico> listaAgentes;
        Paciente paciente;
        
        Leitor leitorPatologicos = new Leitor("patologicos.txt");
        listaAgentes = leitorPatologicos.lerPatologicos();
        
        Leitor leitorPaciente = new Leitor("paciente.txt");
        paciente = leitorPaciente.lerPaciente();
        
        
        for (int i = 0; i < listaAgentes.size(); i++) {
            AgentePatologico elemento = listaAgentes.get(i);
            /*
            System.out.println(elemento.getClasseGeral());
            */
        }
        
        AgentePatologicoDTO[] countArr = {
            new AgentePatologicoDTO("Virus", Virus.getQtdFilhos()),
            new AgentePatologicoDTO("Fungo", Fungo.getQtdFilhos()),
            new AgentePatologicoDTO("Bacteria", Bacteria.getQtdFilhos()),
            new AgentePatologicoDTO("Protozoario", Protozoario.getQtdFilhos()),
        };
        
        ArrayList<AgentePatologicoDTO> arrAgentes = AgentePatologicoDTO.getMajorQtd(countArr);
        
        System.out.println(arrAgentes.toString());
        
        System.out.println("---------------------------------");
        
        System.out.println(paciente.getNome());
    }

}

