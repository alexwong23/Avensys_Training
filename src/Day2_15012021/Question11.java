package Day2_15012021;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending range: ");
		int end = sc.nextInt();
		
		StringBuilder str = new StringBuilder("The sum of the range is : ");
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			sum += i;
			str.append(i + "+");
		}
		
		// remove last add char
		str.deleteCharAt(str.length() - 1);
		str.append(" = " + sum);
		System.out.println(str.toString());
		
		sc.close();
		System.out.println("End of Program");
	}
}
