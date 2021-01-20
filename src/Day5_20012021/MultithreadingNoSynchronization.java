package Day5_20012021;

class CountDown {
	public void printCount() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Counter --- " + i);
			}
		} catch(Exception e) {
			System.out.println("Thread interrupted");
		}
	}
}

class CDThread extends Thread {
	private Thread t;
	private String name;
	CountDown CD;
	
	public CDThread(String name, CountDown CD) {
		this.name = name;
		this.CD = CD;
	}
	
	@Override
	public void run() {
		CD.printCount();
		System.out.println("Thread " + this.name + " exiting");
	}
	
	@Override
	public void start() {
		System.out.println("Thread " + this.name + " starting");
		if(t == null) {
			t = new Thread(this, this.name);
			t.start();
		}
	}
}

public class MultithreadingNoSynchronization {
	public static void main(String[] args) {
		CountDown CD = new CountDown();
		
		CDThread t1 = new CDThread("t1", CD);
		CDThread t2 = new CDThread("t2", CD);
		
		t1.start();
		t2.start();
		
		// wait for threads to end
		try {
			t1.join();
			t2.join();
		} catch(Exception e) {
			System.out.println("Interrupted");
		}
	}
}
