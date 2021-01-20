package Day4_19012021;

public class Fan {
	private String colour;
	private String brand;
	private String rotation;
	
	public Fan() {}
	
	public Fan(String colour, String brand) {
		this.colour = colour;
		this.brand = brand;
		this.rotation = "left";
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getRotation() {
		return this.rotation;
	}
	
	public void printDetails() {
		System.out.printf("Colour: %s\nBrand: %s\nRotation: %s\n", this.colour, this.brand, this.rotation);
	}
	
	public boolean rotateLeft() {
		boolean result = false;
		if(!this.rotation.equals("left")) {
			result = true;
			this.rotation = "right";
		}
		return result;
	}
	
	public boolean rotateRight() {
		boolean result = false;
		if(!this.rotation.equals("right")) {
			result = true;
			this.rotation = "left";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Fan newFan = new Fan("grey", "Hitachi");
		newFan.printDetails();
	}
}
