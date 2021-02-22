package Day04_19012021;

import java.util.Random;

public class Guesser extends Person {
	private int number;
	
	public Guesser() {};
	
	public Guesser(String name, String gender, int age, int min, int max) {
		super(name, gender, age);
		this.number = this.guessNumber(min, max);
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int guessNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}
