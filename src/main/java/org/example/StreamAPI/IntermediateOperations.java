package org.example.StreamAPI;

import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {
    public static void main(String []  args) {
        List<String> names = List.of("ANAND","ANAGHA");
        names.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));


        List<Integer> Numbers = List.of(10,20,30,40,50,60,70,80,90);
        Numbers.stream().sorted().forEach(System.out::println);
        // by default assending order

        Numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
