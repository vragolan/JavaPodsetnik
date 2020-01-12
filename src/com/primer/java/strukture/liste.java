package com.primer.java.strukture;

import java.util.ArrayList;
import java.util.List;

public class liste {
    public static void main(String args[]){
        List<String> lista = new ArrayList<>();
        lista.add("Srbija");
        lista.add("Francuska");
        lista.add("Holandija");
        System.out.println(lista);
        lista.add("Aljaska");
        System.out.println(lista);
        //brisanje
        lista.remove(0);
        System.out.println(lista);
        // pristup elementu liste
        String drzava = lista.get(1);
        System.out.println(drzava);
        // pozicija u listi
        int poz = lista.indexOf("Aljaska");
        System.out.println("Aljaksa je na poziciji: " + poz);

    }
}
