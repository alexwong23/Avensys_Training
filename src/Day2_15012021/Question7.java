package Day2_15012021;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		
		StringBuilder str = new StringBuilder("The prime numbers are : ");
		int input = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i <= input; i++) {
			isPrime = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			// append if it is a prime number
			if(isPrime) str.append(i + ",");
		}
		
		// remove last comma
		str.deleteCharAt(str.length() - 1);
		System.out.println(str.toString());
		
		sc.close();
		System.out.println("End of Program");
	}
}
