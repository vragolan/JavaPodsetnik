package com.primer.java.petlje;

public class forWhite {
    public static void main(String args []){
        String[] meseci = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};

//        for (int i=0; i < meseci.length; i++){
//            System.out.println(meseci[i]);
//        }
//        for (int i = meseci.length - 1; i >= 0; i--){
//            System.out.println(meseci[i]);
//        }
//        for (String mesec: meseci){
//            System.out.println(mesec);
//        }
        int brojac = 0;
//        while(brojac < meseci.length){
//            System.out.println(meseci[brojac]);
//            brojac++;
//        }
        do {
            System.out.println(meseci[brojac]);
            brojac++;
        } while (brojac < meseci.length);




    }
}
