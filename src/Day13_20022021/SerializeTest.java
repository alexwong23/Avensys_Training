package Day13_20022021;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable, Externalizable {
	private String name;
	transient int age;
	private String password;
	
	public Person() {}
	
	public Person(String name, int age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		out.writeObject("cannot see password");
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.name = (String)in.readObject();
		this.age = (int)in.readInt();
		this.password = (String)in.readObject();
	}
	
	@Override
	public String toString() {
		return this.name + " is age " + this.age + " and has password " + this.password;
	}
}

public class SerializeTest {
	
	public static void Serialization(String directory, Person a) {
		String outputFileName = "personObject.txt";
		try {
			FileOutputStream fos = new FileOutputStream(directory + outputFileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(a);			// write serialized object
			System.out.println("Object serialized");
			
			oos.close();
			fos.close();
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("Files not found Exception in serialization");
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			System.out.println("Files not found Exception in serialization");
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Deserialization(String directory, Person b) {
		String inputFileName = "personObject.txt";
		try {
			FileInputStream fis = new FileInputStream(directory + inputFileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			b = (Person)ois.readObject();			// read deserialized object
			System.out.println("Object deserialized");
			System.out.println(b);
			
			ois.close();
			fis.close();
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("Files not found Exception in deserialization");
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			System.out.println("Files not found Exception in deserialization");
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Start program");
		
		String directory = "/Users/alex/eclipse-workspace/AvensysTraining/files/";
		
		Person a = new Person("Alex", 99, "secretshhh");
		Serialization(directory, a);
		
		// using externalizable overrides transient, so age 99 can be seen
		Person b = null;
		Deserialization(directory, b);
		
		System.out.println("End program");
	}
}
