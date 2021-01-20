package Day2_15012021;

public class Question16 {
	
	public static void smallestLargestWord(String s) {
		String[] words = s.split(" ");
		
		String smallest = null;
		String largest = null;
		for(String word: words) {
			if(smallest == null && largest == null) {
				smallest = word;
				largest = word;
			} else if(word.length() < smallest.length()) {
				smallest = word;
			} else if(word.length() > largest.length()) {
				largest = word;
			}
		}
		
		System.out.println("The smallest string is : " + smallest);
		System.out.println("The largest string is : " + largest);
	}
	
	public static void main(String[] args) {
		String firstStr = "This is an example";
		String secondStr = "I hope this works";

		smallestLargestWord(firstStr);
		smallestLargestWord(secondStr);
		
	}
}
