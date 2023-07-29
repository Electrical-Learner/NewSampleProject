package org.example.oops.inheritence;

public class Dog extends Animal {


    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    protected Dog(){
        super();
    }

    public void display() {
        super.display();
        System.out.println("Dog breed  is: " + breed);
    }
}
