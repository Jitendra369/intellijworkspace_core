package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> person = new HashMap<>();
        person.put(1, "jittu");
        person.put(2, "neetu");
        person.put(3, "pooja");
        person.put(4, "ratna");

        System.out.println("size of map "+ person.size());
        System.out.println(person);

        // Checking if a key is present and if
        // present, print value by passing
        // random element

        if (person.containsKey(3)){
            String per = person.get(3);
            System.out.println("person name, "+ per);
        }

        Iterator iterator = person.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry next = (Map.Entry) iterator.next();
            if (next.getKey().equals(3)){
                iterator.remove();
            }
        }

        System.out.println(person);
    }
}
