package org.example.collection.set;

import java.util.*;

public class SetExample extends HashSetExample {


    public static void main(String[] args) {


        SetExample.getAddition(2, 5);


        System.out.println("This is getSum of HashSetExample: " + SetExample.getSum(3, 2));

        new SetExample().getMultiply();

        HashSetExample hashSetExample = new HashSetExample() {


            @Override
            public void HashSet() {
                super.HashSet();
            }

        };


        Set set = new HashSet();
        set.add(78);
        set.add(213);
        set.add(893);

        //  System.out.println(set);

        LinkedHashSet linkedHashSet = new LinkedHashSet(set); //creating instance of LinkedHashSet using another Collection as a constructor argument
        linkedHashSet.add(1);
        linkedHashSet.add(22);
        System.out.println("Linked List is: " + linkedHashSet);
        System.out.println(set.remove(linkedHashSet));
        System.out.println(set);

        TreeSet treeSet = new TreeSet(linkedHashSet);
        treeSet.add(34);

        System.out.println("TreeSet is: " + treeSet);
    }

    public static void getAddition(int a, int b) {
        int sum = a + b;
        System.out.println("sum is: " + sum);
    }


}
