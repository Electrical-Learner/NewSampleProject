package org.example.oops.polymorphism.overridding;

public class SubClassTwo extends SubClassOne{

   @Override
   public int sum(int a, int b) {
       int sum = a + b;
       return sum;
   }
}
