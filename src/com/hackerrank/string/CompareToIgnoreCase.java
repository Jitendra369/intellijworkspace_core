package com.hackerrank.string;

//returns 0 if the strings are equal, ignoring case considerations
//        returns a negative integer if string comes before the str argument in the dictionary order
//        returns a positive integer if string comes after the str argument in the dictionary order


public class CompareToIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "learn java";
        String str3 = "Learn Kolin";

        String A = "A";
        String B ="D";

        System.out.println(str1.compareToIgnoreCase(str2) );
        System.out.println(str1.compareToIgnoreCase(str3) );
        System.out.println(str3.compareToIgnoreCase(str2) );

        System.out.println("compareTO()");
        System.out.println(A.compareTo(B));
    }
}
