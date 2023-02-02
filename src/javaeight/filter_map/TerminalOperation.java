package javaeight.filter_map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {
        Stream<Integer> stre = Stream.of(1,12,14,45,85);
        Object[] objects = stre.toArray();
        for(Object obj : objects){
            System.out.print(obj+" ");
        }

        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(23,"jittu"));
        empList.add(new Emp(32,"pooja"));
        empList.add(new Emp(23,"neetu"));
        empList.add(new Emp(56,"ratna"));



//        count
        Stream<Integer> s2 = Stream.of(1,4,5,7,84,6,7);
        long count = s2.count();
        System.out.println("count "+ count);

//        for each
        Stream<Integer> s3 = Stream.of(1,4,5,7,84,6,7);
        s3.forEach(integer -> System.out.println(integer));

//        min
        System.out.println("min value --------------");
        Stream<Integer> s4 = Stream.of(1,4,5,7,84,6,7);
        System.out.println(s4.min((o1, o2) -> o1.compareTo(o2)).get());  // min value 1

        //        max
        System.out.println("");
        System.out.println("max value --------------");
        Stream<Integer> s5 = Stream.of(1,4,5,7,84,6,7);
        System.out.println(s5.max((o1, o2) -> o1.compareTo(o2)).get());

        System.out.println("");
//        any match
        Stream<Integer> s6 = Stream.of(1,4,5,7,84,6,7);
        boolean match  = s6.anyMatch(integer -> integer > 22);
        System.out.println("result value :" +match);

        System.out.println("-------------");
        boolean mat = empList.stream().anyMatch(emp -> emp.getAge() > 22);
        System.out.println(mat);

        System.out.println("-----------------");
        boolean ageMatch = empList.stream().anyMatch(emp -> emp.getAge() < 30);
        System.out.println(ageMatch);

//        all match
        System.out.println("---------------");
        Stream<Integer> s7 = Stream.of(1,4,5,7,84,6,7);
        boolean match1 = s7.allMatch(ele -> ele % 2 == 0);
        System.out.println(match1);

//        find any
        System.out.println("------------");
        Stream<Integer> s8 = Stream.of(1,4,5,7,84,6,7);
        Integer integer = s8.findAny().get();
        System.out.println(integer);


//        find first
        System.out.println("------------");
        Stream<Integer> s9 = Stream.of(1,4,5,7,84,6,7);
        Integer integer1 = s9.findFirst().get();
        System.out.println(integer1);

        //        collect
        System.out.println("------------");
        Stream<Integer> s10 = Stream.of(1,4,5,7,84,6,7);
        List<Integer> collect = s10.collect(Collectors.toList());
        for (Integer integer2 : collect) {
            System.out.println(integer2);
        }


    }
}
