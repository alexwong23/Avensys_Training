package Day11_18022021;


// PROGRAM: Multithreading with shared resource 

class PrintDemo {
	private int i = 10;
	
	
	public void printCount(Thread t, String threadName) {
		try {
			while(i > 0) {
				this.notify();
				System.out.println("-------------------------------------------");
				System.out.println("Thread " + threadName + ": Counter --- " + i);
				i--;
			    // Let the thread sleep for a while.
				System.out.println("Thread " + threadName + " will go to sleep");
				System.out.println("-------------------------------------------");
				this.wait();
			}
			
			// wake all other threads
			this.notifyAll();
		} catch(Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo PD;
	
	public ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		PD = pd;
	}
	
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Thread priority: " + Thread.currentThread().getPriority());
		
		System.out.println("Thread " + threadName + " running");
		
		synchronized(PD) {
			PD.printCount(this.t, threadName);
		}
		
		System.out.println("Thread " + threadName + " exiting");
	}
	
	public void start() {
		System.out.println("Starting " + threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class MultithreadingSynchronized {
	public static void main(String[] args) {
		System.out.println("Start of program");
		
		PrintDemo PD = new PrintDemo();
		
		ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
		ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);
		
		T1.start();
		T2.start();
		
		// wait for threads to end
		try {
			T1.join();
			T2.join();
			System.out.println("End of program");
		} catch(Exception e) {
			System.out.println("Interrupted");
		} finally {
			
		}
		
	}
	

}
