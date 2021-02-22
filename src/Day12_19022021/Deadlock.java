package Day12_19022021;


class DeadlockThread extends Thread {
	Thread t;
	String threadName;
	
	String res1 = "Java Resource";
	String res2 = "Cobol Resource";
	String res3 = "HTML Resource";
	
	public DeadlockThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("alex")) {
				alexCollectResource();	
			} else if(Thread.currentThread().getName().equals("derek")) {
				derekCollectResource();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		System.out.println("Starting thread " + threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	void alexCollectResource() throws Exception {
		synchronized(res1) {
			System.out.println("Alex has collected " + res1);
			Thread.sleep(2000);
			synchronized(res2) {
				System.out.println("Alex has collected " + res2);
				Thread.sleep(2000);
				synchronized(res3) {
					System.out.println("Alex has collected " + res3);
					Thread.sleep(2000);
				}
			}
		}
	}
	
	void derekCollectResource() throws Exception {
		synchronized(res3) {
			System.out.println("Derek has collected " + res1);
			Thread.sleep(2000);
			synchronized(res2) {
				System.out.println("Derek has collected " + res2);
				Thread.sleep(2000);
				synchronized(res1) {
					System.out.println("Derek has collected " + res3);
					Thread.sleep(2000);
				}
			}
		}
	}
	
}

public class Deadlock {
	
	public static void main(String[] args) {
		DeadlockThread thread_alex = new DeadlockThread("alex");
		DeadlockThread thread_derek = new DeadlockThread("derek");
		
		thread_alex.start();
		thread_derek.start();
	}

}
