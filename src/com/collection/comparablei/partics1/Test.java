package com.collection.comparablei.partics1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employe employe = new Employe(60,"jittu");
        Employe employe1 = new Employe(8,"neetu");
        Employe employe2 = new Employe(52,"ritu");
        Employe employe3 = new Employe(35,"mitu");
        Employe employe4 = new Employe(45,"sulu");
        List<Employe> employes = new ArrayList<>();
        employes.add(employe);
        employes.add(employe1);
        employes.add(employe2);
        employes.add(employe3);
        employes.add(employe4);

//        Collections.sort(employes);


//        printing the employee
//        employes.forEach(emp-> {
//            System.out.println("Age "+emp.getAge() +" name "+ emp.getName());
//        });

//        comparator using lambda
//        Collections.sort(employes, (e1, e2)->{
//            if (e1.getAge()== e2.getAge()){
//                return 0;
//            }else{
//                return e1.getAge() > e2.getAge() ? 1 : -1;
//            }
//        });

//        sorting by name
        Collections.sort(employes, Comparator.comparing(Employe::getName));

        employes.forEach(emp-> {
            System.out.println("Age "+emp.getAge() +" name "+ emp.getName());
        });


    }
}
