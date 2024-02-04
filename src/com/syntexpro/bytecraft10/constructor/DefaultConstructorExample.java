package com.syntexpro.bytecraft10.constructor;

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
}
