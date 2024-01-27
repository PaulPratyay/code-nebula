package com.syntexpro.bytecraft9.differentpackage;

import com.syntexpro.bytecraft9.accessmodifiers.AMSamePackageSameClass;

/*
        Here,
        -> `AMSamePackageSameClass` is a Superclass or Parent class;
        -> `AMSubClassOutsidePackage` is a subclass or child class;
        -> `AMSubClassOutsidePackage` is the subclass that extends `AMSamePackageSameClass`.
        -> It inherits the 'method1()' from the superclass and has its own 'method2()'

        -> 'private' and 'default' access modifiers are not accessible in a different package and within a subclass of a parent class;

 */



public class AMSubClassOutsidePackage extends AMSamePackageSameClass {

    public void method2() {

        System.out.println(publicVariable = "'public' access modifier called by creating a different package within a subclass");
        System.out.println(protectedVariable = "'protected' access modifier called by creating a different package within a subclass");
    }

    public static void main(String[] args) {

        AMSubClassOutsidePackage subCOutsidePObj = new AMSubClassOutsidePackage();
        subCOutsidePObj.method2();


    }

}
