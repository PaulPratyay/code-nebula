package com.syntexpro.bytecraft9.accessmodifiers;

/*
    -> Access modifiers are keywords in Java, which allows us to set the accessibility or scope of a variable, method, class, constructor, or any other members in our java program.
    -> There are four types of modifiers:
        1) public
        2) private
        3) protected
        4) default

 */

public class AccessModifiers {

    public String publicVariable = "PUBLIC";

    private String privateVariable = "PRIVATE";

    protected String protectedVariable = "PROTECTED";

    String defaultVariable = "DEFAULT";

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.publicVariable);
        System.out.println(obj.privateVariable);
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);
    }
}

/*
    'public'

    -> Any variable, class, method or constructor marked as 'public' can be accessed from anywhere, be it in or out of a class or inside or outside a package;
    -> 'public' access modifiers provides the widest range of accessibility to the members it is associated with;
    -> A 'public' member is easily accessible through a subclass as well, it means a class inheriting another class can access the public members of the later one, that is the parent class;

    'private'

    -> 'private' access modifiers are only accessible throughout the same class in which they are declared and defined;
    -> They are not accessible to any other classes, doesn't matter if they belong to the same package or not;
    -> Their scope or visibility will be limited only to the classes to which these members actually belongs to;

    'protected'

    -> 'protected' access modifiers can be accessed throughout the same class and also in its subclasses or child classes;
    -> 'protected' access modifiers are also accessible to those classes which belong to different java packages as well;

    'default'

    -> The 'default' access modifiers are by default assigned to the members of a java program, if no other access modifier is specified to them;
    -> 'default' access modifiers are accessible within the same class and can also be accessed throughout the same package but cannot be accessed by the classes which belongs to other packages;




 */
