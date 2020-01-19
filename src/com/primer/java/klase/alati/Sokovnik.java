package com.primer.java.klase.alati;


import com.primer.java.klase.iterfejsi.MetodeSokovnika;

import java.util.List;

public class Sokovnik implements MetodeSokovnika {

    private int Kolicina;
    public int iscedi(List<Jabuka> jabuke){
        int rezutat = Kolicina;
        for (Jabuka j: jabuke) {
            rezutat+=j.getVrednost();
        }
        return rezutat;
    }

    @Override
    public void setKolicina(int Kolicina) {
        this.Kolicina = Kolicina;
    }
}
