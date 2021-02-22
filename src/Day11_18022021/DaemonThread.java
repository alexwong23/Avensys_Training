package Day11_18022021;

class PrintThread extends Thread {
	String threadName;
	Thread t;
	String message;
	
	public PrintThread(String threadName, String message) {
		this.threadName = threadName;
		this.message = message;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(this.threadName + " says " + this.message);
		}		
		
	}
	
	public void start() {
		if(t == null) {
			t = new Thread(this, threadName);
			if(threadName.equals("daemon")) {
				t.setDaemon(true);
				t.setPriority(10);
			}
			t.start();
		}
	}
	
}

public class DaemonThread {
	public static void main(String[] args) {
		PrintThread pt1 = new PrintThread("Thread 1", "hello");
		PrintThread pt2 = new PrintThread("daemon", "garbage collector");
		PrintThread pt3 = new PrintThread("Thread 2", "world");
		try {
			pt1.start();
			pt2.start();
			pt3.start();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
