public class Person {
  String firstName, lastName;
  
  public Person(String firstName, String lastName) {
    this.firstName = firstName.toUpperCase();
    this.lastName = lastName.toUpperCase();
  }

  public void print() {
    System.out.println("Last name: " + lastName + "\nFirst name: " + firstName);
  }
}