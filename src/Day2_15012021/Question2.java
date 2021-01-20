package Day2_15012021;

import java.util.Scanner;

public class Question2 {
	// 2. Write a program to enter 2 numbers from the users, and using a switch statement with the user selection do the necessary operations
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean errorOccurred = true;
		
		while(errorOccurred) {
			System.out.println("Enter 2 numbers: ");
			try {
				int x = sc.nextInt();
				System.out.println("First number is " + x);
				int y = sc.nextInt();
				System.out.println("Second number is " + y);
				String operation = sc.next();
				int result = 0;
				
				switch(operation) {
				case "+":
					result = x + y;
					break;
				case "-":
					result = x - y;
					break;
				case "*":
					result = x * y;
					break;
				case "/":
					result = x / y;
					break;
				default:
					System.out.println("Invalid operation found. Please provide +, -, *, /");
					break;			
				}
				System.out.println("The result of " + x + operation + y + " = " + result);

				errorOccurred = false;
				
			} catch (Exception e) {
				System.out.println("Error occurred: " + e);
				sc.next(); // must call when error occurs, in not infinite loop
			}
		}
		
		sc.close();
		System.out.println("End of Program");
	}

}
