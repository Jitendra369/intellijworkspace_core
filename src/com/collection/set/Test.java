package com.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> setN = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setN.addAll(Arrays.asList(new Integer[]{1,2,3,5}));
        setB.addAll(Arrays.asList(new Integer[]{1,50,14,15,5}));

        System.out.println("setN");
        setN.forEach(item-> System.out.print(" "+item)); // 1 2 3 5
        System.out.println("setB");
        setB.forEach(item-> System.out.print(" "+item)); // 1 50 14 15 5
//        to find union
//        create a new set to store the union
        Set<Integer> union = new HashSet<>(setN);
        union.addAll(setB);
        System.out.println("union of both N and B");
        union.forEach(item-> System.out.print(" " +item)); //1 2 50 3 5 14 15

        // To find intersection/ common
        Set<Integer> comEleSet = new HashSet<>(setN);
        comEleSet.retainAll(setB);
        System.out.println("common element in both the set");
        comEleSet.forEach(integer -> System.out.print(" " +integer)); //1 5

        // To find the symmetric difference/ no common element
        Set<Integer> commSet  = new HashSet<>(setB);
        commSet.removeAll(setN);
        System.out.println("uncommon elements are :");
        commSet.forEach(integer -> System.out.print(" "+ integer)); //50 14 15
        System.out.println("");

//        adding and checking/finding
        Set<String> names = new HashSet<>();
        names.add("jittu");
        names.add("pooja");
        names.add("neetu");
        names.add("ratna");

        String removeName = "jittu";

        boolean isNamePresent = names.contains(removeName);
        if (isNamePresent){
            names.remove(removeName);
        }

        for (String name : names) {
            System.out.print(" " +name);  // neetu pooja ratna
        }

    }
}
