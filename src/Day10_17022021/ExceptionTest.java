package Day10_17022021;

import java.util.Scanner;

public class ExceptionTest {
	
	public static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
	
	public static void main(String[] args) {
		System.out.println("start program");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Input two integers: ");
			int firstInteger = sc.nextInt();
			if(firstInteger < 0) {
				throw new ArithmeticException("Must be positive number");
			}
			int secondInteger = sc.nextInt();
			if(secondInteger < 0) {
				throw new ArithmeticException("Must be positive number");
			}
			System.out.println("Result: " + divide(firstInteger, secondInteger));
		} catch(NullPointerException npe) {
			System.out.println("IO Exception error: " + npe);
		} catch(NumberFormatException nfe) {
			System.out.println("Number Format Exception error: " + nfe);
		} catch(Exception e) {
			System.out.println("Exception error: " + e);
		} finally {
			sc.close();
		}
		
		

		System.out.println("close program");	
	}
}
