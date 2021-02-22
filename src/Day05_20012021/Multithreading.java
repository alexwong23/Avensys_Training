package Day05_20012021;

// Runnable interface should be implemented by class whose instances are executed by the thread
public class Multithreading implements Runnable {

	// mandatory to override run method
	@Override
    public void run() {
    }
	
	public static void main(String[] args) {
		MyThread guruThread1 = new MyThread("Guru1");
		MyThread guruThread2 = new MyThread("Guru2");
        guruThread1.start();
        guruThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(guruThread1.getName());
        System.out.println(guruThread2.getName());
        
        // going to wait till both threads are dead
        while(guruThread1.isAlive() || guruThread2.isAlive()) {}
        System.out.println("End of program");
    }
    
}

class MyThread implements Runnable {
	private Thread t;
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread " + this.name + " is running");
		for(int i = 0; i < 4; i++) {
			System.out.println("Thread " + this.name + " prints " + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}
		System.out.println("Thread " + this.name + " is exiting");
	}
	
	public void start() {
		System.out.println("Thread " + this.name + " started");
		if(this.t == null) {
			this.t = new Thread(this, this.name);
			this.t.start();
		}
	}
	
	public boolean isAlive() {
		return this.t.isAlive();
	}
	
}
