package com.primer.java.fajlovi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class kopiranjeNovo {
    public static void main(String args[]){
        Path osnovni = Paths.get("src\\com\\primer\\java\\fajlovi\\podaci","kopija.txt");
        System.out.println(osnovni.toAbsolutePath());
        Path kopija = Paths.get("src\\com\\primer\\java\\fajlovi\\podaci","kopijaKopije.txt");

        try {
            Files.copy(osnovni,kopija, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Fajl je kopiran.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
