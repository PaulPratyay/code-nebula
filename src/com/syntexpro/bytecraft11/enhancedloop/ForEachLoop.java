package com.syntexpro.bytecraft11.enhancedloop;

/*
   Java For-each Loop | Enhanced Loop
    -> It provides an alternative approach to traverse the array pr collection in Java;
    -> It is mainly used to traverse the array or collection elements;
    -> The advantage of for-each loop is that it eliminates the possibility of bugs and makes the code more readable;
    -> It is known as the for-each loop because it traverses each element one by one;
    -> It is recommended to use the Java for-each loop for traversing the elements of array and collection because it makes the code readable;
Drawbacks
    -> It cannot traverse the elements in reverse order;
    -> We do not have the option to skip any element because it does not work on an index basis;
    -> We cannot traverse the odd or even elements;
 */

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] salary = {100, 35, 45, 55, 70, 85};
        System.out.println("Salary: " + Arrays.toString(salary));

        for (int s : salary) {
            System.out.println(s);
        }

        String[] operatingSystem = {"Windows", "MacOS", "Linux", "Android", "iOS"};

        for (String os : operatingSystem) {
            System.out.println(os);
        }

        int[] array = {12, 13, 14, 44};

        for (int i : array) {
            System.out.println(i);
        }


    }
}
