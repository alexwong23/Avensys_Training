package Day1_14012021;

public class StudentInfo {
	
	private int identificationNumber;
	private String name;
	private int age;
	
	public StudentInfo() {}
	
	public StudentInfo(int identificationNumber, String name) {
		this.identificationNumber = identificationNumber;
		this.name = name;
	}
	
	public StudentInfo(int identificationNumber, String name, int age) {
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.age = age;
	}
	
	public int getIdentificationNumber() {
		return this.identificationNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInformation() {
//		System.out.printf("Identification Number: %d\nName: %s\nAge: %d\n", this.identificationNumber, this.name, this.age);
		System.out.println("Identification Number: " + this.identificationNumber);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
	
	public static void main(String[] args) {
		StudentInfo studentA = new StudentInfo(1234, "Alex");
		StudentInfo studentB = new StudentInfo(1235, "Jen", 23);
		studentA.displayInformation();
		studentB.displayInformation();
		studentA.setAge(30);
		studentA.displayInformation();
	}
}
