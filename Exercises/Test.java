public class Test {
  public static void main(String[] args) {
    new Person().printPerson();
    new Student().printPerson();
  }
}
class Student extends Person {
  // @Override
  // public String getInfo() {
  //   return "Student";
  // }
  private String getInfo() {
    return "Student";
  }
}
class Person {
  // public String getInfo() {
  //   return "Person";
  // }
  private String getInfo() {
    return "Person";
  }
  public void printPerson() {
    System.out.println(getInfo());
  }
}