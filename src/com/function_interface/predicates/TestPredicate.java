package com.function_interface.predicates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Employe> isAdult = employe -> employe.getAge() > 18;
        Predicate<Employe> isMale =  employe -> employe.getGender().startsWith("M");
        Predicate<Employe> isAdultAndMale = isAdult.and(isMale);
        Predicate<Employe> isAdultOrMale = isAdult.or(isMale);
        Predicate<Employe> isMinor = isAdult.negate();

        BiPredicate<Integer, String> isAdultMale = (age, gender)-> age>18 && gender.startsWith("M");

        Employe employe = new Employe(124L,"pooja", LocalDate.of(1994,05,05),23545,"Female");
        Employe employe1 = new Employe(125L,"neetu",LocalDate.of(2003,05,05),23545,"Male");
        Employe employe2 = new Employe(126L,"gaurav",LocalDate.of(1988,05,05),23545,"Female");
        Employe employe3 = new Employe(127L,"roshan",LocalDate.of(2010,05,05),23545,"Male");

        List<Employe> listEmp = new ArrayList<>();
        listEmp.add(employe);
        listEmp.add(employe1);
        listEmp.add(employe2);
        listEmp.add(employe3);

        System.out.println("All Male List ");
        System.out.println(listEmp);

        List<Employe> maleEmployeList = listEmp.stream().filter(isMale).collect(Collectors.toList());
        List<Employe> adultMaleList = listEmp.stream().filter(emp -> isAdultMale.test(emp.getAge(), emp.getName())).collect(Collectors.toList());

        System.out.println("male Employe list "+ maleEmployeList);
        System.out.println("adult Male List "+ adultMaleList);


    }
}
