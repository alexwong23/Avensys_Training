package Day1_14012021;

public class SwapNumbers {
	
	public static void swapNumbers(int firstNumber, int secondNumber) {
		System.out.println("Before Swap: First Number is " + firstNumber + ", Second Number is " + secondNumber);
		firstNumber += secondNumber; // 6 + 5 = 11
		secondNumber = firstNumber - secondNumber; // 11 - 5 = 6
		firstNumber -= secondNumber; // 11 - 6 = 5
		System.out.println("After Swap: First Number is " + firstNumber + ", Second Number is " + secondNumber);
	}
	
	//	12. Write a program to swap 2 numbers without a third
	public static void main(String[] args) {
		swapNumbers(1, 2);
		swapNumbers(6, 5);
	}
}
