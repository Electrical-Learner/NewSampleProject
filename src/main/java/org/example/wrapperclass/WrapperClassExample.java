package org.example.wrapperclass;

public class WrapperClassExample {


    public void printShort() {
        Short shortObject = 30;
        System.out.println("autoboxed shortObject is : " + shortObject);

        Short shortValue = shortObject;
        System.out.println("unboxed shortValue is : " + shortValue);
        System.out.println();
    }


    public static void main(String[] args) {
        byte b = 10;
        new WrapperClassExample().printShort();

        Byte byteObject = b;
        System.out.println("autoboxed byteObject is : " + byteObject);

        byte byteValue = byteObject;
        System.out.println("unboxed byteValue is : " + byteValue);
    }
}
