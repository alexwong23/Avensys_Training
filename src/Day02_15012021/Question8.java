package Day02_15012021;

import java.util.Scanner;

public class Question8 {
	
	public static int calculateSquare(int number) {
		return number * number;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		do {			
			int number = sc.nextInt();
			System.out.println("Square of " + number + " is " + calculateSquare(number));
			System.out.println("Enter a number: ");
		} while(sc.hasNextInt());
				
		sc.close();
		System.out.println("End of Program");
	}
}
