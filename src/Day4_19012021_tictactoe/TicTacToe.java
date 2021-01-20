package Day4_19012021_tictactoe;

import java.util.Scanner;

public class TicTacToe {
	private char[] board;
	
	public TicTacToe() {
		this.board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
	};
	
	public char[] getBoard() {
		return this.board;
	}
	
	public void printBoard() {
		System.out.printf("%c|%c|%c\n%c|%c|%c\n%c|%c|%c\n", board[0], board[1], board[2],
															board[3], board[4], board[5],
															board[6], board[7], board[8]);
	}
	
	public boolean emptyPosition(int pos) {
		boolean empty = false;
		if(pos >= 1 && pos <= 9 && this.board[pos - 1] == ' ') {
			empty = true;
		}
		return empty;
	}
	
	public boolean makeMove(int pos, char symbol) {
		boolean success = false;
		if(this.emptyPosition(pos)) {
			this.board[pos - 1] = symbol;
			success = true;
		} else {
			System.out.println("Error occurred: The position " + pos + " already has a symbol " + this.board[pos - 1]);
		}
		return success;
	}
	
	public boolean checkWinner(char symbol) {
		boolean win = false;
		if((board[0] == symbol && board[1] == symbol && board[2] == symbol) ||
			(board[3] == symbol && board[4] == symbol && board[5] == symbol) ||
			(board[6] == symbol && board[7] == symbol && board[8] == symbol) ||
			(board[0] == symbol && board[3] == symbol && board[6] == symbol) ||
			(board[1] == symbol && board[4] == symbol && board[7] == symbol) ||
			(board[2] == symbol && board[5] == symbol && board[8] == symbol) ||
			(board[0] == symbol && board[4] == symbol && board[8] == symbol) ||
			(board[2] == symbol && board[4] == symbol && board[6] == symbol)) {
			System.out.println("checking");
			win = true;
			System.out.println("checked");
		}
		return win;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== Tic Tac Toe Game ==========");
		TicTacToe tttGame = new TicTacToe();
		
		int position = -1;
		int turn = 1;
		char playerSymbol;
		while(turn <= 9) {
			// decide next player symbol
			if(turn % 2 == 0) {
				playerSymbol = 'O';
			} else {
				playerSymbol = 'X';
			}
			tttGame.printBoard();
			try {
				System.out.print("Enter a position: ");
				position = sc.nextInt();
				if(tttGame.makeMove(position, playerSymbol)) { // correct move made
					if(turn >= 3 && tttGame.checkWinner(playerSymbol)) { // check winner
						tttGame.printBoard();
						System.out.println("Player " + playerSymbol + " is the winner!");
						break;
					}
					turn++;
				}
			} catch(Exception e) {
				System.out.println("Error Occurred: " + e);
				sc.next();
			}
		}
		
		sc.close();
		System.out.println("End of Program");
	}
}
