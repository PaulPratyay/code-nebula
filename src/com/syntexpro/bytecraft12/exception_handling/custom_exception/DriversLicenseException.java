package com.syntexpro.bytecraft12.exception_handling.custom_exception;

import java.util.Scanner;

public class DriversLicenseException extends Exception{

    public DriversLicenseException(String validAge){
        super(validAge);
    }

    public static void checkAgeForDL() throws DriversLicenseException{

        Scanner driversLicense = new Scanner(System.in);

        System.out.println("Enter you age to check if you are eligible to apply for Driver's License: ");
        int age = driversLicense.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations! You are eligible to apply for Driver's License");
        } else {
            throw new DriversLicenseException("Sorry, you are not eligible to apply for Driver's License right now");
        }
    }

    public static void main(String[] args) {

        try{
            checkAgeForDL();
        } catch (DriversLicenseException e){
            System.out.println(e);
        }
    }
}
