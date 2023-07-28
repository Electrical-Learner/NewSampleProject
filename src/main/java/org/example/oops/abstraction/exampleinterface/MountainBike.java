package org.example.oops.abstraction.exampleinterface;

public interface MountainBike extends Bikes{
    void mountainRun();



    default  void mountainTyre(){
       System.out.println("need 4 tyre");
   }
}
