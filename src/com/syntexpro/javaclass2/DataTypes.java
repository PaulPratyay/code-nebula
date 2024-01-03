package com.syntexpro.javaclass2;

public class DataTypes {
    public static void main(String[] args) {
        /*
        There are 8 types of Primitive Data Types in Java.
        (1)Byte (2)Short (3)int (4)long 5)float (6)double (7)char & (8)boolean
         */

        //(1)byte
        System.out.println("\\Byte Data Type\\");
        System.out.println("Byte data byte has a size of " + Byte.SIZE + " bits ");
        System.out.println("Range of byte data type is from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        byte b = -128;
        byte b1 = 127;
        System.out.println("b = " + b + "\n" + "b1 = " + b1 + "\n");

        //(2)short
        System.out.println("\\Short Data Type\\");
        System.out.println("Short data byte has a size of " + Short.SIZE + " bits ");
        System.out.println("Range of short data type is from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        short s = -32768;
        short s1 = 32767;
        System.out.println("s = " + s + "\n" + "s1 = " + s1 + "\n");

        //(3)int
        System.out.println("\\Integer Data Type\\");
        System.out.println("Integer data byte has a size of " + Integer.SIZE + " bits ");
        System.out.println("Range of integer data type is from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        int i = -2_147_483_648;
        int i1 = 2_147_483_647;
        System.out.println("i = " + i + "\n" + "i1 = " + i1 + "\n");

        //(4)long
        System.out.println("\\Long Data Type\\");
        System.out.println("Long data byte has a size of " + Long.SIZE + " bits ");
        System.out.println("Range of long data type is from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        long l = -9223372036854775808L;
        long l1 = 9223372036854775807L;
        /*
        When using 'long' data type,java has an in-built feature known as literal, due to which it considers the long number as an integer data type;
	    So, Java ask us to use 'L' after the number;
         */
        System.out.println("l = " + l + "\n" + "l1 = " + l1 + "\n");

        //(5)float
        System.out.println("\\Float Data Type\\");
        System.out.println("Float data byte has a size of " + Float.SIZE + " bits ");
        System.out.println("Range of float data type is from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        float f = 1.123456F;
        //Similarly like 'long' java has literal feature in float as well. We have to use 'F' after the floating point number;
        //We can give a range of up to 7 decimal points
        System.out.println("f = " + f + "\n");

        //(6)double
        System.out.println("\\Double Data Type\\");
        System.out.println("Double data byte has a size of " + Double.SIZE + " bits ");
        System.out.println("Range of double data type is from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        double d = 1.1234567890123456;
        System.out.println("d = " + d + "\n");

        //(7)char
        //Character data type will take only one character
        System.out.println("\\Character Data Type\\");
        System.out.println("Character data byte has a size of " + Character.SIZE + " bits ");
        System.out.println("Range of character data type is from " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        char c1 = 'J', c2 = 'p', c3 = '@', c4 = '8', c5 = '&';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        char c6 = '\u0063';
        System.out.println("c6 = " + c6);
        char myUnicode = '\u0061';
        System.out.println("myUnicode = " + myUnicode + "\n");

        //(8)boolean
        //It gives only 'true' & 'false' as an output
        System.out.println("\\Boolean Data Type\\");
        boolean javaIsNotAPortableLanguage = false;
        boolean javaIsAPortableLanguage = true;
        System.out.println("javaIsNotAPortableLanguage = " + javaIsNotAPortableLanguage);
        System.out.println("javaIsAPortableLanguage = " + javaIsAPortableLanguage + "\n");

        /*
        There are 5 Non-Primitive Data Types
        (1)String (2)Array (3)Class (4)Object (5)Interface
         */
        System.out.println("\\String\\");
        String myFirstString = "ZlR1!2@3#4$5%6^&7*8(9)0-_=+{[]}|/?,<.>~`";
        System.out.println("myFirstString = " + myFirstString);


    }
}
