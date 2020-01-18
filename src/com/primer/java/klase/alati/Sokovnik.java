package com.primer.java.klase.alati;


import java.util.List;

public class Sokovnik {

    public int iscedi(List<Jabuka> jabuke){
        int rezutat = 0;
        for (Jabuka j: jabuke) {
            rezutat+=j.getVrednost();
        }
        return  rezutat;
    }
}
