package org.example.oops.abstraction.exampleinterface;

public abstract class SuperBike implements Bikes, MountainBike {
    @Override
    public void brake() {
        System.out.println("SuperBikes Brake");

    }

    public void tyre() {
        System.out.println("has two tyre");
    }

    void sumOfTyre(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void mountainRun() {
        System.out.println("MountainRunner");
    }

    public static void main(String[] args) {

        SuperBike superBike = new SuperBike() {
            @Override
            public void brake() {
                super.brake();
            }

            @Override
            public void bikesHandling() {
                System.out.println("good handling");
            }
        };
        superBike.brake();

        superBike.clutch();



        System.out.println(age);

        superBike.sumOfTyre(1, 1);

        superBike.mountainRun();

        superBike.mountainTyre();
    }
}

