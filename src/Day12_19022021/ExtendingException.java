package Day12_19022021;

class Base extends Exception {}
class Derived extends Base {}
public class ExtendingException {
	public static void main(String[] args) {
		try {
			throw new Derived();
		} catch(Base b) {
			System.out.println("Caught base class exception");
		}
		// unreachable catch block
//		} catch(Derived d) {
//			System.out.println("Caught derived class exception");	
//		}
	}
}