package basics;


public class Paciente {
    private String nome;
    private int peso;
    private double altura;
    private int idade;
    protected int leucocitos;
    protected int hemacias;
    protected int celulasT;
    private int celulasK;
    
    public Paciente(String nome, int peso, double altura, int idade, int leucocitos, int hemacias, int celulasT, int celulasK) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.leucocitos = leucocitos;
        this.hemacias = hemacias;
        this.celulasT = celulasT;
        this.celulasK = celulasK;
    }
    
    public Paciente(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getLeucocitos() {
        return leucocitos;
    }

    public void setLeucocitos(int leucocitos) {
        this.leucocitos = leucocitos;
    }

    public int getHemacias() {
        return hemacias;
    }

    public void setHemacias(int hemacias) {
        this.hemacias = hemacias;
    }

    public int getCelulasT() {
        return celulasT;
    }

    public void setCelulasT(int celulasT) {
        this.celulasT = celulasT;
    }

    public int getCelulasK() {
        return celulasK;
    }

    public void setCelulasK(int celulasK) {
        this.celulasK = celulasK;
    }

    public void contraAtaque(AgentePatologico agente){
        double dano;
        //System.out.println(this.getIdade());
        dano = (this.getLeucocitos()/(this.getPeso()*this.getAltura()*this.getIdade()));
        agente.setEnergiaVital((int) (agente.getEnergiaVital() - dano));
        
        //if(agente.getEnergiaVital()<= 0) System.out.println(agente.getEnergiaVital());
    }
    
    public boolean taVivo(){
        return !(this.getLeucocitos() <= 0 || this.getHemacias() <= 0 || this.getCelulasT() <= 0 || this.getCelulasT() <= 0);
    }

}
