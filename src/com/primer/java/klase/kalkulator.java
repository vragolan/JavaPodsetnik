package com.primer.java.klase;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class kalkulator {
    public static void main(String args[]){
        String s1 = ulaz("Unesite prvu vrednost: ");
        String s2 = ulaz("Unesite drugu vrednost: ");
        String r = ulaz("Izaberite radnju: + - * /");
        try{
        switch (r) {
            case "+":
                System.out.println("Rezultat je: " + saberi(s1, s2));
                break;
            case "-":
                System.out.println("Rezultat je: " + oduzmi(s1,s2));
                break;
            case "/":
                System.out.println("Rezultat je: " + deli(s1,s2));
                break;
            case "*":
                System.out.println("Rezultat je: " + mnozi(s1, s2));
                break;
            default:
                System.out.println("Radnja nije podrzana.");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String ulaz(String s){
        Scanner unos = new Scanner(System.in);
        System.out.println(s);
        return unos.nextLine();
    }
    private static double saberi(String b1,String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1+d2;
    }
    private static double oduzmi(String b1, String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1-d2;
    }
    private static double deli(String b1, String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1/d2;
    }
    private static double mnozi(String b1, String b2){
        double d1 = Double.parseDouble(b1);
        double d2 = Double.parseDouble(b2);
        return d1*d2;
    }
}
