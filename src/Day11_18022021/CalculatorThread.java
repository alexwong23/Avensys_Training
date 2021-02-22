package Day11_18022021;


class Calculator {
	int add(int a, int b) {
		return a + b;
	}
	
	int subtract(int a, int b) {
		return a - b;
	}
}

public class CalculatorThread extends Thread {
	private Thread t;
	private String threadName;
	Calculator C;
	private int a;
	private int b;
	
	public CalculatorThread(String name, Calculator c, int a, int b) {
		threadName = name;
		C = c;
		this.a = a;
		this.b = b;
	}
	
	public void run() {
		if (Thread.currentThread().getName() == "add") {
			System.out.println(threadName + " Result: " + C.add(this.a, this.b));
		} else if (Thread.currentThread().getName() == "subtract") {
			System.out.println(threadName + " Result: " + C.subtract(this.a, this.b));
		}
		
		System.out.println("Thread " + threadName + " exiting");
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.setName(threadName);
			t.start();
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start of program");
		
		Calculator c = new Calculator();
		
		CalculatorThread T1 = new CalculatorThread("add", c, 3, 4);
		CalculatorThread T2 = new CalculatorThread("subtract", c, 3, 4);
		
		T1.start();
		T2.start();
		
		// wait for threads to end
		try {
			T1.join();
			T2.join();
			System.out.println("End of program");
		} catch(Exception e) {
			System.out.println("Interrupted");
		}
	}

}
