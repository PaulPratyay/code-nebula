package com.syntexpro.bytecraft9.accessmodifiers;

/*
    -> Accessing public, private, protected and default variables having same access modifier within the same package and class;
    -> 'public', 'private', protected' and 'default' access modifiers are accessible within the same package and same class;
 */

public class AMSamePackageSameClass {

    public String publicVariable = "'public' access modifier called under same package and same class";

    private String privateVariable = "'private' access modifier called under same package and same class";

    protected String protectedVariable = "'protected' access modifier called under same package and same class";

    String defaultVariable = "'default' access modifier called under same package and same class";

    public void method1() {

        System.out.println(publicVariable);
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
    }

    public static void main(String[] args) {

        AMSamePackageSameClass samePSameCObj = new AMSamePackageSameClass();
        samePSameCObj.method1();
    }
}
