package org.example.Pratice;

import java.util.Arrays;
import java.util.Comparator;

public class RemoveSpecialCharacterFromString {
    public static void main(String [] args){
        String mix = "a&y*&";
        String refined = mix.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(refined);

        String mixq = "anand Madhusudan Kulkarni";
       String result = Arrays.stream(mixq.split(" ")).max(Comparator.comparing(s -> s.length())).get();
        System.out.println( result);

        String name ="anandKulkarni";
        name.chars().distinct().mapToObj(x -> (char) x).forEach(n -> System.out.println(n));

    }


}
