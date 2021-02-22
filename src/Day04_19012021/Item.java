package Day04_19012021;

public class Item {
	private String name;
	private double price;
	
	public Item() {}
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
}