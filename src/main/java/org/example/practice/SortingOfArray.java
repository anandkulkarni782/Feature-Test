package org.example.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingOfArray {
    public static void main(String[] args) {

        Integer [] array = {1,4,2,5,3,6};
        Arrays.stream(array).sorted(Comparator.reverseOrder()).forEach(n-> System.out.println(n));

    }
}