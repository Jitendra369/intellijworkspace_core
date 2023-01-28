package com.function_interface.consumer;

import com.function_interface.predicates.Employe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Employe employe = new Employe();

        Consumer<Employe> consumeEmploye = employe1 -> employe.setName("pooja kadu");
        consumeEmploye.accept(employe);

        List<String> list = Arrays.asList("pooja", "neetu", "jittu");

        System.out.println(employe);
    }

}
