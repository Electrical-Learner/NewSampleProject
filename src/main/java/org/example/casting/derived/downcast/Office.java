package org.example.casting.derived.downcast;

public class Office {

    public static void main(String[] args) {


        Security security =new Sweeper();
        security.nightWalk();
        System.out.println();

        Sweeper sweeper = (Sweeper) security;
        sweeper.clean();
        sweeper.nightWalk();
    }
}
