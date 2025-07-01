package org.example.practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String [] args) {
        String name = "Ananad Madhusudan Kulkarni";
        char[] ch = name.toCharArray();
        for (int i = ch.length - 1; i > 0; i--) {
            System.out.print(ch[i]);
        }

     StringBuilder builder  = new StringBuilder(name);
        System.out.println(builder.reverse());

    }


}
