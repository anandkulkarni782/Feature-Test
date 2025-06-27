package org.example.STRING;

public class ReverseEachWordInString {
    public static void main(String [] args){
        String input = "Anand Mahusudan Kulkarni";
        String [] words = input.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i=0;i<words.length;i++){
            StringBuffer bf = new StringBuffer(words[i]);
            result.append(bf.reverse());
            result.append(" ");
        }
    }
}
