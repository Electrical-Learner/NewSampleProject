package org.example.oops.polymorphism.overridding;

public class BaseSubClass {

    public static void main(String[] args) {
        int sum = new SuperClass().sum(1, 2);
        System.out.println("SuperClass sum is: " + sum);

        int sumOne = new SubClassOne().sum(3, 4);
        System.out.println("SubClassOne sum is: " + sumOne);

        int sumTwo = new SubClassTwo().sum(5, 6);
        System.out.println("SubClassTwo sum is: " + sumTwo);

        SuperClass.methodOfSuper();
        SubClassOne.MethodOfSubClassOne();
        SubClassTwo.MethodOfSubClassOne();
    }
}
