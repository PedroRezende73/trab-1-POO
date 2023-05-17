package esqueletotrabalho;


public class EsqueletoTrabalho {

    public static void main(String[] args) {
        
        Paciente paciente;
        
        Leitor leitorPatologicos = new Leitor("patologicos.txt");
        leitorPatologicos.lerPatologicos();

        Leitor leitorPaciente = new Leitor("paciente.txt");
        paciente = leitorPaciente.lerPaciente();
    }

}

