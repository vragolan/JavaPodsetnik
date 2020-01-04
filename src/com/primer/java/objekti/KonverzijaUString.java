package com.primer.java.objekti;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class KonverzijaUString {
    public static void main(String args[]){
        int i1 = 2;
        String intString = Integer.toString(i1);
        System.out.println(intString);

        boolean b1 = true;
        String bString = Boolean.toString(b1);
        System.out.println(bString);

        long l1 = 100_000_000;
        NumberFormat nf = NumberFormat.getInstance();
        String formatiran = nf.format(l1);
        System.out.println(formatiran);
    }
}
