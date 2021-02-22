package Day01_14012021;

public class CircleArea {
	
	public static double calculateCircleArea(double radius) {
		return Math.pow(radius, 2.0) * 3.141592653589793;
	}
	
	//	13. Write a program to find the area of the circle.
	public static void main(String[] args) {
		double firstRadius = 10.0;
		double secondRadius = 14.2;
		System.out.printf("Circle with radius %.2f has area %.2f\n", firstRadius, calculateCircleArea(firstRadius));
		System.out.printf("Circle with radius %.2f has area %.2f\n", secondRadius, calculateCircleArea(secondRadius));
	}
}
