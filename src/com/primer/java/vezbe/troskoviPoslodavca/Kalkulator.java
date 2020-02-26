package com.primer.java.vezbe.troskoviPoslodavca;

import java.util.Scanner;

public class Kalkulator {

    public static void main (String args[]){
        System.out.println("Unesite Neto iznos: ");
        Scanner sc = new Scanner(System.in);
        double plata = Double.parseDouble(sc.nextLine());

        System.out.println("Troskovi bez olaksica: " + Funkcije.bezOlaksica(plata));

        System.out.println("Troskovi sa olaksicama prve godine: " + Funkcije.olaksicePrva(plata));
        System.out.println("Usteda: " + (Funkcije.bezOlaksica(plata) - Funkcije.olaksicePrva(plata)));

        System.out.println("Troskovi sa olaksicama druge godine: " + Funkcije.olaksiceDruga(plata));
        System.out.println("Usteda: " + (Funkcije.bezOlaksica(plata) - Funkcije.olaksiceDruga(plata)));

        System.out.println("Troskovi sa olaksicama trece godine: " + Funkcije.olaksiceTreca(plata));
        System.out.println("Usteda: " + (Funkcije.bezOlaksica(plata) - Funkcije.olaksiceTreca(plata)));

        System.out.println("Ukupan trošak bez olakšica za 3god: " + Funkcije.bezOlaksica(plata)*3);
        System.out.println("Ukupan trošak sa olaksicama za 3god: " + (Funkcije.olaksicePrva(plata) + Funkcije.olaksiceDruga(plata) + Funkcije.olaksiceTreca(plata)));
        System.out.println("Ukupna ušteda za 3god: " + ((Funkcije.bezOlaksica(plata)*3) - (Funkcije.olaksicePrva(plata) + Funkcije.olaksiceDruga(plata) + Funkcije.olaksiceTreca(plata))));

    }
}
