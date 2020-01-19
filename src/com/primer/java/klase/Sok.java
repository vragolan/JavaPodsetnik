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
        Jabuka j3 = new Uvozna();
        List<Jabuka> jabuke = new ArrayList<>();
        //dodavanje u listu
        jabuke.add(new Domaca());
        jabuke.add(j2);
        jabuke.add(j3);
        // ispisisvanje
        for (Jabuka j: jabuke) {
            String Poreklo = j.poreklo();
            System.out.println(j.getVrsta() + " jabuka, iz " + Poreklo + " vrednosti " + j.getVrednost());
        }
        // obrada
        MetodeSokovnika cedjenje = new Sokovnik();
        cedjenje.setKolicina(5);
        int Kolicina = cedjenje.iscedi(jabuke);
        System.out.println("Dobili ste " + Kolicina + "L soka.");
    }
}
