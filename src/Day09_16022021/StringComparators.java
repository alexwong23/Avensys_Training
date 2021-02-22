package Day09_16022021;

class CompareToString {
	private String s1;
	private String s2;
	
	public CompareToString(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public String toString() {
		if(s1.compareTo(s2) == 0) {
			return "equal";
		} else {
			return "not equal";
		}
	}
}

public class StringComparators {
	
	public static void main(String[] args) {
		String s1 = "Alex";
		String s2 = "alex";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		CompareToString cts = new CompareToString(s1, s2);
		System.out.println(cts);
		
		CompareToString cts2 = new CompareToString(s1, "Alex");
		System.out.println(cts2);
	}
}
