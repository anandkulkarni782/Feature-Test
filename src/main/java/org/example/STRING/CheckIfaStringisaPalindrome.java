package org.example.STRING;

public class CheckIfaStringisaPalindrome {
   public static void main(String [] args){
       String Input = "ppAApp";
       System.out.println(Input.equals(new StringBuffer(Input).reverse().toString()));
   }
}
