package com.syntexpro.bytecraft18.hashmap;

import java.util.HashMap;
import java.util.Map;

// Trying different ways to insert elements
public class Example3 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");
        students.put(5, "Emily");
        students.put(5, "Eiden");

        System.out.println("List of students: " + students + "\n");
        System.out.println("Iterating after inserting elements using put() method");

        for (Map.Entry m : students.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        students.putIfAbsent(6, "Freddy");
        students.putIfAbsent(6, "George");
        students.putIfAbsent(7, "Harry");
        System.out.println();

        System.out.println("List of students: " + students + "\n");
        System.out.println("Iterating after inserting elements using putIfAbsent() method");

        for (Map.Entry m : students.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        HashMap<Integer, String> remainingStudents = new HashMap<>();

        remainingStudents.put(8, "Icy");
        remainingStudents.put(9, "Jack");
        remainingStudents.put(10, "Kevin");
        remainingStudents.putAll(students);
        System.out.println();

        System.out.println("List of all the students: " + remainingStudents + "\n");
        System.out.println("Iterating after inserting elements using putAll() method");

        for (Map.Entry m : remainingStudents.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
