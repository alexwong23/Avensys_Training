package Day1_14012021;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		if(n < 2) {
			isPrime = false;
		} else {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	
	//	11. Write a program to check whether the given number is a prime number
	public static void main(String[] args) {
		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int n:numbers) {
			if(isPrime(n)) {
				System.out.printf("%d is a prime number\n", n);
			} else {
				System.out.printf("%d is NOT a prime number\n", n);
			}
		}
	}
}
