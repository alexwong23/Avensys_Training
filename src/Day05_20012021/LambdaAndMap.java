package Day05_20012021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Operations {
	void add(int a, int b); // only one
//	void subtract(int a, int b);
//	void multiply(int a, int b);
//	void divide(int a, int b);
}

public class LambdaAndMap {
	
	public static void main(String[] args) {
		
		// functional interface
		Operations op = (int a, int b)->System.out.println("Addition = " + (a + b));
		op.add(1, 2);
		
		// basic lambda operation
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		numbers.forEach((n) -> { System.out.println(n); });
		
		
		// map String to Integer
		List<String> numString = Arrays.asList("1", "2", "3", "4", "5", "6");
		
		// stream needed cause map is a method in the stream class
		// filter based upon condition given
		// collect converts numbers into a list and return
		List<Integer> even = numString.stream()
									.map(s -> Integer.valueOf(s))
									.filter(number -> number % 2 == 0)
									.collect(Collectors.toList());
		
		System.out.println("Only even numbers: " + even);	
	}
}
