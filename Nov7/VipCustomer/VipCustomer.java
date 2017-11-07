public class VipCustomer {
	private String name;
	private int creditLimit;
	private String emailAddress;

	private static int count = 0;

	public VipCustomer() {
		this("Lorem Ipsum", 75000, "myEmail@email.com");
	}

	public VipCustomer(String name, String emailAddress) {
		int creditLimit = 45000;
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		count++;
	}

	public VipCustomer(String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		count++;
	}

	public String getName() {
		return this.name;
	}

	public int getCreditLimit() {
		return this.creditLimit;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public static int getCount() {
		return count;
	}

}