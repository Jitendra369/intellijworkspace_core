package com.collection.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorsTest {
    public static void main(String[] args) {

        Student stuRam = new Student("ram", 24);
        Student stuShyam = new Student("shyam", 22);
        Student stuShyam1 = new Student("shyam", 15);
        Student stuShyam2 = new Student("shyam", 12);
        Student stuMohan = new Student("mohan", 12);
        Student stuSohan = new Student("ashok", 48);

        List<Student> list = new ArrayList<>();
        list.add(stuRam);
        list.add(stuShyam);
        list.add(stuShyam1);
        list.add(stuShyam2);
        list.add(stuMohan);
        list.add(stuSohan);

        System.out.println(list);

        Collections.sort(list, new SortByName());

        System.out.println(list);

    }
}
