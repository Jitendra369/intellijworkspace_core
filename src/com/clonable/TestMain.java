package com.clonable;

public class TestMain {
    public static void main(String[] args) {
        Employe employe = new Employe("jittu","chandur bazar");
        System.out.println(employe.toString());

        System.out.println("Creating the clone object");
        Employe employeCopy = null;
        try {
//            clone of original object
            employeCopy = (Employe) employe.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        employeCopy.setName("pooja");
        employeCopy.setLoca("wardha");


        System.out.println(" [ old object hashcode "+ employe.hashCode()+" and data "+ employe.toString()+" ]");
        System.out.println("[ new object hashcode "+ employeCopy.hashCode()+" and data is "+ employeCopy.toString()+" ]");
    }
}
