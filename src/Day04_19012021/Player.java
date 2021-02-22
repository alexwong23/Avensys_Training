package Day04_19012021;

import java.util.Random;

public class Player extends Person {
	private int number;
	
	public Player() {}
	
	public Player(String name, String gender, int age, int min, int max) {
		super(name, gender, age);
		this.number = this.writeNumber(min, max);
	}
	
	public int getNumber() {
		return this.number;
	}

	public int writeNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
	
}
