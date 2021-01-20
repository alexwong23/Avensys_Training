package Day3_18012021;

public class Pattern2 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j > i; j--) { // loop 4 times for space
				str.append(" ");
			}
			for(int j = 1; j <= i; j++) { // loop 5 times for *
				str.append("*");
			}
			for(int j = 1; j <= 5; j++) { // empty square
				str.append(" ");
			}
			for(int j = 1; j <= i; j++) { // loop 5 times for *
				str.append("*");
			}
			str.append("\n");
		}
		System.out.print(str.toString());
		
		StringBuilder str2 = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) { // empty square
				str2.append(" ");
			}
			for(int j = 1; j <= 5; j++) { // full square
				str2.append("*");
			}
			str2.append("\n");
		}
		System.out.print(str2.toString());
		
		StringBuilder str3 = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i; j++) { // loop 4 times for space 
				str3.append(" ");
			}
			for(int j = 5; j >= i; j--) { // loop 5 times for *
				str3.append("*");
			}
			for(int j = 1; j <= 5; j++) { // empty square
				str3.append(" ");
			}
			for(int j = 5; j >= i; j--) { // loop 5 times for *
				str3.append("*");
			}
			str3.append("\n");
		}
		System.out.print(str3.toString());
	}
}
