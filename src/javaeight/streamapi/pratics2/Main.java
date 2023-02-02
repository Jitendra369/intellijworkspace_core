package javaeight.streamapi.pratics2;

import javaeight.interfacec.interfacestataic.Inte;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        stream.forEach(integer -> System.out.print(integer));

//         number divide by 2
        List<Integer> evenNoList = stream.filter(integer -> {
            if (integer % 2 == 0) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        for (Integer integer : evenNoList) {
            System.out.println(integer);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("integer stream list");
        Stream<Integer> integer = list.stream();
        integer.forEach(integer1 -> System.out.println(integer1));
    }
}