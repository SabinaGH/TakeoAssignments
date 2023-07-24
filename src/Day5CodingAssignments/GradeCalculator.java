package Day5CodingAssignments;

import java.util.Scanner;

/*

Exercise 2: Grade Calculator

Write a Java program that calculates the grade based on the marks obtained by a student in an exam. 
The program should follow the standard grading system: A (90-100), B (80-89), C (70-79), D (60-69), F (below 60).

Instructions:

Use the Scanner class to take input from the user for the marks obtained.
Determine the grade based on the marks using if-else statements.
Display the calculated grade to the user.

Ex: Enter the marks obtained: 85
    Grade: B


 */
public class GradeCalculator {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Grade Calculator program");
        System.out.println("It calculates the grade based on the marks obtained by a student in an exam.");

        System.out.println("Enter the marks obtained: ");
        int studentMarks = scanner.nextInt();

        String grade = " ";

        //A (90-100), B (80-89), C (70-79), D (60-69), F (below 60).
        
        if(studentMarks >=90 && studentMarks <=100 )
        {
            grade="A";
        }else if (studentMarks >=80 && studentMarks <=89)
        {
            grade="B";
        }else if (studentMarks >=70 && studentMarks <=79)
        {
            grade="C";
        }else if (studentMarks >=60 && studentMarks <=60)
        {
            grade="D";
        }else if (studentMarks >=1 && studentMarks <60)
        {
            grade="F";
        }
        else {
            System.out.println("Please enter valid marks");

        }

         if(grade.contains("[A-Z]")) {

             System.out.println("Grade is " + grade);
         }
        scanner.close();
        
    }
}
