package com.hackerrank.string;

import java.util.Arrays;

public class GetByteMethod {
    public static void main(String[] args) {
        String str = "Java";
        byte[] byteArray;

        byteArray = str.getBytes();
        System.out.println(Arrays.toString(byteArray));
    }
}
