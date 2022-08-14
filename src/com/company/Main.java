package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        System.out.println("i need to work very hard to achieve anything in my life");
//        List<Integer> ls= Arrays.asList(3,6,8,9,15);
//        ls.stream().map(number->number*3).forEach(System.out::println);
//
//        List<String> LS=Arrays.asList("utsav"," need"," to work"," very"," hard");
//        LS.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::print);
//
//        List<String> ls= Arrays.asList("i","need "," leave ","everything");
//        ls.stream().map(str->str.length()).forEach(System.out::println);



        List<Integer> ls=Arrays.asList(3,8,90,95,53187);
        ls.stream().filter(num->num%5==0).forEach(System.out::println);

        List<Integer> ls1=Arrays.asList(3,8,992094,9032,95,53187);
        ls.stream().filter(num->num%5==0).forEach(System.out::println);


        List<Integer> ls3=Arrays.asList(3,365,3670,96375,5387);
        ls.stream().filter(num->num%5==0).forEach(System.out::println);



    }
}
