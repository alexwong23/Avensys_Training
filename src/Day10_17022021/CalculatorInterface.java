package Day10_17022021;

interface SimpleArithmetic {
	public int addition(int a, int b);
	public int subtract(int a, int b);
}

interface IntermediateArithmetic {
	public int multiply(int a, int b);
	public int divide(int a, int b);
}

interface AdvancedArithmetic {
	public int power(int a, int b);
	public int square(int a, int b);
}

class Calculator implements SimpleArithmetic, IntermediateArithmetic {
	
	public Calculator() {}
	
	public int addition(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
}

public class CalculatorInterface {
	
	public static void main(String[] args) {
		Calculator ci = new Calculator();
		
		System.out.println(ci.addition(1, 2));
		
		System.out.println(ci.subtract(5, 3));
		
		System.out.println(ci.multiply(5, 3));
		
		System.out.println(ci.divide(6, 3));
	}

	

}
