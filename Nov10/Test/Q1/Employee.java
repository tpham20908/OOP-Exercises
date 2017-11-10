public class Employee {
	String name, add;
	int phone;
	public static int count = 0;

	public Employee() {
		name = "John Abbott";
		add = "Toronto";
		phone = 11222333;
		count++;
	}

	public Employee(String name, String add, int phone) {
		this.name = name;
		this.add = add;
		this.phone = phone;
		count++;
	}

	public void displayName() {
		System.out.println(name);
	}

	public void displayAddress() {
		System.out.println(add);
	}

	public void displayPhone() {
		System.out.println(phone);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String add) {
		this.add = add;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return add;
	}

	public int getPhone() {
		return phone;
	}

}