package org.example.Pratice;

public class ReverseEachWordFromString {

    public static void main(String [] args) {
      String Input = "Anand Madhusudan Kulkarni";
      String [] stringarray = Input.split(" ");
      StringBuffer result = new  StringBuffer();
      for(int i=0;i<stringarray.length;i++){
          StringBuffer strbf = new StringBuffer(stringarray[i]);
          result.append(strbf.reverse());
          result.append(" ");
      }

      System.out.println(result.toString());

    }


}
