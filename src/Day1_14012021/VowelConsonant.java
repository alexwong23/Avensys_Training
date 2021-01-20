package Day1_14012021;

public class VowelConsonant {
	
	//	2. Write a program to check whether the given character is a vowel or consonant
	public static void main(String[] args) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		char[] testChar = {'a', 'b', 'c', 'd', 'e'};
		for(char c:testChar) {
			boolean isVowel = false;
			for (char vowel:vowels) {
				if(c == vowel) {
					isVowel = true;
					break;
				}
			}
			if(isVowel) {
				System.out.printf("%c is a vowel\n", c);	
			} else {
				System.out.printf("%c is a consonant\n", c);
			}
		}
	}
}
