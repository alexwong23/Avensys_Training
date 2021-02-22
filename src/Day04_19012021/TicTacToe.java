package Day04_19012021;

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
		System.out.println("********** Board **********");
		System.out.printf("\n\t %c | %c | %c \n\t-----------\n\t %c | %c | %c \n\t-----------\n\t %c | %c | %c \n\n",
										board[0], board[1], board[2],
										board[3], board[4], board[5],
										board[6], board[7], board[8]);
	}
	
	public boolean emptyPosition(int pos) {
		boolean empty = false;
		if(pos < 1 || pos > 9) {
			System.out.println("Error occurred: The position " + pos + " is not within the range 1 - 9");
		} else {
			if(pos >= 1 && pos <= 9 && this.board[pos - 1] == ' ') {
				empty = true;
			} else {
				System.out.println("Error occurred: The position " + pos + " already has a symbol " + this.board[pos - 1]);
			}
		}
		return empty;
	}
	
	public void makeMove(int pos, char symbol) {
		this.board[pos - 1] = symbol;
	}
	
	public boolean checkWinner(char symbol) {
		boolean win = false;
		if((this.board[0] == symbol && this.board[1] == symbol && this.board[2] == symbol) ||
			(this.board[3] == symbol && this.board[4] == symbol && this.board[5] == symbol) ||
			(this.board[6] == symbol && this.board[7] == symbol && this.board[8] == symbol) ||
			(this.board[0] == symbol && this.board[3] == symbol && this.board[6] == symbol) ||
			(this.board[1] == symbol && this.board[4] == symbol && this.board[7] == symbol) ||
			(this.board[2] == symbol && this.board[5] == symbol && this.board[8] == symbol) ||
			(this.board[0] == symbol && this.board[4] == symbol && this.board[8] == symbol) ||
			(this.board[2] == symbol && this.board[4] == symbol && this.board[6] == symbol)) {
			win = true;
		}
		return win;
	}
	
	public static void main(String[] args) {
		System.out.println("========== Tic Tac Toe Game ==========");
		TicTacToe tttGame = new TicTacToe();
		
		int position = -1;
		int turn = 1;
		char playerSymbol = 'X';
		Scanner sc = new Scanner(System.in);
		while(turn <= 9) {
			// print board
			tttGame.printBoard();
			System.out.print("It is " + playerSymbol + "'s turn. Enter a position: ");
			try {
				position = sc.nextInt();
//				position = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("Error Occurred: " + e);
				sc.next(); // prevent infinite loop
				continue;
			}
			
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
		}
		
		sc.close();
		System.out.println("End of Program");
	}
}
