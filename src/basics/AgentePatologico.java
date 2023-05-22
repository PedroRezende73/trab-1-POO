
package basics;

public abstract class AgentePatologico {
    private static String identificacao;
    private int energia_vital;
    private static String classe_geral;
    private static String classe_especifica;

    public AgentePatologico(String identificacao, int energia_vital, String classe_geral, String classe_especifica) {
        this.identificacao = identificacao;
        this.energia_vital = energia_vital;
        this.classe_geral = classe_geral;
        this.classe_especifica = classe_especifica;
    }

    public static String getIdentificacao() {
        return identificacao;
    }

    public int getEnergia_vital() {
        return energia_vital;
    }

    public void setEnergia_vital(int energia_vital) {
        this.energia_vital = energia_vital;
    }
    
    public abstract void atacar(Paciente paciente);
       
    public static String getClasseGeral() {
        return classe_geral;
    }

    

}
