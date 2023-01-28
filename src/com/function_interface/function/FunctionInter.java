package com.function_interface.function;

import com.function_interface.predicates.Employe;

import java.util.function.Function;

public class FunctionInter {
    public static void main(String[] args) {

        Function<Integer, String>  fun = integer -> integer * 10 + "data multiply by 10";
        System.out.println(fun.apply(120));


        Employe employe = new Employe();
        employe.setName("pooja");
        employe.setSalary(124);
        Function<Integer, String> empFun = age -> age * 10 +" daa";
        System.out.println(empFun.apply(124));


    }
}
