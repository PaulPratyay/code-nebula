package com.syntexpro.bytecraft7.scopeofvariables;

 /*
    There are three types of scope of variables:-

    1) Class/Global/Fields/Instance Variable
        -> It is declared within a class but outside any method, constructor or block;
        -> They are associated with objects of the class;
        -> They are accessible in any constructor, method or block;

     2) Parameterized Variable
        -> They are called inside the parenthesis;
        -> They are used in method or constructor signatures to receive value from the user;
        -> They are essential parts of method and constructor declarations;
        -> Whenever input from a user is needed, parameter variable must be used;

      3) Local Variable
        -> These are variables declared within a method, constructor, or block of code;
        -> They have limited scope and are only accessible within the block where they are declared;
     */

public class ScopeOfVariables {

    int age = 16; // here 'age' is a class/global/fields/instance variable;

    public void hello(int age1) { // 'age1' is a parameter variable
        age1 = 12;
        int age2 = 20; // 'age2' is a local variable
        age = 15;
    }


}
