/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esqueletotrabalho;

/**
 *
 * @author Usuario
 */
public class Utils {
    public static String getMasterClass(){
        int qtdVirus = Virus.getQtdFilhos(), qtdBacterias = Bacteria.getQtdFilhos(), qtdProtozoarios = Protozoario.getQtdFilhos(), qtdFungos = Fungo.getQtdFilhos();
        return Virus.getClasseGeral();
    }
    
}
