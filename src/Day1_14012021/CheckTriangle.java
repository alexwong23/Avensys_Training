package Day1_14012021;

public class CheckTriangle {
	
	public static void checkTriangle(int[] triangle) {
		// equilateral triangle, all sides equal
		if(triangle[0] == triangle[1] && triangle[0] == triangle[2]) {
			System.out.println("The triangle is equilateral.");
		// isosceles triangle, at least two sides equal
		} else if (triangle[0] == triangle[1] || triangle[0] == triangle[2] || triangle[1] == triangle[2]) {
			System.out.println("The triangle is isosceles.");
		// scalene triangle, all sides unequal
		} else {
			System.out.println("The triangle is scalene.");
		}	
	}
			
	//	9. Write a program to check whether the triangle is Equilateral, isosceles or scalene
	public static void main(String[] args) {
		int[] equilateralTriangle = {60, 60, 60};
		int[] isoscelesTriangle = {80, 80, 20};
		int[] scaleneTriangle = {50, 60, 70};
		
		checkTriangle(equilateralTriangle);
		checkTriangle(isoscelesTriangle);
		checkTriangle(scaleneTriangle);
	}
}
