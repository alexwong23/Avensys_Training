package Day06_21012021;

import java.util.HashMap;

public class runCafe {
	public static void main(String[] args) {
		Cafe cf = new Cafe();
		System.out.println("Welcome to the Cafe!");
		
		// create the first customer
		Customer alex = new Customer("Alex", "alexwong@gmail.com");
		cf.transaction(alex, "coffee", 1);
		cf.transaction(alex, "toast", 1);
		cf.transaction(alex, "eggs", 3);
		cf.transaction(alex, "coffee", 1);
		cf.delete(alex, "coffee");
		
		System.out.println("Done shopping!");
		
		Bill b = cf.getUnpaidCustomerBill(alex);
		for(HashMap.Entry<Item, Integer> entry: b.getItems().entrySet()) {
			System.out.printf("\t%s\t%d\t$%.2f\t\n", entry.getKey().getName(),
												entry.getValue(),
												entry.getKey().getPrice() * entry.getValue());
		}
		
		System.out.println("End of program");
	}

}
