package org.example.STRING;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;


public class RemoveDuplcateElementsFromString {

    public static void main(String [] args ) {
        String Input = "KulkarniAnandMadhusudan";
        String Output = Input.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(Output);

    }

}
