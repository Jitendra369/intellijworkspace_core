package com.collection.comparablei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Test {
    public static void main(String[] args) {


//        List<Employe> employeList = new ArrayList<>();

        Employe employe = new Employe("jittu","wankhade");
        Employe employe1 = new Employe("pooja","mate");
        Employe employe2 = new Employe("neetu","ingale");
        Employe employe3 = new Employe("ratna","rane");

        Employe[] employesArray = new Employe[4];
        employesArray[0] = employe;
        employesArray[1] = employe1;
        employesArray[2] = employe2;
        employesArray[3] = employe3;

//        Arrays.sort(employesArray);  // natural sorting
        Arrays.sort(employesArray, Collections.reverseOrder());  // reverse sorting
        printArray(employesArray);


//        demo
//        Person person = new Person("jittu","kadu");
//        Person person2 = new Person("saurabh","rane");
//
//        Person[] per = new Person[2];
//        per[0] = person;
//        per[1] = person2;
//
//        Arrays.sort(per);
//        printArrayPerson(per);
    }

    private static void printArray(Employe[] employesArray) {
        for (int i=0;i< employesArray.length;i++){
            System.out.println(employesArray[i]);
        }
    }
    private static void printArrayPerson(Person[] personArray) {
        for (int i=0;i< personArray.length;i++){
            System.out.println(personArray[i]);
        }
    }
}
