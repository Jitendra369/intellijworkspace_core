package com.hackerrank.string;

public class IndexofOperator {
    public static void main(String[] args) {
        String statement ="java is swesome langauge";
        String rawData ="java +  is +   data";
        System.out.println(statement.lastIndexOf('a'));
        System.out.println(statement.indexOf('a'));
        System.out.println(statement.indexOf('a',5));
        System.out.println(statement.indexOf("langauge"));
        System.out.println(statement.substring(statement.indexOf("langauge")));

        String[] sub = rawData.split("\\+");
        for (String m : sub) {
            System.out.println(m.trim());
        }

    }
}
