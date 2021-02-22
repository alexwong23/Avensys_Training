package Day10_17022021;

import java.util.Scanner;

class BankException extends Exception {
	private final int code;
	public BankException(int code) {
		super();
		this.code = code;
	}
	
	public BankException(String message, int code) {
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}

class UnderAgeException extends Exception {
	private final int code;
	public UnderAgeException(int code) {
		super();
		this.code = code;
	}
	
	public UnderAgeException(String message, int code) {
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}

class OverAgeException extends Exception {
	private final int code;
	public OverAgeException(int code) {
		super();
		this.code = code;
	}
	
	public OverAgeException(String message, int code) {
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}

class Bank {
	private String accNo;
	private String password;
	
	public Bank() {
		this.accNo = "1111";
		this.password = "1234";
	}
	
	public boolean validateAcc(String accNo, String password, int age) throws BankException,
																	UnderAgeException, OverAgeException {
		if(!(this.accNo.equals(accNo) && this.password.equals(password))) {
			throw new BankException("Bank found an invalid accNo or password", 4444);
		} else if(age < 18) {
			throw new UnderAgeException("Bank found the person to be underage", 4555);
		} else if(age > 65) {
			throw new OverAgeException("Bank found the person to be over-age", 4666);
		} else {
			return true;
		}
	}
}

class ATM extends Bank {
	
	private String ATMNumber;
	private int cash = 1000;
	
	public ATM(String ATMNumber) {
		super();
		this.ATMNumber = ATMNumber;
		this.cash = 1000;
	}
	
	public void withdraw(String accNo, String password, int age) throws Throwable {
		try {
			if(super.validateAcc(accNo, password, age)) {
				System.out.println("Success! You can withdraw $" + this.cash);
			}			
		} catch(Exception e) {
			System.out.println("Found error at ATM #" + this.ATMNumber);
			throw e;
		}
	}
}

public class BankATM {
	
	public static void userInput(ATM atm) throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bank acc no: ");
		String accNo = sc.next();
		System.out.print("Password: ");
		String password = sc.next();
		System.out.print("Age: ");
		int age = sc.nextInt();
		atm.withdraw(accNo, password, age);
		sc.close();
	}
	
	
	public static void main(String[] args) throws Throwable {
		System.out.println("Start program");
		
		ATM atm1 = new ATM("0001");
		ATM atm2 = new ATM("0002");
		ATM atm3 = new ATM("0003");
		
		try {
			System.out.println("First attempt");
			userInput(atm1);
		} catch(Exception e) {
			System.out.println("At main program");
			System.out.println(e);
			try {
				System.out.println("Second attempt");
				userInput(atm2);
			} catch(Exception f) {
				System.out.println("At main program");
				System.out.println(f);
				try {
					System.out.println("Last attempt");
					userInput(atm3);
				} catch(Exception g) {
					System.out.println("At main program");
					System.out.println(g);
					System.out.println("Account Locked!");
				}
			}
		}
		
		System.out.println("Close program");
	}
}
