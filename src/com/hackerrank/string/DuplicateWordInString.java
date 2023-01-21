package com.hackerrank.string;

import java.util.Arrays;

public class DuplicateWordInString {
    public static void main(String[] args) {
        String str ="Welcome to Java Session Session Session";
        System.out.println(str.length());

        String[] stringArr = str.split(" ");

//        for(String stri : stringArr){
//            System.out.println(stri);
//        }
//        System.out.println(Arrays.toString(stringArr)+" length of string : " + stringArr.length);

        String str2 ="what + is + my + name";
        String[] str22 = str2.split("\\+");
        for (String sring: str22) {
            System.out.println(sring);
        }
    }
}
