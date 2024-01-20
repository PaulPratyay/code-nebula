package com.syntexpro.bytecraft7.method;

// Calculate rental yield

public class RentalYieldExercise {
    public static void main(String[] args) {

        System.out.println("Rental Yield = " + rentalYield(1300, 250000));

    }

    public static double rentalYield(double rentalIncome, double propertyPurchase) {

        double annualRentalIncome = (rentalIncome * 12);

        double rentalYield = (annualRentalIncome / propertyPurchase) * 100; // we can also write:  return (annualIncome/propertyPurchase) * 100;

        return rentalYield;
    }
}

