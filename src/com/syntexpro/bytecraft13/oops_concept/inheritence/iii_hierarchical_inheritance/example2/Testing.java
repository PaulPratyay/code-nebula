package com.syntexpro.javaclass13.oops_concept.inheritance.iii_hierarchical_inheritance.example2;

public class Testing extends SoftwareDevelopment{

    @Override
    public void testTeam() {
        super.testTeam();
    }

    @Override
    public void reportIssue() {
        super.reportIssue();
    }

    public void production(){
        System.out.println("Send for production after release");
    }

    public void releaseSoftware(){
        System.out.println("Finally release software to market");
    }

    public static void main(String[] args) {
        Testing test = new Testing();

        test.testTeam();
        test.reportIssue();
        test.production();
        test.releaseSoftware();
    }

}
