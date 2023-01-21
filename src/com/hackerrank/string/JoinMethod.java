package com.hackerrank.string;

import java.util.ArrayList;
import java.util.List;

public class JoinMethod {
    public static void main(String[] args) {
        String str1 = "I";
        String str2 = "love";
        String str3 = "Java and India and whole world";

        String joinString = String.join("-", str1, str2, str3);
        System.out.println(joinString);

        List<String> list = new ArrayList<>();
        list.add("rama");
        list.add("goma");
        list.add("moma");
        list.add("pandu");
        list.add("landu");

        System.out.println(String.join("-", list));
        CharSequence charSequence = str3.subSequence(2, 10);
        System.out.println(charSequence.charAt(0));

//        character Array
        System.out.println("character Array");

        char[] charsOfStr3 = str3.toCharArray();
        System.out.println(charsOfStr3[10]);
        char c = str3.charAt(10);
        System.out.println(c);


    }
}
