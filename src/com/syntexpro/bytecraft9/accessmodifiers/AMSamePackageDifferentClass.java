package com.syntexpro.bytecraft9.accessmodifiers;

/*
    -> 'public', 'protected' and 'default' access modifiers can be accessed within the same package but different class;
    -> 'private' access modifier is not accessible within the same package but different class;
 */

public class AMSamePackageDifferentClass {
    public static void main(String[] args) {

        AMSamePackageSameClass samePDifferentCObj = new AMSamePackageSameClass();

        System.out.println(samePDifferentCObj.publicVariable = "'public' access modifier called under same package but different class");
        System.out.println(samePDifferentCObj.protectedVariable = "'protected' access modifier called under same package but different class");
        System.out.println(samePDifferentCObj.defaultVariable = "'default' access modifier called under same package but different class");




    }
}
