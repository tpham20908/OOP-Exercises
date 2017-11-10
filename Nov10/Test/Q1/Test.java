public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("sfk", "sljfi", 234244);

		System.out.println(Student.count);

		Employee e1 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e2 = new Employee("iwef", "fjawoei", 34567889);

		System.out.println(Employee.count);

		System.out.println(s1.getName());
		System.out.println(e1.getName());

		swap(s1, e1);

		System.out.println(s1.getName());
		System.out.println(e1.getName());
	}

	public static void swap(Student s, Employee e) {
		String tempName = s.getName();
		String tempAdd = s.getAddress();
		int tempPhone = s.getPhone();

		s.setName(e.getName());
		s.setAddress(e.getAddress());
		s.setPhone(e.getPhone());

		e.setName(tempName);
		e.setAddress(tempAdd);
		e.setPhone(tempPhone);
	}
}