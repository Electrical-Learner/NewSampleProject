package org.example.oops.abstraction.exampleinterface;

import java.awt.*;

public interface Bikes {

    int age = 10;

    public abstract void brake();

    public abstract void bikesHandling();
    public abstract void tyre();

    public default void clutch() {
        System.out.println("Bikes clutch");
    }


    public static void bikeNo() {
        System.out.println("ka-01-0101");
    }

}
