package org.example.StreamAPI_YouTube;

import java.util.Arrays;
import java.util.Comparator;

public class wordhavinghightlengthfromstring {
  //  Given a sentence, find the word that has the highest length || Most Asked

    public static void main(String [] args) {
        String name = "Anand Madhusudan Kulkarni";
        String result = Arrays.stream(name.split(" ")).max(Comparator.comparing(n -> n.length())).get();
        System.out.println(result);
    }
}


