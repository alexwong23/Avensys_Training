package Day01_14012021;

public class TriangleArea {
	
	//	14. Write a program to find the area of the triangle.
	public static void main(String[] args) {
		Triangle firstTriangle = new Triangle(5.0, 2.0);
		Triangle secondTriangle = new Triangle(15.2, 3.5);
		System.out.printf("Triangle Area: %.2f\n", firstTriangle.getArea());
		System.out.printf("Triangle Area: %.2f\n", secondTriangle.getArea());
	}
}
