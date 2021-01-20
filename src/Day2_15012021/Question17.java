package Day2_15012021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question17 {
	public static String mostRepeatedWord(String s) {
		String[] words = s.toLowerCase().split(" ");
		String result = null;
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for(String word: words) {
			// if cannot find word in hash map, assign value 0
			// add value one to word key
			mp.put(word, mp.getOrDefault(word, 0) + 1);
			
		}
		
		// for each of the entries, print out their key and values 
		mp.entrySet().forEach(entry->{
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
		
		// gets the highest value
		int countMax = 0;
		for(Map.Entry<String, Integer> entry: mp.entrySet()) {
			if(entry.getValue() > countMax) {
				result = entry.getKey();
				countMax = entry.getValue();
			}
		}
		
		return result;
	}
	
	public static List<String> kMostRepeatedWord(String s) {
		String[] words = s.toLowerCase().split(" ");
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for(String word: words) {
			// if cannot find word in hash map, assign value 0
			// add value one to word key
			mp.put(word, mp.getOrDefault(word, 0) + 1);
			
		}
		
		// for each of the entries, print out their key and values 
		mp.entrySet().forEach(entry->{
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
		
		// gets the max frequency, determines array list size
		int countMax = 0;
		for(Map.Entry<String, Integer> entry: mp.entrySet()) {
			if(entry.getValue() > countMax) {
				countMax = entry.getValue();
			}
		}

		// create array to store String array lists
		ArrayList<String>[] arr = (ArrayList<String>[]) new ArrayList[countMax + 1];
		for(int i = 1; i <= countMax; i++) {
			arr[i] = new ArrayList<String>();
		}
		
		// add strings to array lists depending on their counts
		for(Map.Entry<String, Integer> entry: mp.entrySet()) {
			arr[entry.getValue()].add(entry.getKey());
		}
		
		List<String> result = new ArrayList<String>();
		
		
		int k = 3;
		
		// add most k-most frequent words to result
		for(int j = countMax; j >= 1; j--) { // top down approach
			if(arr[j].size() > 0) {
				for(String word: arr[j]) {  // iterate through array lists to add words
					result.add(word);
					if(result.size() == k) {
						return result;
					}
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String firstStr = "Test test this test is one is";
		String secondStr = "testing testing this is a test is";

		System.out.println("The most repeated word is " + mostRepeatedWord(firstStr));
		System.out.println("The most repeated word is " + mostRepeatedWord(secondStr));
		
		System.out.println("The most repeated word is " + kMostRepeatedWord(firstStr).toString());
		System.out.println("The most repeated word is " + kMostRepeatedWord(secondStr).toString());
	}
}
