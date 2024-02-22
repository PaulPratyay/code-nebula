package com.syntexpro.bytecraft14_15.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Example1 {
    public static void main(String[] args) {

        LinkedList<String> studentNames = new LinkedList<>();

        // Adding object in LinkedList

        studentNames.add("Rebecca");
        studentNames.add("Addie");
        studentNames.add("Abdul");
        studentNames.add("Zendria");
        studentNames.add("Emily");
        studentNames.add("Ryan");

        System.out.println(studentNames);
        System.out.println(studentNames.size());
        System.out.println(studentNames.get(3));
        System.out.println(studentNames.get(3).length());
        System.out.println();

        System.out.println(studentNames.get(5));
        System.out.println(studentNames.contains("Kayden"));
        System.out.println(studentNames.remove(3));
        System.out.println(studentNames.get(3));
        System.out.println(studentNames);
        System.out.println();

        // Traversing though for-each loop

        for (String student : studentNames) {
            System.out.println(student);
        }
        System.out.println();

        //Traversing through Iterator

        Iterator<String> itr = studentNames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }

}
