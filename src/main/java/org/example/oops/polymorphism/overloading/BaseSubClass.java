package org.example.oops.polymorphism.overloading;

public class BaseSubClass {

    public static void main(String[] args) {

        SuperClass.sum(1, 4);

        int sum = SubClassOne.sum(1, 4, 6);
        System.out.println("SubClassOne sum is: " + sum);

        int sums = new SubClassTwo().sum(1, 4, 6, 8);
        System.out.println("SubClassTwo sum is: " + sums);

    }
}
