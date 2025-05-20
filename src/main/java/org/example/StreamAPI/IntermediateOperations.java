package org.example.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {
    public static void main(String []  args) {
        List<String> names = List.of("ANAND","ANAGHA");
        names.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));


        List<Integer> numbers = Arrays.asList(1,3,2,7,9,8);
        numbers.stream().sorted().forEach(n -> System.out.println(n));
        System.out.println("\n");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.println(+n));


        List<String>name = List.of("anand","anagha","amruta");
        name.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));


        List<String> sentences = List.of("hello world", "java streams");


    }
}
