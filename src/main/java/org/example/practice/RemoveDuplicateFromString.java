package org.example.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String [] args)
    {
        String name = "anandMadhusudanKulkarni";
        LinkedHashSet set = new LinkedHashSet();
        StringBuilder strb = new StringBuilder();
        for(char ch : name.toCharArray()){
            if(set.add(ch)){
                strb.append(ch);
            }
        }

        System.out.println(strb.toString());

        name.chars().distinct().mapToObj(chars -> (char)chars).forEach(name1 -> System.out.println(name1));

    }
}
