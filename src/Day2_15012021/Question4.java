package Day2_15012021;

import java.util.Scanner;

public class Question4 {
	//	4. Write a program to let the user enter the numbers until the user selects 'Y' or 'y', if any other character entered then the 
	// program should calculate the total number of positive integers, negative integers and number of times '0' is entered. (Hint: use do-while loop)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// counters
		int countZero = 0;
		int countPositive = 0;
		int countNegative = 0;
		
		// hold the user input
		String input = "";
		
		do {
			System.out.printf("Enter a number: ");
			input = sc.next();
			
			// program continue when not Y or y character
			if(input.equals("Y") || input.equals("y")) {
				continue;
			} else {
				try {
					int number = Integer.parseInt(input);
					if(number < 0) {
						countZero++;
					} else if(number < 0) {
						countNegative++;
					} else if(number > 0) {
						countPositive++;
					}
				} catch (Exception e) {
					System.out.println("Error occurred: " + e);
				}
			}
		} while(!(input.equals("Y") || input.equals("y")));
		
		System.out.println("Number of zeros: " + countZero);
		System.out.println("Number of positive numbers: " + countPositive);
		System.out.println("Number of negative numbers: " + countNegative);
		
		sc.close();
		System.out.println("End of Program");
	}
}
