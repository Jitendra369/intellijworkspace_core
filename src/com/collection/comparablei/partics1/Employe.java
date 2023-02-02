package com.collection.comparablei.partics1;

import org.jetbrains.annotations.NotNull;

public class Employe implements Comparable<Employe> {
    private int age;
    private String name;

    public Employe() {
    }

    public Employe(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Employe employe) {
        if (this.age == employe.getAge()){
            return 0;
        }else {
            return this.age > employe.getAge() ? 1 : -1;
        }

    }
}
