package org.example.ARRAY;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        Integer [] array1 ={1,2,3,5,3};
       List<Integer> list =  Arrays.asList(array1);
       Collections.reverse(list);
       System.out.println(Arrays.toString(array1));





        // Reverse An Array without swapping in memory just printing it.
        int[] array = {1,2,4,6,9,8,7};
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]);

        }



    }
}
