package javaeight.filter_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list);

        System.out.println("print number greater than 5");
        numberGrateThe20(list);

        System.out.println("After adding 5 to each element");
        add5toEachElement(list);
    }

    private static void add5toEachElement(ArrayList<Integer> list) {
        List<Integer> listFive =list.stream().map(item -> item + 5).collect(Collectors.toList());
        listFive.forEach(integer -> System.out.print(" "+integer));
    }

    private static void numberGrateThe20(ArrayList<Integer> list) {
        List<Integer> collect = list.stream().filter(integer -> integer > 20).collect(Collectors.toList());
        collect.forEach(integer -> System.out.print(" "+integer));
    }
}
