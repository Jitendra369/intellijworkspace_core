package com.hackerrank.string;

public class Interns {
    public static void main(String[] args) {
        String str1 ="java";
        String str2 ="java";
        System.out.println(str1==str2); // return true, shared same memory

        String m1 = new String("name");
        String m2 = new String("name");

        System.out.println(m1==m2);  // return false

//        / using the intern() method
        // now both str1 and str2 share the same memory pool
         m1 = m1.intern();
         m2 = m2.intern();
        System.out.println(m1==m2);  // return true, share the same memory location
    }
}
