package org.example.oops.abstraction.exampleabstract;


public class Cars {

    public static void main(String[] args) {


        SuperCar superCar = new SuperCar() {
            @Override
            public void oldCarBodyType() {
                super.oldCarBodyType();

            }
        };
        superCar.oldCarNo();

        superCar.oldCarRun();

        OldCar.oldCarName();

        SuperCar superCar1 = new SuperCar();
        superCar1.oldCarBodyType();





    }
}
