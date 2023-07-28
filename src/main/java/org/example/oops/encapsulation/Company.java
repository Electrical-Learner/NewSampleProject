package org.example.oops.encapsulation;


public class Company extends Employee{

    public static void main(String[] args) {
        Company company =new Company();
        company.setSalary(10000.23);

        System.out.println("Employee salary is: " + company.getSalary());

    }
}
