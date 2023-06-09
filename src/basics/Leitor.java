package basics;

import classeEspecifica.HIV;
import classeEspecifica.Covid19;
import classeEspecifica.Giardia;
import classeEspecifica.Histoplasma;
import classeEspecifica.Escherichia_Coli;
import classeEspecifica.Estreptococos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Leitor {
    private final String arquivo;
    public LinkedList<AgentePatologico> listaDeAgentes;

    public Leitor(String arquivo) {
        this.arquivo = arquivo;
        this.listaDeAgentes = new LinkedList<>();
    }
    
    public LinkedList lerPatologicos() {
        try {
            FileInputStream patologico = new FileInputStream(arquivo);
            Scanner scan = new Scanner(patologico);
            while (scan.hasNext()) {
                int classeEspecifica = scan.nextInt();
                String identificacao = scan.next();
                /*
                 * System.out.println(classeEspecifica + " " + identificacao);
                */
                switch (classeEspecifica) {
                    case 1:
                        {
                            AgentePatologico agentePatologico = new HIV (identificacao);
                            //System.out.println(agentePatologico.getIdentificacao());
                            listaDeAgentes.add(agentePatologico);
                            break;
                        }
                    case 2:
                        {
                            AgentePatologico agentePatologico = new Estreptococos (identificacao);
                            //System.out.println(agentePatologico.getIdentificacao());
                            listaDeAgentes.add(agentePatologico);
                            break;
                        }
                    case 3:
                        {
                            AgentePatologico agentePatologico = new Giardia (identificacao);
                            //System.out.println(agentePatologico.getIdentificacao());
                            listaDeAgentes.add(agentePatologico);
                            break;
                        }
                    case 4:
                        {
                            AgentePatologico agentePatologico = new Covid19 (identificacao);
                            //System.out.println(agentePatologico.getIdentificacao());
                            listaDeAgentes.add(agentePatologico);
                            break;
                        }
                    case 5:
                        {
                            AgentePatologico agentePatologico = new Histoplasma (identificacao);
                            //System.out.println(agentePatologico.getIdentificacao());
                            listaDeAgentes.add(agentePatologico);
                            break;
                        }
                    case 6:
                        {
                            AgentePatologico agentePatologico = new Escherichia_Coli (identificacao);
                            //System.out.println(agentePatologico.getIdentificacao());
                            listaDeAgentes.add(agentePatologico);
                            break;
                        }
                    default:
                        break;
                        
                }
            }
            scan.close();
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
        }
        
        return listaDeAgentes;
    }
    
    public Paciente lerPaciente() {
        try {
            FileInputStream pacienteFile = new FileInputStream(arquivo);
            Scanner scan = new Scanner(pacienteFile);
            String nome = scan.next();
            int peso = scan.nextInt();
            double altura = scan.nextDouble();
            int idade = scan.nextInt();
            int leucocitos = scan.nextInt();
            int hemacias = scan.nextInt();
            int celulasT = scan.nextInt();
            int celulasK = scan.nextInt();
            Paciente paciente = new Paciente(nome, peso, altura, idade, leucocitos, hemacias, celulasT, celulasK);
            /*System.out.println(paciente.getNome()+ "\n" + paciente.getPeso() + "\n" + paciente.getAltura() + "\n" + paciente.getIdade() + "\n" + paciente.getLeucocitos() + "\n" + paciente.getHemacias() + "\n" + paciente.getCelulasT() + "\n" + paciente.getCelulasK());*/
            scan.close();
            return paciente;
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
        } 
        
        return new Paciente();
    }
    
}

