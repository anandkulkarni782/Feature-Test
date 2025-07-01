package org.example.ARRAY;

public class par {
    public static  void main(String [] args){
        int[] array={1,5,2,4,8};
        int min = array[0];
        int max = array[0];

        for(int num : array){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        System.out.println("min="+min+"max="+max);
    }
}
