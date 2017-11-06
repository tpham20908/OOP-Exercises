package javaapplication7;

/**
 *
 * @author 1796137
 */
public class Person {
  String name = "Lorem Ipsum";
  String address = "21275 Lakeshore Road, Sainte Anne De Bellevue, Montreal , QC.";
  public static void main(){
    
  }
}

class Employee extends Person{
  String company = "ABC";
  double salary = 85800;
  public static void main(String[] args){
    Employee e = new Employee();
    System.out.println(e.name);
    System.out.println(e.address);
    System.out.println(e.company);
    System.out.println(e.salary);
  }
}

class Student extends Person{
  String school = "JAC";
  public static void main(String[] args){
    Student s = new Student();
    System.out.println(s.name);
    System.out.println(s.address);
    System.out.println(s.school);
  }
}
