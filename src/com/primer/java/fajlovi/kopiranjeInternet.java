package com.primer.java.fajlovi;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class kopiranjeInternet {

    private static final String IZVOR_RSS = "https://www.blic.rs/rss/danasnje-vesti.xml";

    public static void main(String args[]) throws IOException {
        InputStream citanjeOtvori = null;
        BufferedInputStream buf = null;
        try {
            URL adresa = new URL(IZVOR_RSS);

            citanjeOtvori = adresa.openStream();
            buf = new BufferedInputStream(citanjeOtvori);

            StringBuilder sb = new StringBuilder();

            while(true){
                int podaci = buf.read();
                if(podaci == -1){
                    break;
                } else {
                    sb.append((char)podaci);
                }
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            citanjeOtvori.close();
            buf.close();
        }

    }
}
