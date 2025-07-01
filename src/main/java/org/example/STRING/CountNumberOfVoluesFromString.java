package org.example.STRING;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountNumberOfVoluesFromString {
    public static void main(String [] args) {
       String Input = "Anand Madhusudan Kulkarni";
       Long Count = Input.chars().filter(ch -> "aeiou".indexOf(ch)!= -1).count();
       System.out.println(Count);

       String result = Input.chars().mapToObj(c -> (char)c).distinct().map(String :: valueOf).collect(Collectors.joining());
       System.out.println(result);
    }
}
