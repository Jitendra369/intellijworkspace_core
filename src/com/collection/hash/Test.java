package com.collection.hash;

import java.awt.print.PrinterGraphics;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer , String > name = new HashMap<>();
        name.put(1, "jittu");
        name.put(2, "neetu");
        name.put(3, "pooja");
        name.put(4, "ratna");

        for (Map.Entry<Integer , String> items : name.entrySet()){
            System.out.println(items.getKey() +" value is "+ items.getValue());
        }
    }
}
