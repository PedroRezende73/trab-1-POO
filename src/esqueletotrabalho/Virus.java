/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esqueletotrabalho;

/**
 *
 * @author Usuario
 */
public abstract class Virus extends AgentePatologico{

    public Virus(String identificacao, int energia_vital, String classe_geral, String classe_especifica) {
        super(identificacao, energia_vital, classe_geral, classe_especifica);
    }

    @Override
    public void atacar(Paciente pacinete) {}
    
}
