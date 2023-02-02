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
        
        stack.pop();
        String peek = stack.peek();
        stack.forEach(item-> System.out.println(item));
        System.out.println("value al the top of the stack : "+ peek);

        int poojaIndex = stack.search("pooja");
        if (poojaIndex==-1){
            System.out.println("element not present in stack");
        }else{
            System.out.println("location of pooja in stack :"+ poojaIndex);
        }

    }
}
