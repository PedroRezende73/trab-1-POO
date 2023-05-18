/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esqueletotrabalho;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
