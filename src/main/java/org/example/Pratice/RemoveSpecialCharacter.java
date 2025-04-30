package org.example.Pratice;

public class RemoveSpecialCharacter {
    public static void main(String [] args) {
        String Input = "A*@na #nd";
        System.out.println(Input.replaceAll("[^a-zA-Z0-9]", ""));

        // Remove Spaces from String

        String input2 ="anand Kulkarni";
        System.out.println(input2.replaceAll("\\s",""));


    }

}