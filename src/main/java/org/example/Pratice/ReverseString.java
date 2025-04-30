package org.example.Pratice;

//Reverse String Without Using StringBuffer and StringBuilder

public class ReverseString {
    public static void main(String[] args) {
        String Input = "anandKulkarni";
        char [] arr = Input.toCharArray();
        for(int i = arr.length-1; i>=0;i--){
            System.out.print(arr[i]);
        }

        //  Reverse String With Using String Buffer and String Builder
        String Input1 = "AnaghaChikese";
        StringBuffer str = new StringBuffer(Input1);
        str.reverse();
        System.out.println("\n" +"OutputCOming from string builder"+str);

    }


    
    
}
