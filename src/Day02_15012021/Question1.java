package Day02_15012021;
import java.util.Scanner;

public class Question1 {
	
//	1. Using the below already executed program, make the user keep entering the numbers and the operations and adding prompt until the user 
//	   selects 'n' or 'N' (Use the same char functionality that's used for switch)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean errorOccurred = true;
		
		while(errorOccurred) {
			System.out.println("Enter 2 numbers: ");
			try {
				int x = sc.nextInt();
				System.out.println("First number is " + x);
				int y = sc.nextInt();
				System.out.println("Second number is " + y);
				String operation = sc.next();
				int result = 0;
				
				switch(operation) {
				case "+":
					result = x + y;
					break;
				case "-":
					result = x - y;
					break;
				case "*":
					result = x * y;
					break;
				case "/":
					result = x / y;
					break;
				default:
					System.out.println("Invalid operation found. Please provide +, -, *, /");
					break;			
				}
				System.out.println("The result of " + x + operation + y + " = " + result);
				
				System.out.println("Enter \'n\' or \'N\' to discontinue");
				String cont = sc.next();
				if(cont.equals("n") || cont.equals("N")) {
					errorOccurred = false;
					System.out.println("Stop operation");
				}
			} catch (Exception e) {
				System.out.println("Error occurred: " + e);
				sc.next(); // must call when error occurs, in not infinite loop
			}
		}
		
		sc.close();
		System.out.println("End of Program");
	}
}
