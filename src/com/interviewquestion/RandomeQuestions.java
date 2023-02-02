package com.interviewquestion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface functionInter{
    public int mul(int num1, int num2);
}


public class RandomeQuestions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,5,4,3,8,3,7,54);
        Map<Integer, String> booksHashMap = new HashMap<>();
        booksHashMap.put(1, "alchemist");
        booksHashMap.put(4, "bad banks");
        booksHashMap.put(5, "Aspirants");
        booksHashMap.put(2, "rich dad poor dad");
        booksHashMap.put(3, "Habbit");
        booksHashMap.put(3, "Mobbit");


//        travelList(numbers);
//        chekValueTimePresent(numbers,3);

//        travel hashhmap
//        iterateHashMapBooks(booksHashMap);

//        program to sort hashmap using java 8
//        sortingHashMap(booksHashMap);

        List<Employes> employesList = new ArrayList<>();
        employesList.add(new Employes(4, "RAHUL"));
        employesList.add(new Employes(1, "JITTU"));
        employesList.add(new Employes(3, "NEETU"));
        employesList.add(new Employes(2, "POOJA"));

//        sortEmploye(employesList);

//        collect only key set from map
//        collectKeyMap(booksHashMap);

//        get value from map
//        collectValueFromMap(booksHashMap);

//        get values from properties
        getValueFromPropetyFile();


    }

    private static void getValueFromPropetyFile() {
        try {
            FileReader propFile = new FileReader("C:\\Users\\Pooja Kadu\\IdeaProjects\\BankOFIndia\\src\\com\\interviewquestion\\db.properties");
            Properties properties = new Properties();
            properties.load(propFile);
            System.out.println("get username " + properties.getProperty("user"));
            System.out.println("get password "+ properties.getProperty("password"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void collectValueFromMap(Map<Integer, String> booksHashMap) {
        List<String> collect = booksHashMap.values().stream().collect(Collectors.toList());
        collect.forEach(item-> {
            System.out.println(item);
        });
    }

    private static void collectKeyMap(Map<Integer, String> booksHashMap) {
//        collect to set so as to remove the duplicate data
        Set<Integer> collect = booksHashMap.keySet().stream().collect(Collectors.toSet());
        collect.forEach(item->{
            System.out.println(item);
        });

        List<Integer> collect1 = booksHashMap.keySet().stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        for (Integer integer : collect1) {
            System.out.println(integer);
        }


//        List<Map.Entry<Integer, String>> collect1 = booksHashMap.entrySet().stream().collect(Collectors.toList());
//        System.out.println(collect1);
    }

    private static void sortEmploye(List<Employes> employesList) {
//        employesList.sort(Comparator.comparing(Employes::getName));
        employesList.sort((e1, e2)-> {
            return e1.getName().compareTo(e2.getName());
        });
        System.out.println(employesList);
    }

    private static void sortingHashMap(Map<Integer, String> booksHashMap) {
        System.out.println("before sorting ....");
        System.out.println(booksHashMap);

        System.out.println("after sorting");
        LinkedHashMap<Integer, String> collect = booksHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect);

    }

    private static void iterateHashMapBooks(HashMap<Integer, String> booksHashMap) {
        booksHashMap.forEach((k,v)->{
            System.out.println("key : "+ k+" value : " + v);
        });
    }

    private static void chekValueTimePresent(List<Integer> numbers, int numSearch) {
        long count = numbers.stream().filter(ele -> ele.equals(numSearch)).count();
        System.out.println("count : "+ count);
    }

        private static void travelList(List<Integer> numbers) {
        numbers.forEach(items-> System.out.print(items));
        System.out.println("");

        numbers.forEach(System.out::print);
    }
}
