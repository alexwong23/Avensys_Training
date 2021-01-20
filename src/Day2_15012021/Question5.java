package Day2_15012021;

public class Question5 {
	public static void main(String[] args) {
		// uses regex to replace each empty space with string
		for(int i = 1; i <= 5; i++) {
			String repeated = new String(new char[i]).replace("\0", String.valueOf(i));
			System.out.println(repeated);
		}
		
		
		// using StringBuilder nested loop
		StringBuilder str = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				str.append(i);
			}
			str.append("\n");
		}
		System.out.println(str.toString());
	}
}
