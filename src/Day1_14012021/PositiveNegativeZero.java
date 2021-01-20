package Day1_14012021;

public class PositiveNegativeZero {
	
	public static String isPositiveNegativeZero(int number) {
		String result = "";
		if(number == 0) {
			result = "zero";
		} else if (number > 0) {
			result = "positive";
		} else {
			result = "negative";	
		}
		return result;
	}
	
	//	4. Write a program to check whether the given integer is positive, negative or zero
	public static void main(String[] args) {
		int firstInteger = 2;
		int secondInteger = 0;
		int thirdInteger = -3;
		System.out.printf("%d is %s\n", firstInteger, isPositiveNegativeZero(firstInteger));
		System.out.printf("%d is %s\n", secondInteger, isPositiveNegativeZero(secondInteger));
		System.out.printf("%d is %s\n", thirdInteger, isPositiveNegativeZero(thirdInteger));
	}
}
