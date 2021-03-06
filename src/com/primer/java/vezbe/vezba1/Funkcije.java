package com.primer.java.vezbe.vezba1;


import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Funkcije {
    public static String unos(){
        Scanner sc = new Scanner(System.in);
        return  sc.nextLine();
    }
    public static void radnja(int radnja){
        switch (radnja){
            case 1:
                Duznik d1 = new Duznik();
                System.out.print("Unesite ime duznika: ");
                d1.setIme(unos());
                System.out.print("Unesite adresu duznika: ");
                d1.setAdresa(unos());
                System.out.print("Unesite telefon duznika: ");
                d1.setTelefon(Integer.parseInt(unos()));
                Duznici.listaDuznika.add(d1);
                sacuvaj(Duznici.listaDuznika);
                break;
            case 2:
                System.out.print("Unesite ime duznika: ");
                citaj(unos());
                break;
            case 3:
                Dugovanje dug = new Dugovanje();
                System.out.print("Unesite stvar dugovanja: ");
                dug.setStvar(unos());
                System.out.print("Unesite kolicinu: ");
                dug.setKolicina(Integer.parseInt(unos()));
                System.out.print("Unesite ime duznika: ");
                dug.setDuznik(vratiDuznika(unos()));
                System.out.println("Dodali ste: " + dug.getStvar() + dug.getKolicina() + dug.getDuznik().getIme() + dug.getDuznik().getAdresa() + dug.getDuznik().getTelefon());
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Iabrali ste nepostojecu radnju.");
                break;
        }
    }
    public static void sacuvaj(List<Duznik> lista){
        try(
        FileOutputStream fo = new FileOutputStream("src\\com\\primer\\java\\vezbe\\vezba1\\podaci\\baza.txt")){
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(lista);
            oo.close();
            System.out.println("Uspesno sačuvana lista.");
        } catch (
        IOException e) {
            e.printStackTrace();
        }
    }
    public static void citaj(String Ime){
        try(FileInputStream fi = new FileInputStream("src\\com\\primer\\java\\vezbe\\vezba1\\podaci\\baza.txt")) {

            ObjectInputStream oi = new ObjectInputStream(fi);
            List<Duznik> listaDuznika = (List<Duznik>) oi.readObject();

            for(Duznik d1:listaDuznika){
                if(d1.getIme().equals(Ime)){
                    System.out.println(Ime + " je na adresi: " + d1.getAdresa() + ". Telefon je: " + d1.getTelefon());
                } else {
                    System.out.println("Duznik nije pronadjen.");
                }
            }

            oi.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Duznik vratiDuznika(String Ime){
        Duznik temp = null;
        try(FileInputStream fi = new FileInputStream("src\\com\\primer\\java\\vezbe\\vezba1\\podaci\\baza.txt")) {
            ObjectInputStream oi = new ObjectInputStream(fi);
            List<Duznik> listaDuznika = (List<Duznik>) oi.readObject();

            for(Duznik d1:listaDuznika){
                if(d1.getIme().equals(Ime)){
                    temp = d1;
                    System.out.println("Pronadjen");
                } else {
                    System.out.println("Duznik nije pronadjen.");
                }
            }

            oi.close();
        }   catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
}
