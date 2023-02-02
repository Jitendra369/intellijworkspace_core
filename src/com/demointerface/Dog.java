package com.demointerface;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("bhaw bhaw...");
//        loose coupling...
        Animal animal = new Cat();
        Animal animal1 = new Dog();
    }
}
