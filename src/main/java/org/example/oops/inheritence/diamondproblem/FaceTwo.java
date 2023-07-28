package org.example.oops.inheritence.diamondproblem;

public interface FaceTwo extends FaceOne {

    default void print() {
       System.out.println("I am FaceTwo");
    }


}
