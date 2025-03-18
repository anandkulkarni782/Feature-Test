package org.example.ARRAY;

public class LargestSmallestElement {

    public static void main(String [] args) {

    int[] InputArray = {10, 20, 30, 6, 80};
    int min = InputArray[0];
    int max = InputArray[0];

    for(int num :InputArray ) {

        if (num < min) {
            min = num;
        }
        if (num > max) {
            max = num;
        }

    }

    System.out.println("Smallest Number="+min);
    System.out.println("Largest Number="+max);

    }

}
