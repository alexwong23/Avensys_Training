package Day2_15012021;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isPalindrome = true;
		System.out.println("Enter a string: ");
		
		StringBuilder input = new StringBuilder(sc.next());
		int len = input.length();
		for(int i = 0; i < len/2; i++) {
			char temp = input.charAt(i);
			if (temp != input.charAt(len - i - 1)) {
				isPalindrome = false;
			}
			input.setCharAt(i, input.charAt(len - i - 1));
			input.setCharAt(len - i - 1, temp);
		}

		System.out.println(input.toString());
		System.out.println("isPalindrome? " + isPalindrome);
		
		// try input racecar!!
		
		sc.close();
		System.out.println("End of program");
	}
}
