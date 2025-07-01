package org.example.StreamAPI_YouTube;

public class removeDuplicatesFromString {

    public static void main(String [] args) {
      String Input ="Anand";
      Input.chars().distinct().mapToObj(x->(char)x).forEach(x->System.out.print(x));


    }

}
