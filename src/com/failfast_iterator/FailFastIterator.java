package com.failfast_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastIterator {
    public static void main(String[] args) {
        Map<String, String> code = new HashMap<>();
        code.put("server", "SED");
        code.put("IP", "12454");
        code.put("AMO", "1454");

        Iterator<String> iterator = code.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            // adding an element to Map
            // exception will be thrown on next call
            // of next() method.
//            iterator.remove(); // if remove from iterator will not throw an error
            code.put("and", "android");
        }

        CopyOnWriteArrayList<Integer> list  = new CopyOnWriteArrayList<>();


    }
}
