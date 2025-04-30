package org.example.Pratice;

import java.util.Arrays;

public class SortTheStringInAlphabeticalOrder {
    public static void main(String [] args){
        String input = "AnandMadhusudanKulkarni";
        char [] chararray = input.toCharArray();
        Arrays.sort(chararray);
        System.out.println(new String(chararray));

    }
}
