package com.hackerrank.string;

import org.w3c.dom.ls.LSOutput;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("defualt capacity "+ sb.capacity()); //16
        sb.append("hello their how are you ");

        System.out.println(sb);

        int index = sb.indexOf("their");

        sb.insert(index -1 , " jittu");
        System.out.println(sb);
        System.out.println("reverse String :" + sb.reverse()); //34
        // [ // Now (16*2)+2=34     i.e (oldcapacity*2)+2 ]
        System.out.println(sb.capacity());
    }



}
