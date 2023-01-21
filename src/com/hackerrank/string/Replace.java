package com.hackerrank.string;

import javax.xml.transform.sax.SAXSource;

public class Replace {
    public static void main(String[] args) {
        String str1 = "bat ball";
        String newString = str1.replace("bat", "mat");
        System.out.println("new string "+ newString + " old "+ str1);
        String pargraph = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy";

        System.out.println(pargraph.replace("happy", "sad"));
//        System.out.println(pargraph.replaceAll());
    }
}
