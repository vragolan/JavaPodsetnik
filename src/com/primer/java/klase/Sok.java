package com.primer.java.klase;

import com.primer.java.klase.alati.*;
import com.primer.java.klase.iterfejsi.MetodeSokovnika;

import java.util.ArrayList;
import java.util.List;

public class Sok {
    public static void main(String args[]){
        // pravljenje objekata
        Jabuka j2 = new Domaca();
        j2.setVrednost(6);
        Jabuka j3 = new Jabuka(JabukaBoja.PLAVA, JabukaVrsta.PRSKANA, 1);
        List<Jabuka> jabuke = new ArrayList<>();
        //dodavanje u listu
        jabuke.add(new Jabuka(JabukaBoja.ZELENA, JabukaVrsta.DOMACA, 9));
        jabuke.add(j2);
        jabuke.add(j3);
        // ispisisvanje
        for (Jabuka j: jabuke) {
            System.out.println(j.getVrsta());
        }
        // obrada
        MetodeSokovnika cedjenje = new Sokovnik();
        cedjenje.setKolicina(5);
        int Kolicina = cedjenje.iscedi(jabuke);
        System.out.println("Dobili ste " + Kolicina + "L soka.");
    }
}
