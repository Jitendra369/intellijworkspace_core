package com.hackerrank.string;

import basic.super_key_init_param.Employe;

import java.util.ArrayList;
import java.util.List;

public class Valueof_method {
    public static void main(String[] args) {
        int a = 5;
        char ch[] = {'J', 'a', 'v', 'a'};
        long l = -2343834L;
        float f = 23.4f;
        double d = 923.234d;
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(d));
        System.out.println((String.valueOf(ch)).toUpperCase());
        String modiString = String.valueOf(ch,1,3).toUpperCase();
        System.out.println(modiString);
        System.out.println((String.valueOf(ch)).toUpperCase());

        List<String> lan = new ArrayList<>();
        lan.add("java");
        lan.add("android");
        lan.add("python");

//        System.out.println(String.valueOf(lan));
//        System.out.println(lan.toString());
        EmpModel empModel = new EmpModel();
        empModel.setId("12");
        empModel.setName("jittu");

        System.out.println(empModel.toString());


    }
}
