package Day01_14012021;

public class HelloWorld {
	
	public static String grades(char g) {
		String result = "";
		switch(g) {
		case 'A':
			result = "Grade: Excellent";
			break;
		case 'B':
			result = "Grade: Good";
			break;
		case 'C':
			result = "Grade: You passed";
			break;
		case 'D':
			result = "Grade: Failed";
			break;
		default:
			result = "Invalid grade entered";
			break;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		char[] characters = {'A', 'B', 'C', 'D', 'E'};
		for(char c: characters) {
			System.out.println(grades(c));
		}
		System.out.println("outside switch");
		
		int number = 2;
		for(int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
		
	}
}
