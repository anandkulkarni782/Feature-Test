package org.example.STRING;

import java.util.LinkedHashSet;

public class RemoveDuplcateElementsFromString {

    public static String RemoveDuplicate(String Str) {
        LinkedHashSet set =new LinkedHashSet();
        StringBuilder sb= new StringBuilder();
        for(char c : Str.toCharArray()) {
            if(set.add(c)){
                sb.append(c);
            }
        }

        return sb.toString();

    }

    public static void main(String [] args){
        System.out.println(RemoveDuplcateElementsFromString.RemoveDuplicate("ANAND"));
    }




}
