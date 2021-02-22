package Day04_19012021;

public class Referee extends Person {
	
	private int[] pNumbers;
	private int gNumber;
	
	public Referee() {};
	
	public Referee(String name, String gender, int age, int numPlayers) {
		super(name, gender, age);
		this.pNumbers = new int[numPlayers];
	}
	
	public int getGuesserNumber() {
		return this.gNumber;
	}
	
	public int[] getPlayerNumbers() {
		return this.pNumbers;
	}
	
	public void setGuesserNumber(int gNumber) {
		this.gNumber = gNumber;
	}
	
	public void setPlayerNumber(int playerNumber, int pNumber) {
		this.pNumbers[playerNumber - 1] = pNumber;
	}
	
	public int compareNumbers() {
		int result = -1;
		for(int i = 0; i < pNumbers.length; i++) {
			if(pNumbers[i] == gNumber) {
				result = i + 1;
				break;
			}
		}
		return result;
	}

}
