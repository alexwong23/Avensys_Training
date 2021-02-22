package Day08_15022021;

abstract class Plane {
	abstract void fly();
	
	abstract void goods();
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighter Plane flies at supersonic speed");
	}
	
	void goods() {
		System.out.println("Fighter Plane cannot transport goods");
	}
	
	void pilot() {
		System.out.println("Fighter Plane has one pilot");	
	}
}

class PassengerPlane extends Plane {
	void fly() {
		System.out.println("Passenger Plane flies at normal speed");
	}
	
	void goods() {
		System.out.println("Passenger Plane transports people");
	}
	
	void pilot() {
		System.out.println("Passenger Plane has two pilots");
	}
}

class CargoPlane extends Plane {
	void fly() {
		System.out.println("Cargo Plane flies slowly");
	}
	
	void goods() {
		System.out.println("Cargo Plane transports countless goods");
	}
	
	void pilot() {
		System.out.println("Cargo Plane has two sleepy pilots");
	}
}

class Flight {
	static void permit(Plane p) {
		p.fly();
		p.goods();
		// cannot call because plane does not have function
		// p.pilot();
	}
}

public class PolymorphismPlane {
	public static void main(String[] args) {
		Plane f = new FighterPlane();
		Plane p = new PassengerPlane();
		Plane c = new CargoPlane();
		Flight.permit(f);
		Flight.permit(p);
		Flight.permit(c);
	}
}
