package Day08_15022021;

class StringPoolTest {
	
	private String s1;
	private String s2;
	
	public StringPoolTest(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void compareSimilarity() {
		if(s1 == s2) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are NOT equal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}
	}
}


public class StringConstantPool {
	
	public static void main(String[] args) {
		StringPoolTest sp = new StringPoolTest("hello", "hello");
		sp.compareSimilarity();
		
		StringPoolTest sp2 = new StringPoolTest("hello", new String("hello"));
		sp2.compareSimilarity();
		
		StringPoolTest sp3 = new StringPoolTest("hella", new String("hello"));
		sp3.compareSimilarity();
		
		StringPoolTest sp4 = new StringPoolTest("hella", "hello");
		sp4.compareSimilarity();
		
		String s3 = "hello";
		String s4 = s3;
		if(s3 == s4) {
			System.out.println("References are equal");
		} else {
			System.out.println("References are NOT equal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}
		
	}

}
