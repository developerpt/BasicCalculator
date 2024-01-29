package basiccalculator;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Simple Calculator");
		System.out.println("-----------------");

		// Input first number
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		// Input second number
		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		// Choose operation
		System.out.println("Choose operation:");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");

		// Input operation choice
		System.out.print("Enter the operation number: ");
		int choice = scanner.nextInt();

		double result = 0;

		// Perform the selected operation
		switch (choice) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			// Check for division by zero
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Error: Cannot divide by zero.");
				System.exit(0);
			}
			break;
		default:
			System.out.println("Error: Invalid operation choice.");
			System.exit(0);
		}

		// Display the result
		System.out.println("Result: " + result);

		// Close the scanner
		scanner.close();
	}
}
