package Day09_16022021;

public class IndexOfString {
	
	public static void main(String[] args) {
		String a = "hello i love java";
		System.out.println(a.indexOf("e") + " " +
							a.indexOf("a") + " " +
							a.lastIndexOf("l") + " " +
							a.lastIndexOf("v"));
		
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.delete(0, 2);
		System.out.println(sbf);				
	}

}
