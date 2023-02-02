package com.collection.linklist;

import java.util.LinkedList;
import java.util.List;

public class TestLinlList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("jittu");
        ll.add("pooja");
        ll.add("neetu");
        ll.add("ratna");

//        ll.removeIf(item-> item.equals("jittu"));
//        ll.remove(1);

//        ll.remove();  - remove the first element
//        ll.remove("neetu");
        ll.removeLast();
        ll.addFirst("sahebrao kadu");
        ll.set(0, "shamrao kadu");

        Object[] objects = ll.toArray();
        for (Object obe :
                objects) {
            System.out.println(obe.toString());
        }


//        jittu pooja neetu ratna

//        ll.forEach(item-> System.out.println(item));

    }
}
