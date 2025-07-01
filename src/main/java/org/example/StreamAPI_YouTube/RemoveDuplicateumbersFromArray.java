package org.example.StreamAPI_YouTube;

import java.util.Arrays;

public class RemoveDuplicateumbersFromArray {
    public static void main(String [] args) {
      int [] Input = {1,4,2,5,6,2};
      Arrays.stream(Input).boxed().distinct().forEach(x -> System.out.print(x));

    }
}
