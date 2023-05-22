/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics;

import classeGeral.Protozoario;
import classeGeral.Virus;
import classeGeral.Fungo;
import classeGeral.Bacteria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Utils {
    
    public static String obterClassesMaisInstanciadas(ArrayList<Object[]> patologias) {
        Map<String, Integer> contador = new HashMap<>();
        int maxQuantidade = 0;

        // Conta a quantidade de ocorrências de cada classe
        for (Object[] patologia : patologias) {
            String nome = (String) patologia[0];
            int quantidade = (int) patologia[1];
            contador.put(nome, contador.getOrDefault(nome, 0) + quantidade);
            maxQuantidade = Math.max(maxQuantidade, contador.get(nome));
        }

        StringBuilder result = new StringBuilder();
        boolean empate = false;

        // Verifica as classes com a maior quantidade
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            String nome = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade == maxQuantidade) {
                if (empate) {
                    result.append(" e ");
                }
                result.append(nome);
                empate = true;
            }
        }

        result.insert(0, "As classes que mais aparecem - " + maxQuantidade + " indivíduos - são ");
        result.append(".");
        return result.toString();
    }
}
