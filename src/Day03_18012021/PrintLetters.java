package Day03_18012021;

import java.util.Scanner;

public class PrintLetters {
	
	public static String printLetter(char letter, int row, int size) {
		StringBuilder str = new StringBuilder();
		
		switch(letter) {
			case 'A':  // letter A
				for(int j = 1; j <= size; j++) {
					if((row == 1 && (j != 1 && j != size)) || row == size/2 || (j == 1 && row > 1) || (j == size && row > 1)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'B':  // letter B
				for(int j = 1; j <= size; j++) {
					if((row == 1 && j <= ((3*size)/4)) || (row == size/2 && j <= size - 1) || (row == size && j <= size - 1)||
						j == 1 || (row < size/2 && row != 1 && j == 1 + ((3*size)/4)) || (row > size/2 && row != size && j == size)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'C':  // letter C
				for(int j = 1; j <= size; j++) {
					if((row == 1 && (j != 1 && j != size)) || (row == size && (j != 1 && j != size)) || (j == 1 && (row != 1 && row != size))) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'D':  // letter D
				for(int j = 1; j <= size; j++) {
					if((row == 1 && j != size) || (row == size && j != size) || j == 1 || (j == size && (row != 1 && row != size))) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'E':  // letter E
				for(int j = 1; j <= size; j++) {
					if(row == 1 || j == 1 || row == size/2 || row == size) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'F':  // letter F
				for(int j = 1; j <= size; j++) {
					if(row == 1 || j == 1 || row == size/2) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'G':  // letter G
				for(int j = 1; j <= size; j++) {
					if(row == 1 || j == 1 || row == size || (j == size && row >= size/2) || (row == size/2 && j >= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'H':  // letter H
				for(int j = 1; j <= size; j++) {
					if(j == 1 || j == size || row == size/2) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'I':  // letter I
				for(int j = 1; j <= size; j++) {
					if(row == 1 || row == size || j == size/2) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'J':  // letter J
				for(int j = 1; j <= size; j++) {
					if(row == 1 || (row == size && j <= size/2 + 1) || j == size/2 + 1 || (j == 1 && row >= (3*size/4))) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'K':  // letter K
				for(int j = 1; j <= size; j++) {
					if(j == size/2 || (j == row && row >= size/2) || (j + row == size + 1 && row <= size/2) ) {
						str.append("*");
					} else if (j >= size/2 - 1) {
						str.append(" ");
					}
				}
				break;
			case 'L':  // letter L	
				for(int j = 1; j <= size; j++) {
					if(j == 1 || row == size) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'M':  // letter M	
				for(int j = 1; j <= size; j++) {
					if(j == 1 || j == size || (j == row && row <= size/2) || (j + row == size + 1 && row <= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'N':  // letter N	
				for(int j = 1; j <= size; j++) {
					if(j == 1 || j == size || j == row) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'O':  // letter O	
				for(int j = 1; j <= size; j++) {
					if((j == 1 && (row != 1 && row != size)) || (j == size && (row != 1 && row != size)) || 
						(row == 1 && (j != 1 && j != size)) || (row == size && (j != 1 && j != size))) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'P':  // letter P
				for(int j = 1; j <= size; j++) {
					if(j == 1 || row == 1 || row == size/2 || (row <= size/2 && j == size)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'Q':  // letter Q	
				for(int j = 1; j <= size; j++) {
					if((j == 1 && (row != 1 && row != size)) || (j == 7*size/8 && (row != 1 && row != size)) || 
						(row == 1 && (j != 1 && j <= 3*size/4)) || (row == size && (j != 1 && j <= 3*size/4)) ||
						(row == j && row >= (5*size/8))) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'R':  // letter R
				for(int j = 1; j <= size; j++) {
					if(j == 1 || row == 1 || row == size/2 || (row <= size/2 && j == size) || (row == j && row >= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'S':  // letter S
				for(int j = 1; j <= size; j++) {
					if(row == 1 || row == size/2 || row == size || (j == 1 && row <= size/2) || (j == size && row >= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'T':  // letter T
				for(int j = 1; j <= size; j++) {
					if(row == 1 || j == size/2) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'U':  // letter U
				for(int j = 1; j <= size; j++) {
					if(j == 1 || j == size || row == size) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'V':  // letter V	
				for(int j = 1; j <= size; j++) {
					if(row - j == size/2 || row + j == (3*size/2) + 1 || (j == 1 && row <= size/2) || (j == size && row <= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'W':  // letter W	
				for(int j = 1; j <= size; j++) {
					if(j == 1 || j == size || (j == row && row >= size/2) || (j + row == size + 1 && row >= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'X':  // letter X	
				for(int j = 1; j <= size; j++) {
					if(j == row || j + row == size + 1) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'Y':  // letter Y
				for(int j = 1; j <= size; j++) {
					if((j == row && row <= size/2) || (j + row == size && row <= size/2) || (j == size/2 && row >= size/2)) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case 'Z':  // letter Z
				for(int j = 1; j <= size; j++) {
					if(row == 1 || row == size || row + j == size + 1) {
						str.append("*");
					} else {
						str.append(" ");
					}
				}
				break;
			case ' ':  // space between
				for(int l = 0; l <= size; l+=10) {
					str.append("     ");
				}
				break;
			default:
				System.out.println("Could not find character");
				break;
		}
		
		str.append("  "); // space between
	
		return str.toString();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		String input = "";
		
		while(cont) {
			try {
				System.out.print("Font size: ");
				int fontSize = sc.nextInt(); // does not consume new line
				
				input = sc.nextLine(); // Consume newline left-over
				
				System.out.println("Enter a name: ");
				input = sc.nextLine().toUpperCase();  
				System.out.println(input.toUpperCase());
				
				StringBuilder result = new StringBuilder();
				
				for(int row = 1; row <= fontSize; row++) {
					for(int k = 0; k < input.length(); k++) { // iterate through all char of string
						result.append(printLetter(input.charAt(k), row, fontSize));
					}
					result.append("\n");
				}
				
				System.out.println(result.toString());
				
				System.out.print("Enter (N/n) to end the program: ");
				String toContinue= sc.next();
				if(toContinue.equals("N") || toContinue.equals("n")) cont = false;
			} catch(Exception e) {
				System.out.println("An error occurred: " + e);
				input = sc.next();
			}
		}
		
		sc.close();
		System.out.println("End of Program");
	}
}
