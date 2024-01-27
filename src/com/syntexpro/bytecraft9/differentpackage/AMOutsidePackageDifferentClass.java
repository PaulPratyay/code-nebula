package com.syntexpro.bytecraft9.differentpackage;

import com.syntexpro.bytecraft9.accessmodifiers.AMSamePackageSameClass;

public class AMOutsidePackageDifferentClass {

    public static void main(String[] args) {

        AMSamePackageSameClass outsidePDifferentCObj = new AMSamePackageSameClass();

        System.out.println(outsidePDifferentCObj.publicVariable = "'public' access modifier can be accessed outside package and in different class");

        /*
            -> only 'public' access modifier is accessible outside its package and outside its class as well without using its subclass;
            -> 'private', 'protected' and 'default' access modifiers are not accessible outside its class and outside its package and not within its subclass;
         */

    }



}
