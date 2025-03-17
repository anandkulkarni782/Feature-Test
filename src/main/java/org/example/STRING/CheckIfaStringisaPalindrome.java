package org.example.STRING;

public class CheckIfaStringisaPalindrome {
    public static boolean ispalandrom(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String [] args)
    {
       System.out.println(CheckIfaStringisaPalindrome.ispalandrom("PPAPP"));
    }

}
