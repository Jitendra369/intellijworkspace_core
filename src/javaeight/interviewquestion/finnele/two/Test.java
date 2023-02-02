package javaeight.interviewquestion.finnele.two;

import javaeight.interfacec.interfacestataic.Inte;
import javaeight.interviewquestion.finnele.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

//        checkNameWithOccurance();

//        String with frequence of caracter present
//        checkCharWithOccurance();

        findMaxValue();

        findMaxSal();

    }

    private static void findMaxSal() {
        List<javaeight.interviewquestion.finnele.Employee> empList = new ArrayList<>();
        empList.add(new javaeight.interviewquestion.finnele.Employee("jittu", 30, 55000.44));
        empList.add(new javaeight.interviewquestion.finnele.Employee("pooja", 28, 52000.33));
        empList.add(new javaeight.interviewquestion.finnele.Employee("neetu", 32, 12000.33));
        empList.add(new Employee("ratna", 50, 155000.33));

        Double aDouble = empList.stream().map(item -> item.getSal()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(aDouble);

//        method 2
        Comparator<Double> comparator = (x, y)-> Double.compare(x, y);
        Double aDouble1 = empList.stream().map(itm -> itm.getSal()).collect(Collectors.maxBy(comparator)).get();
        System.out.println("max sal "+ aDouble1);
    }

    private static void findMaxValue() {
        System.out.println("find max value");
        List<Integer> list = Arrays.asList(25000,40000,12000,45000,78000,92000);
        Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(integer);

//       another way
        Integer integer1 = list.stream().collect(Collectors.maxBy((x, y) -> x - y)).get();
        System.out.println("max value "+ integer1);

//        Integer integer1 = list.stream().max((x, y) -> x - y).get();
    }

    private static void checkCharWithOccurance() {
        String name ="jittuu";
        Map<Character, Long> collect = name.chars().mapToObj(item -> (char) item).collect(Collectors.groupingBy(val -> val, Collectors.counting()));
        System.out.println(collect);
    }

    private static void checkNameWithOccurance() {
        List<String> list = Arrays.asList("honda","honda","hero","tvs","bajaj","bajaj","honda");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()));
        System.out.println(collect);
    }
}
