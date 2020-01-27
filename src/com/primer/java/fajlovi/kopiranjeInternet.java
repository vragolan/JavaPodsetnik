package com.primer.java.fajlovi;

import java.io.*;
import java.net.URL;

public class kopiranjeInternet {

    private static final String IZVOR_RSS = "https://www.blic.rs/rss/danasnje-vesti.xml";
    private static final String DESTINACIJA = "src\\com\\primer\\java\\fajlovi\\podaci\\blic.xml";

    public static void main(String args[]) throws IOException {
        InputStream citanjeOtvori = null;
        BufferedInputStream buf = null;
        try {
            URL adresa = new URL(IZVOR_RSS);

            citanjeOtvori = adresa.openStream();
            buf = new BufferedInputStream(citanjeOtvori);
            FileWriter pisi = new FileWriter(DESTINACIJA);

            StringBuilder sb = new StringBuilder();

            while(true){
                int podaci = buf.read();
                if(podaci == -1){
                    break;
                } else {
                    sb.append((char)podaci);
                    pisi.write((char)podaci);
                }
            }

            System.out.println("Uspesno preuzet rss.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            citanjeOtvori.close();
            buf.close();
        }

    }
}
