package Day09_16022021;

class StringBufferCapacity {
	
	private StringBuffer sb;
	private int occupies; 
	
	public StringBufferCapacity() {
		this.sb = new StringBuffer();
		this.occupies = 0;
	}
	
	public void addString(String s) {
		sb.append(s);
		this.occupies += s.length();
		System.out.println(s + " is of length " + s.length());
	}
	
	public String toString() {
		return "StringBuffer contains " + sb +
				" which occupies space of " + occupies +
				" and has capacity of " + sb.capacity();
	}
}

class StringBuilderCapacity {
	
	private StringBuilder sb;
	private int occupies; 
	
	public StringBuilderCapacity() {
		this.sb = new StringBuilder();
		this.occupies = 0;
	}
	
	public void addString(String s) {
		sb.append(s);
		this.occupies += s.length();
		System.out.println(s + " is of length " + s.length());
	}
	
	public String toString() {
		return "StringBuilder contains " + sb +
				" which occupies space of " + occupies +
				" and has capacity of " + sb.capacity();
	}
}

public class StringCapacity {
	public static void main(String[] args) {
		StringBufferCapacity sbc = new StringBufferCapacity();
		
		System.out.println(sbc);
		
		sbc.addString("Hello");
		System.out.println(sbc);
		
		sbc.addString("java is my fav language");
		System.out.println(sbc);
		
		sbc.addString("String");
		System.out.println(sbc);
		
		sbc.addString("!");
		System.out.println(sbc);
		
		StringBuilderCapacity sbd = new StringBuilderCapacity();
		
		System.out.println(sbd);
		
		sbd.addString("Hello");
		System.out.println(sbd);
		
		sbd.addString("java is my fav language");
		System.out.println(sbd);
		
		sbd.addString("String");
		System.out.println(sbd);
		
		sbd.addString("!");
		System.out.println(sbd);
	}
}

