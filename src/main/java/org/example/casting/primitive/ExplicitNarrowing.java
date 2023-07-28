package org.example.casting.primitive;

public class ExplicitNarrowing {

   static char value = 'A';

    public static void main(String[] args) {
        long l = 1000;
        int i = (int) l;
        System.out.println("int value: " + i);

        short s = (short) i;
        System.out.println("short value: " + s);

        int n =value;
        System.out.println( "\'A\' Char value is: "+ n);
    }
}
