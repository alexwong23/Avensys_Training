package Day02_15012021;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		try {
			int number = sc.nextInt();
			StringBuilder str = new StringBuilder(String.valueOf(number));
			int len = str.length();
			for(int i = 0; i < len/2; i++) {
				char temp = str.charAt(i);
				str.setCharAt(i, str.charAt(len - i - 1));
				str.setCharAt(len - i - 1, temp);
			}
			System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println("An error occurred: " + e);
		}
		
		sc.close();
		System.out.println("End of program");
	}
}
