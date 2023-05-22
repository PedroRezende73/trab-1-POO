/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeGeral;

import trabalho.AgentePatologico;
import trabalho.Paciente;

/**
 *
 * @author Usuario
 */
public abstract class Bacteria extends AgentePatologico{
    
    public static int qtdFilhos;

    public Bacteria(String identificacao, int energia_vital, String classe_especifica) {
        super(identificacao, energia_vital, "Bacteria", classe_especifica);
        qtdFilhos++;
    }

    public static int getQtdFilhos() {
        return qtdFilhos;
    }

    
    
    @Override
    public void atacar(Paciente pacinete) {}
    
}
