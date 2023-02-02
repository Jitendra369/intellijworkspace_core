package com.interviewquestion;

import java.io.DataOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        double totalSal = 0;

        List<Employes> employesList = new ArrayList<>();
        employesList.add(new Employes(1, "Tom", 200000, 2));
        employesList.add(new Employes(2, "john", 300000, 4));
        employesList.add(new Employes(3, "Shaun", 250000, 2));
        employesList.add(new Employes(4, "Robert", 500000));

        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager(2,"jittu"));
        managerList.add(new Manager(4,"pooja"));

//        total expenses
        for (Employes em :
                employesList) {
            totalSal = totalSal + em.getSalary();
        }

        System.out.println("totalsal " + totalSal);

//        print the manager name for giver employe name
        String employeName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employe name, to find Manager name, we have employe");
        employesList.forEach(employes -> System.out.println(employes.getName()));
        employeName = scanner.nextLine();

        for (Employes em: employesList) {
            if (em.getName().equalsIgnoreCase(employeName)){
                for (Manager manager: managerList) {
                        if (em.getManagerId()== manager.getId()){
                            System.out.println("manager Name "+ manager.getName());
                        }
                  }
            }else {

            }
        }

        //sorting based on sal
        Collections.sort(employesList,  (employes1, employes2)-> {
            if (employes1.getSalary()== employes2.getSalary()){
                return  0;
            }else{
                return employes1.getSalary() > employes2.getSalary() ? 1 : -1;
            }
        });

        employesList.forEach(employes -> System.out.println(employes));

//        sort the employe based on alpabetical decending order
        Collections.sort(employesList, (emp1, emp2)->{
            if (emp1.getName().equals(emp2.getName())){
                return 0;
            }
                return emp1.getName().compareTo(emp2.getName());
        });

        System.out.println("sorting based on name");
            employesList.forEach(employes -> System.out.println(employes));

//        AbstractList

    }
}
