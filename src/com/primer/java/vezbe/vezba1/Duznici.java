package com.primer.java.vezbe.vezba1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Duznici  {
    public static List<Duznik> listaDuznika = new ArrayList<>();
    public static List<Dugovanje> listaDugovanja = new ArrayList<>();
    public static void main(String args[]){
        System.out.println("Izaberite opciju: \n" +
                "1) Novi duznik\n" +
                "2) Pretraga duznika\n" +
                "3) Novo dugovanje\n" +
                "4) Vraceno dugovanje\n");
        int izbor = Integer.parseInt(Funkcije.unos());
        Funkcije.radnja(izbor);


    }

}
