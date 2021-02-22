package Day12_19022021;

public class Sample extends Thread {
	public static void main(String[] args) {
		int array_variable[] = new int[10];
		for(int i = 0; i < 10; ++i) {
			array_variable[i] = i;
			System.out.print(array_variable[i] + " ");
			i++;
		}
		
		// not allowed arr[2]
//		int arr[2];
//		System.out.print(arr[0]);
//		System.out.print(arr[1]);
		
		try {
			int a = 0;
			System.out.print("a = " + a);
			int b = 20/a;
			System.out.print("b = " + b);
		} catch(ArithmeticException e) {
			System.out.print("Divide by zero error");
		} finally {
			System.out.print("inside the finally block");
		}
		
		Sample t = new Sample();
		t.start();
		System.out.print("one. ");
		// not allowed to start twice
//		t.start();
		System.out.print("two. ");
	}
	
	public void run() {
		System.out.print("Thread ");
	}
}
