package org.example.STRING;

public class ReverseWordsInString {
    public static void main(String [] args){
        String Input = "Anand Madhusudan Kulkarni";
        String [] words = Input.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++) {
            StringBuilder sb= new StringBuilder(words[i]);
            result.append(sb.reverse());
            result.append(" ");


        }
             System.out.println(result.toString());
    }

}
