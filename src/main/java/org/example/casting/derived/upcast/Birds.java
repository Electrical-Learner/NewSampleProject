package org.example.casting.derived.upcast;

public class Birds {

    public void birdsFly() {
        System.out.println("bird fly's");
    }

    public static void main(String[] args) {

        new Peacock().EagleFly();   //upcasting
        new Peacock().eat();
        new Peacock().peacockRun();
        new Peacock().sleep();


        Peacock peacock = (Peacock) new Peacock();  //downCasting
        peacock.peacockRun();
        peacock.eat();
        peacock.EagleFly();
        peacock.sleep();


    }
}
