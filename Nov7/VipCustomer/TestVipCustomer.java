public class TestVipCustomer {
	public static void main(String[] args) {
		VipCustomer c1 = new VipCustomer();
		VipCustomer c2 = new VipCustomer("Carey Price", "cprice@email.com");
		VipCustomer c3 = new VipCustomer("Valerie Plant", 66000, "vplant@montreal.com");
		VipCustomer c4 = new VipCustomer();


		System.out.println(c1.getName());
		System.out.println(c1.getEmailAddress());
		System.out.println(c1.getCreditLimit());
		System.out.println();

		System.out.println(c2.getName());
		System.out.println(c2.getEmailAddress());
		System.out.println(c2.getCreditLimit());
		System.out.println();

		System.out.println(c3.getName());
		System.out.println(c3.getEmailAddress());
		System.out.println(c3.getCreditLimit());
		System.out.println();

		System.out.println(c4.getName());
		System.out.println(c4.getEmailAddress());
		System.out.println(c4.getCreditLimit());
		System.out.println();

		System.out.println("Number of customer: " + VipCustomer.getCount());
	}
}