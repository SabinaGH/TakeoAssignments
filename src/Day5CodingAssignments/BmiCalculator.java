package Day5CodingAssignments;

import java.text.DecimalFormat;

import java.util.Scanner;

/*

Exercise 5: BMI(Body Mass Index) Calculator

Write a Java program that calculates the Body Mass Index (BMI) of a person based on their weight and height.

Instructions:

Use the Scanner class to take input from the user for their weight in kilograms and height in meters.
Create a method that takes the input weight and height as arguments and calculates the BMI using the formula: BMI = weight / (height * height).

Ex:  Enter your weight (kg): 70
     Enter your height (m): 1.75
     Your BMI: 22.86


 */
public class BmiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BMI(Body Mass Index) Calculator program");
        System.out.println("It calculates the Body Mass Index (BMI) of a person based on their weight and height.");

        System.out.println("Enter your weight (kg) : ");
        float userWeight =  scanner.nextFloat();

        System.out.println("Enter your height (m): ");
        float userHeight =  scanner.nextFloat();

        float userBmi =  BmiCalulation(userWeight,userHeight);

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Your BMI:: "+f.format(userBmi));

        scanner.close();
    }

    static float BmiCalulation(float weight,float height)
    {

        float bmi = weight / (height * height) ;
        return bmi;
    }
}
