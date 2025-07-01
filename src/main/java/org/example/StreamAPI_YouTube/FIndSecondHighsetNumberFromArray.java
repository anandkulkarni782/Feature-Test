package org.example.StreamAPI_YouTube;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class FIndSecondHighsetNumberFromArray {
    public static void main(String [] args){
       int [] InputArray ={1,4,3,2,6,8};
        Optional<Integer> result = Arrays.stream(InputArray).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        result.ifPresent(n->System.out.println(n));
    }
}
