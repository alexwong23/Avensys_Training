package Day09_16022021;

import java.util.Scanner;

public class CharAtTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String name = sc.nextLine();
		StringBuilder sb = new StringBuilder(String.valueOf(name));
		int len = sb.length();
		
		boolean palindrome = true;
		char firstHalf;
		char secondHalf;
		
		for(int i = 0; i < len/2; i++) {
			firstHalf = sb.charAt(i);
			secondHalf = sb.charAt(len - i - 1);
			
			//program to check if string is a palindrome
			if(firstHalf != secondHalf) {
				palindrome = false;
			}
			
			//program to reverse a given string
			sb.setCharAt(i, secondHalf);
			sb.setCharAt(len - i - 1, firstHalf);
		}
		
		System.out.println("Reversed: " + sb.toString());
		System.out.println(name + " is a palindrome: " + palindrome);
		
		sc.close();
		System.out.println("End of program");
	}
}
