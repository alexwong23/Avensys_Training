package Day01_14012021;

public class CentimeterFeetInch {

	public static void convertCentimeterToFeetInch(double centimeter) {
		double feetDouble = (centimeter / 30.48);
		int feetInteger = (int) feetDouble;
		double inch = (centimeter % 30.48) / 2.54;
		System.out.printf("%.1fcm is %d feet %.2f inches\n", centimeter, feetInteger, inch);
	}
	
	//	8. Write a program to accept the height of the person in centimeter and convert it and display the height in feet and inches
	public static void main(String[] args) {
		double heightA = 180.5;
		double heightB = 170.5;
		convertCentimeterToFeetInch(heightA);
		convertCentimeterToFeetInch(heightB);
	}
}
