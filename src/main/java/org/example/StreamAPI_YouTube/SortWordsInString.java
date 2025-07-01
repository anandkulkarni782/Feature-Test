package org.example.StreamAPI_YouTube;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortWordsInString {

    public static void main(String []  args){
       String Input = "Anand Madhusudan Kulkarni";
       String Output = Arrays.stream(Input.split(" ")).sorted(Comparator.reverseOrder()).collect(Collectors.joining(" "));
       System.out.println(Output);
    }

}
