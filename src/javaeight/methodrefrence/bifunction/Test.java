package javaeight.methodrefrence.bifunction;

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFun = BifunctionDemo::add;

//        calling bifunction
        Integer apply = biFun.apply(35, 45);
        System.out.println(apply);
    }
}
