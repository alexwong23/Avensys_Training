package Day01_14012021;

public class EvenOdd {

	public static String isEven(int number) {
		String result = "odd";
		if(number % 2 == 0) {
			result = "even";
		}
		return result;
	}
	
	//	3. Write a program to check whether the given integer is even or odd
	public static void main(String[] args) {
		int firstInteger = 2;
		int secondInteger = 5;
		System.out.printf("%d is %s\n", firstInteger, isEven(firstInteger));
		System.out.printf("%d is %s\n", secondInteger, isEven(secondInteger));
	}
}
