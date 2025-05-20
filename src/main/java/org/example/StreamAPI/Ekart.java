package org.example.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Ekart {

    public static void main(String [] args){
        List<Customers> list = List.of( new Customers(1,"anand","anandKulkarni782@gmail.com", Arrays.asList("9665876598","8830721592")),
                                        new Customers(2,"anagha","anaghachikshe@gmail.com",Arrays.asList("9604927330","8830721592")));
        list.stream().map( n-> n.getEmail() ).forEach(System.out::println);
        list.stream().flatMap(customers -> customers.getPhoneNumbers().stream()).forEach(System.out::println);

    }



}
