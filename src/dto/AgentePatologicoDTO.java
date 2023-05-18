package DTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AgentePatologicoDTO {

    private String name = "";
    private Integer qtd = 0;

    public AgentePatologicoDTO(String name, Integer qtd) {
        this.name = name;
        this.qtd = qtd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "SimplesClass{" +
                "name='" + name + '\'' +
                ", qtd=" + qtd +
                '}';
    }

    public static ArrayList<AgentePatologicoDTO> getMajorQtd(AgentePatologicoDTO[] agentes){
        Arrays.sort(agentes, Comparator.comparing(AgentePatologicoDTO::getQtd).reversed());

        ArrayList<AgentePatologicoDTO> arrAgentes = new ArrayList<>();
        int max = -99999;
        for(AgentePatologicoDTO objeto : agentes){
            if(objeto.getQtd() >= max){
                arrAgentes.add(objeto);
                max = objeto.getQtd();
            }
        }

        return arrAgentes;
    }

}
