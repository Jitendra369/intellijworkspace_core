package javaeight.interviewquestion.finnele;

import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        getTheNthValue();
        NthValueOnEmpClass();


    }

    private static void NthValueOnEmpClass() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("jittu", 30, 55000.44));
        empList.add(new Employee("pooja", 28, 52000.33));
        empList.add(new Employee("neetu", 32, 12000.33));
        empList.add(new Employee("ratna", 50, 155000.33));

//        get second higesht sal emp
//        Employee employee = empList.stream().sorted((em1, em2) -> (int) (em2.getSal() - em1.getSal())).skip(1).findFirst().get();
        Employee employee = empList.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed()).skip(1).findFirst().get();
        System.out.println(employee);


    }

    private static void getTheNthValue() {
        List<Integer> items = Arrays.asList(25000,65000,12000,45000,48000);

        System.out.println("out list array ");
        items.forEach(ele -> System.out.print(ele+" "));
        System.out.println("---------");
//        find larget
        Integer integer = items.stream().sorted().findFirst().get();
        System.out.print(integer);  //12000 natural  sorting / sorted in acending order

//        sorting in decending order and then get the first value
        System.out.println("=-------------");
        Integer integer1 = items.stream().sorted((e1, e2) -> e2 - e1).findFirst().get();
        System.out.println(integer1);

//        get the second largest, use skip(1,2,3,4...) from the sorted stream
        System.out.println("=-------------");
        Integer secondLarg = items.stream().sorted((e1, e2) -> e2 - e1).skip(1).findFirst().get();
        System.out.println(secondLarg);
    }
}
