package org.example.casting.primitive;

public class AutoWidening {

    public static void main(String[] args) {
        byte b= 0100;

        int i =b;
        System.out.println("long value is: " + i);

    }
}
