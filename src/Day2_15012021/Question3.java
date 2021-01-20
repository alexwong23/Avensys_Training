package Day2_15012021;

import java.util.Scanner;

public class Question3 {
	//	3. Write a program to enter the numbers till the user wants to, and then it should display the larges and the smallest numbers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int smallest = 0;
		int largest = 0;
		
		System.out.printf("Enter a number: ");
		while(sc.hasNextInt()) {
			try {
				int number = sc.nextInt();
				if(number < smallest) {
					smallest = number;
				} else if(number > largest) {
					largest = number;
				}
			} catch (Exception e) {
				System.out.println("Error occurred: " + e);
				sc.next(); // must call when error occurs, in not infinite loop
			}
			System.out.printf("Enter a number: ");
		}
		
		System.out.println("Smallest number = " + smallest);
		System.out.println("Largest number = " + largest);
		
		sc.close();
		System.out.println("End of Program");
	}
}
