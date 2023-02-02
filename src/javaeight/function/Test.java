package javaeight.function;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<String, Integer> lenFun = item -> item.length();
        Function<String, String> capital = str -> str.toUpperCase();

        System.out.println(lenFun.apply("jittu")); // 5
        System.out.println(capital.apply("pooja")); // POOJA
    }
}
