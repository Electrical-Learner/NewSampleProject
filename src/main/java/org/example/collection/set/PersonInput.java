package org.example.collection.set;

import java.util.LinkedList;
import java.util.List;


public class PersonInput {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<Person>();

        Person personOne = new Person("Ravi", 43);
        Person personTwo = new Person("Raju", 23);
        Person personThree = new Person("Rahul", 53);

        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personThree);


        for (Person person : personList) {
            System.out.println(person);
        }


    }
}
