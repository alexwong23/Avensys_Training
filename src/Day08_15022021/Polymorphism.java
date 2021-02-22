package Day08_15022021;

abstract class Bird {
	abstract void fly();
	
	abstract void eat();
}

abstract class Eagle extends Bird {
	void fly() {
		System.out.println("Eagle flies above clouds");
	}
	
	abstract void eat();
	
	void endangered() {
		System.out.println("Eagles are endangered birds");
	}
}

abstract class Sparrow extends Bird {
	void fly() {
		System.out.println("Sparrow flies low");
	}
	
	abstract void eat();
	
	void endangered() {
		System.out.println("Sparrows are not endangered birds");
	}
}

class LandEagle extends Eagle {
	void eat() {
		System.out.println("Land Eagle hunts rabbits");
	}
}

class SeaEagle extends Eagle {
	void eat() {
		System.out.println("Sea Eagle hunts fish");
	}
}

class AliveSparrow extends Sparrow {
	void eat() {
		System.out.println("Alive sparrow hunts worms");
	}
}

class DeadSparrow extends Sparrow {
	void eat() {
		System.out.println("Dead sparrow is dead");
	}
}

class Sky {
	static void permit(Bird b) {
		b.fly();
		b.eat();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Bird le = new LandEagle();
		Bird se = new SeaEagle();
		Bird as = new AliveSparrow();
		Bird ds = new DeadSparrow();
		Sky.permit(le);
		Sky.permit(se);
		Sky.permit(as);
		Sky.permit(ds);
		
		// cannot use Bird parent class
		Eagle ee = new LandEagle();
		ee.endangered();
		Sparrow ss = new DeadSparrow();
		ss.endangered();
	}
}
