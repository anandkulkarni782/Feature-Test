package org.example.Pratice;


import java.util.HashMap;
import java.util.Map;

public class CalculateEachOccuranceOfCharacter {
    public static void main(String [] args){
        String Input="AnandKulkarni";
        Map<Character,Integer> map=new HashMap<>();
        char [] charray = Input.toCharArray();
        for(int i=0;i<charray.length;i++){
            if(!map.containsKey(charray[i])){
                map.put(charray[i],1);
            }
            else
            {
                int value = map.get(charray[i]);
                map.put(charray[i],value+1);
            }
        }

    System.out.println(map);

    }



}
