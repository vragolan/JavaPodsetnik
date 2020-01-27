package com.primer.java.fajlovi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjektiCitanje {
    public static void main(String args[]){

        try(FileInputStream fi = new FileInputStream("src\\com\\primer\\java\\fajlovi\\podaci\\objekat.txt")) {

            ObjectInputStream oi = new ObjectInputStream(fi);
            Osoba o1 = (Osoba) oi.readObject();
            System.out.println(o1.getIme() + o1.getGodine());
            oi.close();
        }   catch (Exception e) {
            e.printStackTrace();
            }
    }
}
