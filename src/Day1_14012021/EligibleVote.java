package Day1_14012021;

import java.util.*;

public class EligibleVote {
	
	
	//	7. Write a program to read the age of the candidate whether he/she is elegible for casting his/her vote
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int userAge = sc.nextInt();
		if (userAge >= 21) {
			System.out.println("User is eligible to vote");
		} else {
			System.out.println("User is NOT eligible to vote");
		}
		sc.close();
	}
}
