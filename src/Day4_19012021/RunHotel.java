package Day4_19012021;

import java.util.Scanner;

public class RunHotel {
	public static void printActions() {
		System.out.printf("\n======== ACTIONS ========\n");
		System.out.println("1: Show hotel items");
		System.out.println("2: Show all bills");
		System.out.println("3: Show my bill");			
		System.out.println("4: Purchase an item");
		System.out.println("5: Finish shopping");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hotel hm = new Hotel();
		System.out.println("Welcome to the Hotel!");
		
		// create the first customer
		Customer alex = new Customer("Alex", "alexwong@gmail.com");
		hm.addCustomer(alex);
		hm.transaction(alex, "coffee", 1);
		hm.transaction(alex, "toast", 1);
		hm.transaction(alex, "eggs", 3);
		hm.transaction(alex, "coffee", 1);
		
		// get customer information
		boolean customerInfoCorrect = false;
		String name = null;
		String email = null;
		while(!customerInfoCorrect) {
			try {
				System.out.print("Please enter your name: ");
				name = sc.nextLine().trim();
				System.out.print("Please enter your email: ");
				email = sc.nextLine().trim();
				
				// check if name and email provided correctly
				if(name.length() > 0 && email.length() > 0 && email.contains("@")) {
					customerInfoCorrect = true;
				} else {
					System.out.println("Invalid details provided. Please try again.");	
				}
			} catch(Exception e) {
				System.out.println("Error occurred: " + e);
				System.out.println("Invalid details provided. Please try again.");
			}
		}
		
		// create the new customer
		Customer test = new Customer(name, email);
		hm.addCustomer(test);
		
		// customer perform actions
		int input = 0;
		while(input != 5) {
			printActions();
			System.out.print("What would you like to do: ");
			try {
				input = sc.nextInt();
				switch(input) {
					case 1:
						hm.printAvailableGoods();
						break;
					case 2:
						hm.printAllBills();
						break;
					case 3:
						hm.printCustomerBill(test);
						break;
					case 4:
						hm.printAvailableGoods();
						
						// get goods
						String itemName = null;
						int quantity = 0;
						System.out.print("What would you like to order: ");
						itemName = sc.next().toLowerCase();
						System.out.print("How much would you like: ");
						quantity = sc.nextInt();
						
						// check if arguments valid
						if(hm.validGood(itemName) && quantity > 0) {
							System.out.println("Success: " + quantity + " " + itemName + " bought!");
							hm.transaction(test, itemName, quantity);
						} else {
							System.out.println("Invalid arguments provided. " + itemName + " was not added.");
							if(!hm.validGood(itemName)) {
								System.out.println(itemName + " is not a valid good.");
							}
							if(quantity <= 0) {
								System.out.println("Quantity must be positive.");
							}
						}
						break;
					case 5:
						System.out.println("Thank you for visiting, please come back again!");
						break;
					default:
						System.out.println("Invalid command: " + input);
						break;
				}
			} catch(Exception e) {
				System.out.println("Error occurred: " + e);
				sc.next(); // because nextInt does not consume new line
			}
		}
		
		sc.close();
		System.out.println("End of program");
		
	}
}
