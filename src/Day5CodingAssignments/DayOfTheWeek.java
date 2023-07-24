package Day5CodingAssignments;

import java.util.Scanner;

/*

Exercise 3: Day of the Week

Write a Java program that takes a number representing a day of the week (1 for Sunday, 2 for Monday, etc.) and displays the corresponding day's name.

Instructions:

Use the Scanner class to take input from the user for the number representing the day of the week.
Implement a switch statement to display the corresponding day's name.
Display the day's name to the user.

Ex : Enter a number (1-7) representing the day of the week: 3
     Day of the week: Tuesday
 */
public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Day Of The Week Generator program");
        System.out.println("You enter a number (from 1 to 7) and it tells you which day it is.");

        System.out.println("Enter a number (1-7) representing the day of the week: ");
        int a =  scanner.nextInt();

        switch(a)
        {
            case 1: System.out.println("Day of the week is Sunday ");
                break;
            case 2: System.out.println("Day of the week is Monday ");
                break;
            case 3: System.out.println("Day of the week is Tuesday ");
                break;
            case 4: System.out.println("Day of the week is Wednesday ");
                break;
            case 5: System.out.println("Day of the week is Thursday ");
                break;
            case 6: System.out.println("Day of the week is Friday ");
                break;
            case 7: System.out.println("Day of the week is Saturday ");
                break;

            default:
                System.out.println("Please enter valid a valid number  (1-7)");
        }


        scanner.close();
    }

}
