/*
 *Program: Math Tutor
 *Author: Omar Imam
 *Date Last Modified: March 1, 2017
 *Purpose: The purpose of this program is to .
 *
 */

// Package Information
package com.eclipse.omarimam;

// Import Scanner utility
import java.util.Scanner;

// Declare Class
public class MathTutorOI {
//  Declare main method
	public static void main(String[] args) {
		//Initialize variables
		int number1 = 0;
		int number2 = 0;
		int score = 0;
		
		// Display Menu and request user input
		System.out.println("Please choose a test type: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		// Create Scanner Object called 'input'
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Assign the input into the variable 'userChoice'
		int userChoice = input.nextInt();
		
		// Switch statement that changes action based on user's input
		while (userChoice != 5) {
			switch (userChoice) {
		
		// Addition test
			case 1 : {
				
			// Generate two random 1-digit numbers
				number1 = (int)(Math.random() * 10);
				number2 = (int)(Math.random() * 10);
			
			// Present the problem to the user
				System.out.println("What is " + number1 + " + " + number2 + "?");
				int userAnswer = input.nextInt();
			
			// Check the user's answer and add 1 to the score if the answer is correct.
				if (userAnswer == (number1 + number2)) {
					System.out.println("Correct!\n");
					score++;
				} else {
					System.out.println("Wrong!");
				}
				break;
				}
			
		// Subtraction test
			case 2 : {
				
			// Generate two random 1-digit numbers
			// The loop is repeated if number2 is greater than number1
				do {
					number1 = (int)(Math.random() * 10);
					number2 = (int)(Math.random() * 10);
				} while (number2 >= number1);
			
			// Present the problem to the user using the randomly generated numbers
				System.out.println("What is " + number1 + " - " + number2 + "?");
				int userAnswer = input.nextInt();
				
			// Check the users's answer and add 1 to the score if the answer is correct
				if (userAnswer == (number1 - number2)) {
					System.out.println("Correct!\n");
					score++;
				} else {
					System.out.println("Wrong!");
				}
				break;
				}
		
		// Multiplication test
			case 3 : {
				
			// Generate two random 1-digit numbers
				number1 = (int)(Math.random() * 10);
				number2 = (int)(Math.random() * 10);
			
			// Present the problem to the user using the randomly generated numbers
				System.out.println("What is " + number1 + " * " + number2 + "?");
				int userAnswer = input.nextInt();
				
			// Check the user's answer and add 1 to the score if the answer is correct	
				if (userAnswer == (number1 * number2)) {
					System.out.println("Correct!\n");
					score++;
				} else {
					System.out.println("Wrong!");
				}
				break;
			}
			
		// Division test
			case 4 : {
			
			// Generate two random 1-digit numbers, repeat number generation when number2 is greater than number1
			// Or, when number2 generates as 0
				do {
					number1 = (int)(Math.random() * 10);
					number2 = (int)(Math.random() * 10);
				} while (number2 > number1 || number2 == 0);
			
			// Present the problem to the user using the randomly generated numbers
				System.out.println("What is " + number1 + "/" + number2 + "?");
				int userAnswer = input.nextInt();
				
			// Check the user's answer and add 1 to the score if the answer is correct.
				if (userAnswer == (number1/number2)) {
					System.out.println("Correct!\n");
					score++;
				} else {
					System.out.println("Wrong!");
				}
				break;
			}
		
		// Exit program
			case 5 : {
				
				System.out.print("Goodbye!");
				System.exit(0);
			}
		
			// Response if the number is not within the specified options.
				default : {
					System.out.println("Error, please enter a number 1 - 5.\n");
					System.out.println("Please Try Again.\n");
					break;
				}
				
			}
			System.out.println("Your current score is: " + score);
			
			// Display Menu and request user input
			System.out.println("Please choose a quiz type: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			userChoice = input.nextInt();
			continue;
	}
	}

}
