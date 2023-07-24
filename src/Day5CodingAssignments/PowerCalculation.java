package Day5CodingAssignments;

import java.util.Scanner;

/*
Exercise 4: Power Calculation

Write a Java program that calculates the power of a given number raised to an exponent provided by the user.

Instructions:

Use the Scanner class to take input from the user for the base number and the exponent.
Use a loop to calculate the power of the number raised to the exponent.
Display the result to the user.

Ex: Enter the base number: 2
    Enter the exponent: 5
    2^5 = 32
 */
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Power Calculation program");
        System.out.println("It calculates the power of a given number raised to an exponent provided by the user.");

        System.out.println("Enter the base number: ");
        int numberEntered =  scanner.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent =  scanner.nextInt();

        int initialValue =0;
         int finalValue = 0;

        //double a  = (double) Math.pow(5,5);

         for(int i = 1; i<exponent;i++)
         {

             if (i==1)
             {
                 initialValue = numberEntered*numberEntered;
                 finalValue=finalValue+initialValue;

             }
             else {
                 initialValue = finalValue * numberEntered;
                 finalValue=initialValue;
             }


         }
                System.out.println("The result is: "+finalValue);



        scanner.close();
    }
}
