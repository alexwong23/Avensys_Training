package Day1_14012021;

public class RectangleArea {
	
	public static double getArea(double length, double width) {
		return length * width;
	}
	
	public static int getArea(int length, int width) {
		return length * width;
	}
	
	//	15. Write a program to find the area of the rectangle.
	public static void main(String[] args) {
		Rectangle firstRectangle = new Rectangle(5.0, 2.0);
		Rectangle secondRectangle = new Rectangle(15.2, 3.5);
		System.out.printf("Rectangle Area: %.2f\n", firstRectangle.getArea());
		System.out.printf("Rectangle Area: %.2f\n", secondRectangle.getArea());
		
		double areaDouble = getArea(5.1, 2.2);
		int areaInt = getArea(5, 2);
		System.out.println("areaDouble = " + areaDouble);
		System.out.println("areaInt = " + areaInt);
	}
}
