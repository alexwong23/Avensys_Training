package Day01_14012021;

public class LeapYear {
	
	//	1. Write a Java program to check whether the given year is a leap year or not
	public static void main(String[] args) {
		int year = 2020;
		if(year % 4 == 0) {
			System.out.println("Yes it is a leap year");
		} else {
			System.out.println("No it is not a leap year");
		}
	}

}
