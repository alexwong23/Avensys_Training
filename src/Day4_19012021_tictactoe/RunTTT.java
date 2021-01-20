package Day4_19012021_tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunTTT {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("========== Tic Tac Toe Game ==========");
		TicTacToe tttGame = new TicTacToe();
		
		int position = -1;
		int turn = 1;
		char playerSymbol = 'X';
		while(turn <= 9) {
			// print board
			tttGame.printBoard();
			try {
				System.out.print("It is " + playerSymbol + "'s turn. Enter a position: ");
				position = Integer.parseInt(br.readLine());
				// check if valid move made
				if(tttGame.emptyPosition(position)) {
					tttGame.makeMove(position, playerSymbol);
					if(turn >= 3 && tttGame.checkWinner(playerSymbol)) { // check winner
						tttGame.printBoard();
						System.out.println("Player " + playerSymbol + " is the winner!");
						break;
					}
					turn++;
					
					// change next player symbol
					if(turn % 2 == 0) {
						playerSymbol = 'O';
					} else {
						playerSymbol = 'X';
					}
				}
			} catch(Exception e) {
				System.out.println("Error Occurred: " + e);
//				sc.next();
			}
		}
		
		br.close();
		System.out.println("End of Program");
	}
}
