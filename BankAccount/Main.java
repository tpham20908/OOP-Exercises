public class Main {

	public static void main(String[] args) {
		BankAccount myAcc = new BankAccount();

		// myAcc.deposit(1230.5);
		// myAcc.setName("Lorem Ipsem");
		// myAcc.setEmail("myEmail@email.com");
		// myAcc.setPhone("514-123-4567");
		// myAcc.setName("Lorem Ipsem");
		// myAcc.withdraw(2105.17);

		System.out.println("Name:\t\t" + myAcc.getName());
		System.out.println("Email:\t\t" + myAcc.getEmail());
		System.out.println("Phone number:\t" + myAcc.getPhone());
		System.out.println("Balance:\t$" + myAcc.getBalance());
	}
}