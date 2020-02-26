package com.primer.java.vezbe.troskoviPoslodavca;

import java.util.Scanner;

public class Kalkulator {

    public static void main (String args[]){
        System.out.println("Unesite Neto iznos: ");
        Scanner sc = new Scanner(System.in);
        double plata = Double.parseDouble(sc.nextLine());

        double bezOlaksica = Funkcije.porez(plata) + Funkcije.pio(plata) + Funkcije.zdravstveno(plata) + Funkcije.nezaposlenost(plata);
        System.out.println("Troskovi bez olaksica: " + bezOlaksica);
        double saOlaksicama = Funkcije.porez(plata)-(Funkcije.porez(plata))*0.7 + Funkcije.zdravstveno(plata) + Funkcije.nezaposlenost(plata);
        System.out.println("Troskovi sa olaksicama: " +saOlaksicama);
        System.out.println("Usteda: " + (bezOlaksica-saOlaksicama));

    }
}
