package com.syntexpro.bytecraft10.constructor;

// Example of default constructor that displays the default values
public class DefaultConstructorExample {

    int id;
    String name;

    @Override
    public String toString() {
        return "DefaultConstructorExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        DefaultConstructorExample s1 = new DefaultConstructorExample();
        DefaultConstructorExample s2 = new DefaultConstructorExample();

        System.out.println(s1);
        System.out.println(s2);
    }

    /*
        -> In this, example, we are not creating any constructor, so compiler provides us a default constructor;
        -> Here, 0 and null value are provided by default constructor;
     */
}
