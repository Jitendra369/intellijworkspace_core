package com.function_interface.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

//     age criterial for all the govt exams
       Predicate<Integer> minAgeCreteria = age -> age <= 30;
       Predicate<Integer> maxAgeCreteria = age -> age >= 18;

        BiPredicate<Integer, Integer> boundAgeCriteria = (minAge, maxAge) -> minAge >= 18 && maxAge <= 30;

//        predicate chaning
        Predicate<Integer> goodLuckAge = minAgeCreteria.and(maxAgeCreteria).and(age -> age % 5 == 0);

        List<Integer> ages = Arrays.asList(23,45,25,47,12,02,14,54,48);

       List<Integer> validAgeCr = ages.stream().filter(minAgeCreteria.and(maxAgeCreteria)).collect(Collectors.toList());
       List<Integer> validAgeOfMax = ages.stream().filter(minAgeCreteria).collect(Collectors.toList());
//        List<Integer> validAge = ages.stream().filter(boundAgeCriteria.test()).collect(Collectors.toList());
        List<Integer> googluckAge = ages.stream().filter(goodLuckAge).collect(Collectors.toList());

        System.out.println(validAgeOfMax);
        System.out.println("min , Max age Criteria");
        System.out.println(validAgeCr);

        System.out.println("good luck age");
        System.out.println(googluckAge);
    }
}



