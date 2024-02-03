package com.syntexpro.bytecraft10.string;

public class JavaString {
    public static void main(String[] args) {

        char[] ch = {'j', 'a', 'v', 'a', 's', 't', 'r', 'i', 'n', 'g'};
        System.out.println(ch);

        String s = new String(ch);
        System.out.println(ch);
        
        /*
        There are two ways to create String object:
        1) By String Literal;
        2) By new keyword;
         */

        // String Literal -> It is created using double quotes;

        String literal = "Zendria";
        System.out.println("literal = " + literal);

        String literal1 = "Zendria";
        System.out.println("literal1 = " + literal1);

        String literal2 = "Zendria";
        System.out.println("literal2 = " + literal2);
        
        /*
        How the above three strings with same values stored in Java?
        
        -> Each time we create a string literal, the JVM checks the 'String Constant Pool';
        -> If the string already exists in the 'String Constant Pool', a reference to the pooled instance is returned;
        -> If the string doesn't exist in the pool, a new string instance is created and placed in the pool;
        
        -> In the above example, only one object will be created;
        -> Firstly, JVM will not find any string object for 'literal' with the value "Zendria" in the string constant pool which is inside the Heap Memory, and it will create a new object "Zendria";
        -> After that it will find the string 'literal1' & 'literal2' also has the same value "Zendria", and it is already present inside the string constant pool; Thus, it will not create a new object but will return the reference to the same instance;
        
        -> By doing this, it makes Java more memory efficient (because no new objects are created if it already exists in the string constant pool);     
         */

        // By new keyword

        String literal3 = new String("Zendria");
        System.out.println("literal3 = " + literal3 + "\n");

        /*
        -> String literal4 is stored by creating an object pool; It is not referred to the 'String Constant Pool' like we have seen previously;
        -> The reason is because, we have created this String by creating an object which is 'literal4';
        -> So, when we create a String by creating an object with the 'new' keyword, JVM creates an 'Object Pool' in the Heap Memory similar to string constant pool;
        -> JVM will put "Zendria" in the object pool;
         */

        // Comparing String value using '==';

        System.out.println(literal == literal1);
        System.out.println(literal == literal2);
        System.out.println(literal1 == literal2);
        System.out.println();

        System.out.println(literal == literal3);
        System.out.println(literal1 == literal3);
        System.out.println(literal2 == literal3);
        System.out.println();

        /*
        -> Using '==' will compare the reference not the value inside the string;
        -> Since, 'literal', 'literal1, and 'literal2' are stored inside the 'String Constant Pool', the result it is giving is 'true'; Also the value inside is "Zendria" for all of them;

        -> But when we are comparing with literal3, it is giving false ; Because, the value "Zendria" inside literal4 is stored in 'Object Pool' and not in the 'String Constant Pool'; Although the value inside is 'Zendria' which is same for all of them;
        -> Therefore, comparing String using '==' actually compares the reference where the value is stored and not the value;

        -> Thus, IT IS NOT A GOOD PRACTICE TO COMPARE STRING USING '==';
         */

        // Comparing String using 'equals()' method

        System.out.println(literal.equals(literal1));
        System.out.println(literal.equals(literal2));
        System.out.println(literal.equals(literal3));
        System.out.println(literal1.equals(literal2));
        System.out.println(literal1.equals(literal3));
        System.out.println(literal2.equals(literal3));

        /*
        -> Using equals() method, it compares the values stored inside the string and not the reference;
        -> Thus, IT IS A GOOD PRACTICE TO USE 'equals()' METHOD WHEN COMPARING BETWEEN STRINGS;
         */


    }

}
