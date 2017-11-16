class TestPerson {
  public static void main(String[] args) {
    Person p = new Person("Denis Coderre", "Somewhere in Montreal");
    p.setAddress("Quebec city");
    System.out.println(p.toString());

    Student s = new Student("Weidhg Thrue", "Laval");
    s.addCourseGrade("Math", 90);
    s.addCourseGrade("Physic", 94);
    s.addCourseGrade("Chemic", 88);

    s.printGrades();

    System.out.println(s.getAverageGrade());
    System.out.println(s.toString());

    Teacher t = new Teacher("Alain Gaudet", "Chicoutimi");
    System.out.println(t.addCourse("Math1"));
    System.out.println(t.addCourse("Physic"));
    System.out.println(t.addCourse("Chemic"));
    System.out.println(t.addCourse("Math1"));
    System.out.println(t.addCourse("Math2"));
    System.out.println(t.addCourse("Math3"));
    System.out.println(t.removeCourse("Math3"));
    System.out.println(t.removeCourse("Math4"));

    System.out.println(t.toString());
  }
}