package com.syntexpro.javaclass3;

public class StringMethods {
    public static void main(String[] args) {

        //Using different methods associated with String

        String java = "Java is an object oriented programming language.";
        System.out.println(java);
        //toUpperCase() method
        System.out.println(java.toUpperCase());
        //toLowerCase() method
        System.out.println(java.toLowerCase());
        //isBlank()
        System.out.println(java.isBlank());
        //isEmpty()
        System.out.println(java.isEmpty());
        //length()
        System.out.println(java.length());


        System.out.println("Difference with and without space characters in isBlank() and isEmpty() methods");
        String emptyStringWithSpace = " ";
        System.out.println(emptyStringWithSpace);
        System.out.println(emptyStringWithSpace.isBlank()); // 'isBlank()' method counts space character in the 'emptyString' as blank. So it displays 'true' as an output
        System.out.println(emptyStringWithSpace.isEmpty()); // 'isEmpty()' method counts the space character. So it displays 'false' as an output

        String emptyStringWithoutSpace = "";
        System.out.println(emptyStringWithoutSpace.isBlank());
        System.out.println(emptyStringWithoutSpace.isEmpty());

    }
}
