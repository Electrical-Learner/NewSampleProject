package org.example.casting.derived.downcast;

public class Sweeper extends Security {

    public void clean(){
        System.out.println("sweeps the building");
    }

    @Override
    public void nightWalk(){
        System.out.println("take a round at night sweeper");
    }
}
