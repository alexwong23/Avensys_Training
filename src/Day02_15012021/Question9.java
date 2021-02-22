package Day02_15012021;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();
		int gcd = 1;
		for(int i = 2; i <= x; i++) {
			// if both x and y are divisible by i and i is greater than the stored gcd
			if(x % i == 0 && y % i == 0 && i > gcd) {
				gcd = i;
			}
		}
		
		System.out.println("The greatest common divisor is " + gcd);
		
		sc.close();
		System.out.println("End of Program");
	}
}
