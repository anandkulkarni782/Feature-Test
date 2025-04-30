package org.example.Pratice;

import java.awt.desktop.SystemEventListener;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharactersFromArray {

  public static void main(String [] args){

      String input ="AnandKulkarni";
      LinkedHashSet set = new LinkedHashSet<>();
      StringBuilder strb = new StringBuilder();
      char [] charr = input.toCharArray();
      for(int i=0;i<charr.length;i++){
          if(set.add(charr[i])){
              strb.append(charr[i]);
          }
      }
      System.out.println(strb.toString());
  }

}
