package org.example.STRING;

public class REMOVESPECIALCHARACTERFROMSTRING {

    public static void main(String [] args) {

        String str = "An@a$n%%d%Kulkarni";
       System.out.println( str.replaceAll("[^a-zA-Z]",""));

    }
}
