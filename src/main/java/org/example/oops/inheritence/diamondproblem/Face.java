package org.example.oops.inheritence.diamondproblem;


public class Face implements FaceOne, FaceTwo {

    public void print() {
        FaceTwo.super.print();
    }


    public static void main(String[] args) {
        Face face = new Face();
        face.print();
    }
}
