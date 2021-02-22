package Day09_16022021;

public class First_C {
	public void myMethod() {
		System.out.println("Method");
	}
	
	// 2) execute when object is created
	{
		System.out.println("Instance Block");	
	}
	
	// 3) execute after instance block
	//             and when object created
	public void First_C() {
		System.out.println("Constructor");
	}
	
	// 1) execute when class loaded by JVM
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		First_C m = new First_C();
		m.First_C();
		m.myMethod();
	}
}
