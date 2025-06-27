package org.example.STRING;

public class StringReverseWithoutUsingReverseMethd {
    public static void main(String [] args){
        String Input = "KulkarniAnandMadhusudan";
        String Result = "";
        for(int i=Input.length()-1;i>=0;i--){
            Result=Result + Input.charAt(i);
        }
        System.out.println(Result);
    }
}
