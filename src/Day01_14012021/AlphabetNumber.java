package Day01_14012021;

public class AlphabetNumber {
	
	public static String isAlphabetOrNumber(char c) {
		String result = "neither";
		// dont need to cast
		int ascii = (int) c; // cast it to an int
		// c >= 'a' && c <= 'z'
		if(c >= 97 && c <= 122) {
			result = "an alphabet";
		} else if (c >= 65 && c <= 90) {
			result = "an alphabet";
		} else if(c >= 48 && c <= 57) {
			result = "a number";
		}
		return result;
	}
	
	//	10. Write a program to check whether the entered character is an alphabet or number, and display the output accordingly
	public static void main(String[] args) {
		char[] characters = {'a', 'e', 'Y', '0', '5', '*'};
		for(char c:characters) {
			System.out.printf("%c is %s\n", c, isAlphabetOrNumber(c));	
		}
	}
}
