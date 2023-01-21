package com.collection.comparators;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {


    @Override
    public int compare(Student stu1, Student stu2) {
        return stu1.getAge() - stu2.getAge();
    }
}
