package Day3_18012021;

import java.util.Scanner;

public class PatternExercise1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		
		System.out.print("Enter iterations: ");
		int iterations = sc.nextInt();
		
		for(int i = 1; i <= size; i++) {
			for(int k = 1; k <= iterations; k++) {
				for(int j = 1; j <= size; j++) {
					if(i == 1 || i == size || j == 1 ||(k == iterations && j == size) || i == j || i + j == size + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		
		for(int i = 2; i <= size; i++) {
			for(int k = 1; k <= iterations; k++) {
				for(int j = 1; j <= size; j++) {
					if(i == size || j == 1 ||(k == iterations && j == size) || i == j || i + j == size + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		sc.close();
		System.out.println("End of program");
	}
}
//