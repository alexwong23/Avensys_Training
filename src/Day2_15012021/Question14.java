package Day2_15012021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = sc.next();
		
		int countVowels = 0;
		int countConsonants = 0;
		String[] vowels = {"a", "e", "i", "o", "u"};
		List<String> list = Arrays.asList(vowels);
		
		for(int i = 0; i < input.length(); i++) {
			char temp = Character.toLowerCase(input.charAt(i));
			String tempStr = String.valueOf(temp);
			// is an alphabet
			if((temp >= 'a' && temp <= 'z') || temp >= 'A' && temp <= 'Z') {
				if(list.contains(tempStr)) {
					countVowels++;
				} else {
					countConsonants++;
				}
			}
		}
		
		System.out.println("Number of Vowels: " + countVowels);
		System.out.println("Number of Consonants: " + countConsonants);
		
		sc.close();
		System.out.println("End of program");
	}
}
