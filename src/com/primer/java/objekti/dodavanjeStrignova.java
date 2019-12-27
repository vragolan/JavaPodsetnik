package com.primer.java.objekti;

import java.util.Scanner;

public class dodavanjeStrignova {
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "World!";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb);

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite vrednost: ");
        String unos = scan.nextLine();
        System.out.println("Uneta vrednost: " + unos);

        sb.delete(0, sb.length());
        System.out.println("Sb je:" + sb);

        for(int i = 0; i < 3; i++){
            System.out.println("Unos " + i +":");
            unos = scan.nextLine();
            sb.append(unos + "\n");
        }
        System.out.println(sb);
    }
}
