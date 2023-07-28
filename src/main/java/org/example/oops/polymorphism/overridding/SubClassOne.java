package org.example.oops.polymorphism.overridding;

public class SubClassOne extends SuperClass{
  @Override
  public int sum(int a, int b) {
      int sum = a + b;
      return sum;
  }

    public static void MethodOfSubClassOne(){
        System.out.println("its a SubClassOne");

    }
}
