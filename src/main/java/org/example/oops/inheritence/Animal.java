package org.example.oops.inheritence;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name is: "+ name);
    }

    protected Animal(){
        System.out.println("This is Animal class");
    }



}