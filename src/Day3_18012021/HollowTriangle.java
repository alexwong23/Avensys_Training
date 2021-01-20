package Day3_18012021;

public class HollowTriangle {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				if(i == 1 || i == 5 || j == 1 || i == j) {
					str.append("*");
				} else {
					str.append(" ");
				}
			}
			str.append("\n");
		}
		System.out.println(str.toString());
		
		StringBuilder str2 = new StringBuilder();
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				if(i == 1 || j == 5 || i == j) {
					str2.append("*");
				} else {
					str2.append(" ");
				}
			}
			str2.append("\n");
		}
		System.out.println(str2.toString());
	}
}
