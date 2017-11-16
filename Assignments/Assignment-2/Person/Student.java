import java.util.ArrayList;

public class Student extends Person {
  private String name;
  private String address;
  private int numCourses = 0;
  private ArrayList<String> courses = new ArrayList<>();
  private ArrayList<Integer> grades = new ArrayList<>();

  public Student(String name, String address) {
    super(name, address);
  }

  public void addCourseGrade(String course, int grade) {
    courses.add(course);
    grades.add(grade);
  }

  public void printGrades() {
    String gradesStr = "Grades: ";
    for (int i = 0; i < grades.size(); i++) {
      gradesStr += grades.get(i) + " ";
    }
    System.out.println(gradesStr);
  }

  public double getAverageGrade() {
    int gradeTotal = 0;
    for (int grade : grades)
      gradeTotal += grade;
    return (double)gradeTotal / grades.size();
  }

  public String toString() {
    return "Student: " + super.toString();
  }
}