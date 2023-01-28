package com.collection.stack;


import java.util.*;

public class Test {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();
        stack.push("jittu");
        stack.push("neetu");
        stack.push("pooja");
        stack.push("ratna");
        stack.push("sahebrao");

        Iterator<String> iterator = stack.iterator();

//        stack values
        while (iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }
        System.out.println();
        System.out.println("remove last element ");
        String lastElement = stack.pop();

        System.out.println("after removing the element from stack");

        ArrayList<String> reve = new ArrayList<>();

        TreeSet<String> tr = new TreeSet<>();



//        iterator = stack.iterator();
//        while(iterator.hasNext()){
//            reve.add(iterator.next());
//        }
//
//        System.out.println();
//        Iterator<String> pr = reve.iterator();
//        while(pr.hasNext()){
//            System.out.print(pr.next()+" ");
//        }


    }
}
