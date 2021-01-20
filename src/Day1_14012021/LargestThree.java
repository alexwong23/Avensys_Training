package Day1_14012021;

import java.util.*;

public class LargestThree {
	
	//	6. Write a program to find and print the largest of 3 numbers. (The numbers must be an input from the user)
	// read the question wrong
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		while(sc.hasNextInt()) {
			int newNumber = sc.nextInt();
			numbers.add(newNumber);
			System.out.print("Enter a number: ");
		}
		sc.close();
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(numbers.get(numbers.size() - i));
		}
		
		System.out.println("End of Program");
	}
}
