package org.example.Pratice;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static String removeDuplicate(String str){
        LinkedHashSet set = new LinkedHashSet<>();
        StringBuilder bdr = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(set.add(c)){
                bdr.append(c);
            }

        }
        return  bdr.toString();
    }
    public static void main(String [] args){
        System.out.println(RemoveDuplicate.removeDuplicate("Anand"));
        String name = "anand";



    }



}
