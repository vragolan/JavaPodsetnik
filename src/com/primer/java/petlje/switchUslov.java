package com.primer.java.petlje;

import java.util.Scanner;

public class switchUslov {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        String uneto = sc.nextLine();

        int brojMeseca = Integer.parseInt(uneto);

        switch (brojMeseca){
            case 1:
                System.out.println("Mesec je Januar");
            case 2: System.out.println("Mesec je Februar");
                break;
            case 3: System.out.println("Mesec je Mart");
                break;
            case 4: System.out.println("Mesec je April");
                break;
            case 5: System.out.println("Mesec je Maj");
                break;
            case 6: System.out.println("Mesec je Jun");
                break;
            default: System.out.println("Nepoznat mesec");
                break;
        }

    }
}
