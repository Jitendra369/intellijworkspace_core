package com.hackerrank.string;

public class CharacterSequence {
    public static void main(String[] args) {
        String str1 = "java";
        CharSequence chr ="Java";
        System.out.println(str1.contentEquals(chr)); // return false , case-sensetive
        StringBuffer buffer = new StringBuffer("Java");
        System.out.println(str1.contentEquals(buffer));  //// return false , case-sensetive
    }
}
