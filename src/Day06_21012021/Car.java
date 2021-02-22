package Day06_21012021;

public class Car {
	private String insNo;
	private int chasisNo;
	
	public Car(String insNo, int chasisNo) {
		this.insNo = insNo;
		this.chasisNo = chasisNo;
	}
	
	public String getInsNo() {
		return this.insNo;
	}
	
	public int getChasisNo() {
		return this.chasisNo;
	}
	
	public void setInsNo(String insNo) {
		this.insNo = insNo;
	}
	
	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}
	
	public String toString() {
		return "Car insurance no: " + this.insNo + ", chasis no: " + this.chasisNo;
	}
	
	
	public static void main(String[] args) {
		Car c = new Car("1234", 22);
		
		System.out.println(c);
		System.out.println(c.getInsNo());
		System.out.println(c.getChasisNo());
		c.setInsNo("9876");
		c.setChasisNo(99);
		System.out.println(c);
		
		System.out.println("End of program");
	}
}
