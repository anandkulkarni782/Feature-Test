package org.example.STRING;
public class RemoveWhiteSpace {

    public static void main(String [] args){
        String INPUT = "Anand Kulkarni";
        String OUTPUT = INPUT.replaceAll("\\s","");
        System.out.println("Input String"+" "+INPUT);
        System.out.println("Output String"+" "+OUTPUT);
    }

}
