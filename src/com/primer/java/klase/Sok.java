package com.primer.java.klase;

import com.primer.java.klase.alati.Jabuka;
import com.primer.java.klase.alati.Sokovnik;

import java.util.ArrayList;
import java.util.List;

public class Sok {
    public static void main(String args[]){
        // pravljenje objekata
        Jabuka j2 = new Jabuka();
        j2.setVrednost(6);
        Jabuka j3 = new Jabuka(Jabuka.DOMACA, "Ljubicasta", 1);
        List<Jabuka> jabuke = new ArrayList<>();
        //dodavanje u listu
        jabuke.add(new Jabuka(Jabuka.UVOZNA, "Crvena", 9));
        jabuke.add(j2);
        jabuke.add(j3);
        // ispisisvanje
        for (Jabuka j: jabuke) {
            System.out.println(j.getIme());
        }
        // obrada
        Sokovnik cedjenje = new Sokovnik();
        int kolicina = cedjenje.iscedi(jabuke);
        System.out.println("Dobili ste " + kolicina + "L soka.");
    }
}
