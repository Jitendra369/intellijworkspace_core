package com.collection.comparablei;

import org.jetbrains.annotations.NotNull;

public class Employe implements Comparable<Employe>{
    private String firstName;
    private String lastName;

    public Employe() {
    }

//    compare the current object, which is comming in method
// if the string are not equal
    @Override
    public int compareTo(@NotNull Employe employe) {
        if (this.firstName.compareTo(employe.getFirstName())!= 0){
            return  this.firstName.compareTo(employe.getFirstName());
        }else{
            // we compare lastName if firstNames are equal
            return this.lastName.compareTo(employe.getLastName());
        }
    }

    public Employe(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
