package org.example.collection.set;

public class Person {

    private static String name;
    private static int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person name is " + name + '\t'+ "age is " + age;

    }
}
