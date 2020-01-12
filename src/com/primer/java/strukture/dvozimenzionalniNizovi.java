package com.primer.java.strukture;

public class dvozimenzionalniNizovi {
    public static void main(String args[]){
        String[][] osobe = new String[3][2];
        osobe[0][0] = "Pera";
        osobe[0][1] = "Peric";
        osobe[1][0] = "Petar";
        osobe[1][1] = "Petrovic";
        osobe[2][0] = "Marko";
        osobe[2][1] = "Markovic";

        for (int i = 0; i<osobe.length; i++){
            System.out.print("Osoba: ");
            StringBuilder sb = new StringBuilder();
            sb.append(osobe[i][0])
                    .append(" ")
                    .append(osobe[i][1]);
            System.out.println(sb);
        }

    }
}
