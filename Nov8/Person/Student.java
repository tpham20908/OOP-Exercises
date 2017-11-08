public class Student extends Person {
  private String school;
  
  public Student(String firstName, String lastName, String school) {
    super(firstName, lastName);
    this.school = school;
  }
  
  public void print() {
    super.print();
    System.out.println("School: " + school);
  }
}