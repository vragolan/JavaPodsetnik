package com.primer.java.fajlovi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjektiPisanje {
    public static void main(String args[]){

        Osoba o1 = new Osoba();

        try(FileOutputStream fo = new FileOutputStream("src\\com\\primer\\java\\fajlovi\\podaci\\objekat.txt")){
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(o1);
            oo.close();
            System.out.println("Uspesno sačuvan objekat.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
