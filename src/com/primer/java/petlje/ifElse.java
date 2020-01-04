package com.primer.java.petlje;

public class ifElse {
    public static void main(String args[]){
        int mesec = 13;

        if (mesec >= 1 && mesec <= 3){
            System.out.println("U prvom ste tromesecju.");
        } else if (mesec >= 4 && mesec <= 6){
            System.out.println("U drugom ste tromesecju");
        } else if (mesec >= 7 && mesec <= 9){
            System.out.println("U trecem ste tromesecju");
        } else if (mesec >= 10 && mesec <= 12){
            System.out.println("U cetvrtom ste tromesecju");
        } else {
            System.out.println("Nepoznato tromesecje");
        }
    }
}
