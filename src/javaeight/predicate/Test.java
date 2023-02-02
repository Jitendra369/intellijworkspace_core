package javaeight.predicate;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer ->  integer > 50;
        System.out.println(predicate.test(40));

        Predicate<String> strPredLen = str-> str.length() > 10;
        Predicate<String> strPredVal = str -> str.equals("android");

//        adding and predicate
        System.out.println(strPredLen.and(strPredVal));

//        adding or predicate
        System.out.println("string predicate");
        System.out.println((strPredLen.or(strPredVal)).test("jittu"));

        int x[] ={1,2,3,4,5,6,7,8,9};
        Predicate<Integer> p1 = val -> val%2==0;
        Predicate<Integer> p2 = val -> val > 2;

        System.out.println("check for even number");
        m1(p1, x);  // check for even number

        System.out.println("check if number is greater than 2");
        m1(p2,x);   // check if number is greater than 2

        System.out.println("even and greater than 2");
        m1(p2.and(p1), x);

        System.out.println("even or number is  greater than 2");
        m1(p2.or(p1), x);

    }

//    common method for all predicates
    private static void m1(Predicate<Integer> p1, int[] x) {
        for(int i: x){
            if (p1.test(i)){
                System.out.println(i);
            }
        }
    }
}
