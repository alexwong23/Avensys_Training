package Day08_15022021;

class Parent {
	protected String name;
	protected int age;
	protected String hairColour;
	
	public Parent() {
		this.name = "default";
		this.age = 0;
		this.hairColour = "default";
	}
	
	// constructor chaining
	public Parent (String name, int age, String hairColour) {
		this();
		this.name = name;
		this.age = age;
		this.hairColour = hairColour;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getHairColour() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}
	
	public String toString() {
		return "Person has name " + this.name + " and number " + this.age + " with hair colour " + this.hairColour; 
	}
}

class Child extends Parent {
	
	private String name;
	private int age;
	
	public Child() {
		super();
	}
	
	public Child (String name, int age, String hairColour) {
		super(name, age, hairColour);
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
	
	public String toParentString() {
		if(super.name.equals("default")) {
			return this.name + " has no parents!";
		} else {
			return this.name + "\'s parent, " + super.name + ", is " + super.age + " years old, with hair colour " + super.hairColour;	
		}		
	}
	
	public String toString() {
		return this.name + " is " + this.age + " years old, with hair colour " + this.hairColour;
	}
}

public class SuperInheritance {
	
	public static void main(String[] args) {
		Child a = new Child("Parent 1", 50, "Black");
		a.setName("Child 1");
		a.setAge(21);
		System.out.println(a);
		System.out.println(a.toParentString());
		
		Child b = new Child();
		b.setName("Child 2");
		b.setAge(24);
		System.out.println(b);
		System.out.println(b.toParentString());
	}

}

