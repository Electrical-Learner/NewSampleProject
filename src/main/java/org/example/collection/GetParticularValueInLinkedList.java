package org.example.collection;

import java.util.LinkedList;

public class GetParticularValueInLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        System.out.println(linkedList.get(4));



        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == 3) {
                System.out.println("3 is at the Index " + i);
            }
        }
    }
}
