package lambdaexpression.basic;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestUsingLambda {
    public static void main(String[] args) {
//        here we need not implement interface to use it method
        Operator<Integer> addOperation = (a,b)-> a+b;

        System.out.println(addOperation.process(10, 20));

        List<String> nameList = new ArrayList<>();
        nameList.add("jittu");
        nameList.add("pooja");

//        Consumer
        nameList.forEach( item -> {
            System.out.println(item);
        });

//        new Thread(()-> System.out.println("what is my name")).start();

    }
}
