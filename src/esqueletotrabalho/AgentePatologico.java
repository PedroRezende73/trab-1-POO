
package esqueletotrabalho;


public abstract class AgentePatologico {
    private String identificacao;
    private int energia_vital;
    private String classe_geral;
    private String classe_especifica;

    public AgentePatologico(String identificacao, int energia_vital, String classe_geral, String classe_especifica) {
        this.identificacao = identificacao;
        this.energia_vital = energia_vital;
        this.classe_geral = classe_geral;
        this.classe_especifica = classe_especifica;
    }
    
    public abstract void atacar(Paciente pacinete);
    
}
