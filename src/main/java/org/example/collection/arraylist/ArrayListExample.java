package org.example.collection.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        if (arrayList.contains(1)) {
            System.out.println("data Exist");
        } else {
            System.out.println("data not exist");
        }
    }



}
