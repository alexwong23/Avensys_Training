package Day2_15012021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// remove whitespaces and use lowercase
		System.out.println("Enter first string: ");
		String firstStr = sc.next().replaceAll("\\s+","").toLowerCase();
		System.out.println("Enter second string: ");
		String secondStr = sc.next().replaceAll("\\s+","").toLowerCase();
				
		// convert to stringbuilder to use setCharAt
		StringBuilder firstStrB = new StringBuilder(firstStr);
		StringBuilder secondStrB = new StringBuilder(firstStr);
		
		boolean isAnagram = true;
		
		for(int i = 0; i < firstStrB.length(); i++) {
			String temp = String.valueOf(firstStrB.charAt(i));
			int index = secondStrB.indexOf(temp);
			if(index == -1) { 			// String not found
				isAnagram = false;
				break;
			} else {					// String found
				firstStrB.setCharAt(i, '/');
				secondStrB.setCharAt(index, '/');
			}
		}
		
		System.out.println("is Anagram: " + isAnagram);
		
		sc.close();
		System.out.println("End of program");
	}

}
