package Day1_14012021;

public class UpperLowercase {
	
	public static String isUpperLower(char c) {
		String result = "";
		int ascii = (int) c; // cast it to an int
		if(ascii >= 97 && ascii <= 122) {
			result = "lower";
		} else if (ascii >= 65 && ascii <= 90) {
			result = "upper";
		} else {
			result = "not an alphabet";
		}
		return result;
	}
	
	//	5. Write a program to check whether the given character is uppercase, lowercase.
	public static void main(String[] args) {
		char lowerA = 'a';
		char upperA = 'A';
		char lowerZ = 'z';
		char upperZ = 'Z';
		char notAlphabet = '!';
		System.out.printf("%c is %s\n", lowerA, isUpperLower(lowerA));
		System.out.printf("%c is %s\n", upperA, isUpperLower(upperA));
		System.out.printf("%c is %s\n", notAlphabet, isUpperLower(notAlphabet));
		System.out.printf("%c is %s\n", lowerZ, isUpperLower(lowerZ));
		System.out.printf("%c is %s\n", upperZ, isUpperLower(upperZ));
	}
}
