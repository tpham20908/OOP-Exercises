public class Employee extends Person {
  private String company;
  private double salary;
  
  public Employee(String firstName, String lastName, String company, double salary) {
    super(firstName, lastName);
    this.company = company;
    this.salary = salary;
  }
  
  public void print() {
    super.print();
    System.out.println("Company: " + company);
    System.out.println("Salary: " + salary);
  }
}