package com.codewithmosh;

public class Main {

    public static void main(String[] args) {



        var employee1=new Employee(12,12);
        var employee2=new Employee(12,12);

        System.out.println(employee1.calculateWage());
        System.out.println(employee2.calculateWage());

        Employee.printNoOfEmployee();

    }


}
