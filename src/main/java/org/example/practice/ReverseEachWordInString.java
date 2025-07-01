package org.example.practice;

public class ReverseEachWordInString {
    public static void main(String [] args){
         String name = "Anand Madhusudan Kulkarni";
         String [] op = name.split(" ");
         StringBuilder builder = new StringBuilder();
         for(int i=0;i<op.length;i++){
             StringBuilder br = new StringBuilder(op[i]);
            builder.append( br.reverse());
            builder.append(" ");
         }

         System.out.println(builder);
    }
}
