/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeGeral;

import basics.*;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Virus extends AgentePatologico{
    
    public static int qtdFilhos;

    public Virus(String identificacao, int energia_vital, String classe_especifica) {
        super(identificacao, energia_vital, "Vírus", classe_especifica);
        qtdFilhos++;
    }
    
    

    public static int getQtdFilhos() {
        return qtdFilhos;
    }

    

    @Override
    public abstract void atacar(Paciente paciente, ArrayList<AgentePatologico> listaDeAgentes);
}
