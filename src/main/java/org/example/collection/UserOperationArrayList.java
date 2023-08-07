package org.example.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOperationArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayContent();

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the Integer");
                integers.add(scanner.nextInt());
                System.out.println("Added");
            } else if (choice == 2) {
                System.out.println("Enter the Integer to remove");
                int removeToRemove = scanner.nextInt();
                if (integers.contains(removeToRemove)) {
                    integers.remove(Integer.valueOf(removeToRemove));
                    System.out.println("Removed");
                } else
                    System.out.println("Element Not Found");

            } else if (choice == 3) {
                System.out.println("Your List is:" + integers);
            } else if (choice == 4) {
                System.out.println("Thank You");
                break;
            }

        }
    }

    private static void displayContent() {
        System.out.println();
        System.out.println("1.Add Element");
        System.out.println("2.Delete Element");
        System.out.println("3.Display Element");
        System.out.println("4.Exit");
        System.out.println();
        System.out.println("Enter your Choice");
    }
}
