package Day10_17022021;

// tutorialspoint.com/how-to-rethrow-an-exception-in-java
public class ThrowException {
	public static void test1() throws Exception {
		System.out.println("Start test1() method");
		throw new Exception("thrown from test1() method");
	}
	
	public static void test2() throws Throwable {
		try {
			System.out.println("Start test2() method");
			test1();
		} catch(Exception e) {
			System.out.println("Inside test2() method");
			throw e;
		}
		
	}
	
	public static void main(String[] args) throws Throwable {
		try {
			System.out.println("Start main method");
			test2();
		} catch(Exception e) {
			System.out.println("Caught in main");
			System.out.println("Exception was " + e);
		}
	}
}
