package Day01_14012021;

public class Triangle {
	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getArea() {
		return 0.5 * this.height * this.base;
	}
}
