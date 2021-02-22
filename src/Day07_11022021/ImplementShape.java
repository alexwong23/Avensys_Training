package Day07_11022021;

interface Shape {
	public abstract String getShape();
	public abstract int getSides();
	public abstract void setShape(String shape);
	public abstract void setSides(int side);
}

interface Colour {
	public abstract String getColour();
	public abstract void setColour(String colour);
}

class ColourShape implements Shape, Colour {
	
	private String shape;
	private int sides;
	private String colour;
	
	public ColourShape(String shape, int sides, String colour) {
		this.shape = shape;
		this.sides = sides;
		this.colour = colour;
	}
	
	public String getShape() {
		return this.shape;
	}
	
	public int getSides() {
		return this.sides;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.shape);
		sb.append(" has " + this.sides + " sides and ");
		sb.append("the colour " + this.colour);
		return sb.toString();
	}
}

public class ImplementShape {
	public static void main(String[] args) {
		ColourShape bluesq = new ColourShape("Square", 4, "Blue");
		ColourShape greentr = new ColourShape("Triangle", 3, "Green");
		System.out.println(bluesq);
		System.out.println(greentr);
	}
}
