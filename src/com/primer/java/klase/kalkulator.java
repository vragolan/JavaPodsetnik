package com.primer.java.klase;

import com.primer.java.klase.alati.Radnja;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class kalkulator {
    public static void main(String args[]){
        kalkulator k = new kalkulator();
        k.izracunaj();
    }

    protected void izracunaj() {
        Unos u = new Unos();
        String s1 = u.ulaz("Unesite prvu vrednost: ");
        String s2 = u.ulaz("Unesite drugu vrednost: ");
        String r = u.ulaz("Izaberite radnju: + - * /");
        try{
        switch (r) {
            case "+":
                System.out.println("Rezultat je: " + Radnja.saberi(s1, s2));
                break;
            case "-":
                System.out.println("Rezultat je: " + Radnja.oduzmi(s1,s2));
                break;
            case "/":
                System.out.println("Rezultat je: " + Radnja.deli(s1,s2));
                break;
            case "*":
                System.out.println("Rezultat je: " + Radnja.mnozi(s1, s2));
                break;
            default:
                System.out.println("Radnja nije podrzana.");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    class Unos{
        private String ulaz(String s){
            Scanner sc = new Scanner(System.in);
            System.out.println(s);
            return sc.nextLine();
        }
    }

}
