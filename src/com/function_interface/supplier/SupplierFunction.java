package com.function_interface.supplier;

import java.util.function.Supplier;

public class SupplierFunction {
//    only print output
    public static void main(String[] args) {
        Supplier<Double> supp = ()->Math.random();
        System.out.println(supp.get());
    }
}
