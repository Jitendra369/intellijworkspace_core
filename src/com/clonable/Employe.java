package com.clonable;

public class Employe implements Cloneable{
    private String name;
    private String loca;

    public Employe() {
    }

    public Employe(String name, String loca) {
        this.name = name;
        this.loca = loca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoca() {
        return loca;
    }

    public void setLoca(String loca) {
        this.loca = loca;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", loca='" + loca + '\'' +
                '}';
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
