package Day03_18012021;

public class Pattern1 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				str.append("*");
			}
			for(int j = 5; j > i; j--) {
				str.append(" ");
			}
			for(int j = 1; j <= 5; j++) {
				str.append("*");
			}
			for(int j = 1; j < i; j++) {
				str.append(" ");
			}
			for(int j = 5; j >= i; j--) {
				str.append("*");
			}
			str.append("\n");
		}
		System.out.print(str.toString());
		
		StringBuilder str2 = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j < i; j++) {
				str2.append(" ");
			}
			for(int j = 5; j >= i; j--) {
				str2.append("*");
			}
			for(int j = 1; j <= i; j++) {
				str2.append("*");
			}
			for(int j = 5; j > i; j--) {
				str2.append(" ");
			}
			for(int j = 1; j <= 5; j++) {
				str2.append("*");
			}
			for(int j = 1; j <= i; j++) {
				str2.append("*");
			}
			str2.append("\n");
		}
		System.out.print(str2.toString());
	}
}
