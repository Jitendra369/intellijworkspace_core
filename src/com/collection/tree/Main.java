package com.collection.tree;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        ts.forEach(item-> System.out.println(item));
    }
}
