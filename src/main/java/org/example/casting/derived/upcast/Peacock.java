package org.example.casting.derived.upcast;

public class Peacock extends Eagle {

    @Override
    public void EagleFly() {
        System.out.println("peacock fly");
    }

    public void peacockRun() {
        System.out.println("peacock runs ");
    }

//    Peacock(){
//        System.out.println("have");
//    }
}
