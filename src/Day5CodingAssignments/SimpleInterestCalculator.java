package Day5CodingAssignments;

import java.util.Scanner;

/*

Exercise 1: Simple Interest Calculator

Write a Java program that calculates the simple interest based on the principal amount, rate of interest, and time period provided by the user.

Instructions:

Use the Scanner class to take input from the user for the principal amount, rate of interest, and time period (in years).
Calculate the simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100.
Display the calculated simple interest to the user.

Ex: Enter the principal amount: 5000
    Enter the rate of interest: 8.5
    Enter the time period (in years): 2
    Simple Interest: 850.0


 */
public class SimpleInterestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Interest Calculator program");
        System.out.println("It calculates the simple interest based on the principal amount, rate of interest, and time period provided by the user");

        System.out.println("Please enter principal amount, rate of interest, and time period (in years)");

        System.out.println("Principal amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.println("Rate of interest:");
        float interest = scanner.nextFloat();
        System.out.println("Time period (in years):");

        int timePeriodInYears = scanner.nextInt();

        double simpleInterest = 0;

        simpleInterest = (principalAmount * interest * timePeriodInYears) / 100;

        System.out.println("Simple Interest is "+simpleInterest);

        scanner.close();

    }
}
