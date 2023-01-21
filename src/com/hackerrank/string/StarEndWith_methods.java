package com.hackerrank.string;

import java.util.Scanner;

public class StarEndWith_methods {
    public static void main(String[] args) {
        String str = "Java Programming";
        String name = "";


        System.out.println(str.startsWith("Java"));  // return true
        System.out.println(str.startsWith("Prog",5)); // return true

//        check for empty String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of student");
        name = scanner.nextLine();
        if (name.isEmpty()){
            System.out.println("no name is present");
        }else{
            System.out.println("your name is "+ name);
        }


    }
}
