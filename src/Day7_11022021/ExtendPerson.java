package Day7_11022021;

class Person {
	private String name;
	private int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person has name " + this.name + " and number " + this.age; 
	}
}

class Employee extends Person {
	
	private String company;
	
	public Employee(String name, int age, String company) {
		super(name, age);
		this.company = company;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String toString() {
		return getName() + " is " + getAge() + " years old and works at " + getCompany();
	}
}

public class ExtendPerson {
	
	public static void main(String[] args) {
		Employee a = new Employee("Test 1", 30, "avensys");
		Employee b = new Employee("Test 2", 40, "avensys");
		System.out.println(a);
		System.out.println(b);
	}

}
