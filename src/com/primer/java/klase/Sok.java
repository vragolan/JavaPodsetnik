package com.primer.java.klase;

import com.primer.java.klase.alati.Jabuka;
import com.primer.java.klase.alati.Sokovnik;

import java.util.ArrayList;
import java.util.List;

public class Sok {
    public static void main(String args[]){
        Jabuka j1 = new Jabuka();
        Jabuka j2 = new Jabuka();
        Jabuka j3 = new Jabuka();
        List<Jabuka> jabuke = new ArrayList<>();
        jabuke.add(j1);
        jabuke.add(j2);
        jabuke.add(j3);
        for (Jabuka j: jabuke) {
            System.out.println(j.ime);
        }
        Sokovnik cedjenje = new Sokovnik();
        int kolicina = cedjenje.iscedi(jabuke);
        System.out.println("Dobili ste " + kolicina + "L soka.");
    }
}
