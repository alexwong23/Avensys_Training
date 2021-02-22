package Day02_15012021;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();
		
		StringBuilder str = new StringBuilder("The lowest common multiple is ");
		int i = 2;
		int lcm = 1;
		// if x and y can still be divided
		while(x > 1 || y > 1) {
			if(x % i == 0 && y % i == 0) { 	// both can be divided
				x /= i;
				y /= i;
				lcm *= i;
				str.append(i + "x");
			} else if(x % i == 0) { 		// only x can be divided
				x /= i;
				lcm *= i;
				str.append(i + "x");
			} else if(y % i == 0) { 		// only y can be divided
				y /= i;
				lcm *= i;
				str.append(i + "x");
			} else { 						// cannot be divided by i
				i++;
			}
		}
		
		// remove last multiply char
		str.deleteCharAt(str.length() - 1);
		str.append(" = " + lcm);
		System.out.println(str.toString());
		
		sc.close();
		System.out.println("End of Program");
	}
}
