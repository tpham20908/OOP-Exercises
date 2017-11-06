public class BankAccount {
	// instance variables
	private int acctNo;
	private double balance = 0.0;
	private String name, email, phone;

	public BankAccount(String name, int acctNo, String phone, String email) {
		this.name = name;
		this.acctNo = acctNo;
		this.phone = phone;
		this.email = email;
	}

	// // instance methods
	// public void setAcctNo(int acctNo) {
	// 	this.acctNo = acctNo;
	// }

	// public void setName(String name) {
	// 	this.name = name;
	// }

	// public void setEmail(String email) {
	// 	this.email = email;
	// }

	// public void setPhone(String phone) {
	// 	this.phone = phone;
	// }

	public int getAcctNo() {
		return this.acctNo;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhone() {
		return this.phone;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("You have deposited $" + amount);
	}

	public void withdraw(double amount) {
		System.out.println("You wanna withdraw $" + amount);

		if (amount > this.balance)
			System.out.println("The amount withdrawn must not exceed the balance.");
		else
		{
			this.balance -= amount;
			System.out.println("Your new balance is $" + this.balance);
		}
	}
}