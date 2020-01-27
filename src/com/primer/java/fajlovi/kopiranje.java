package com.primer.java.fajlovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class kopiranje {
    public static void main(String args[]){
        String osnovni = "src/com/primer/java/fajlovi/podaci/test.txt";
        String kopija = "src/com/primer/java/fajlovi/podaci/kopija.txt";

        try(
                FileReader freader = new FileReader(osnovni);
                BufferedReader breader = new BufferedReader(freader);
                FileWriter fwriter = new FileWriter(kopija);
            )
        {
            while(true){
                String linija = breader.readLine();
                if(linija == null){
                    break;
                } else{
                    fwriter.write(linija + "\n");
                }
            }

        } catch(Exception e){e.printStackTrace();}
    }
}
