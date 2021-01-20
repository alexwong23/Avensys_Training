package Day4_19012021;

import java.util.Random;

public class PlayGame {
	
	public static int writeNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
	
	public static void main(String[] args) {
		int numPlayers = 3;
		int min = 1;
		int max = 10;
		
		Player p1 = new Player("Player 1", "Male", 12, min, max);
		Player p2 = new Player("Player 2", "Female", 13, min, max);
		Player p3 = new Player("Player 3", "Male", 14, min, max);
		Guesser g1 = new Guesser("Guesser", "Male", 21, min, max);
		Referee r1 = new Referee("Referee", "Female", 17, numPlayers);
		
		r1.setPlayerNumber(1, p1.getNumber());
		r1.setPlayerNumber(2, p2.getNumber());
		r1.setPlayerNumber(3, p3.getNumber());
		r1.setGuesserNumber(g1.getNumber());
		
		System.out.println(p1.getName() + " has number " + p1.getNumber());
		System.out.println(p2.getName() + " has number " + p2.getNumber());
		System.out.println(p3.getName() + " has number " + p3.getNumber());
		System.out.println(g1.getName() + " guessed number " + g1.getNumber());
		
		int player = r1.compareNumbers();
		if(player >= 0) {
			System.out.println(g1.getName() + " was able to guess the number " + g1.getNumber() + " from player " + player);
		} else {
			System.out.println(g1.getName() + " was unable to guess the number!");
		}
	}
}
