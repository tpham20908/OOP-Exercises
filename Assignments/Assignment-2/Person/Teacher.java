import java.util.ArrayList;

public class Teacher extends Person {
  private String name;
  private String address;
  private int numCourses = 0;
  private ArrayList<String> courses = new ArrayList<>();

  public Teacher(String name, String address) {
    super(name, address);
  }

  public boolean addCourse(String course) {
    if (courses.contains(course)) {
      System.out.println(course + " is already added before.");
      return false;
    }
    else {
      courses.add(course);
      return true;
    }
  }

  public boolean removeCourse(String course) {
    if (courses.contains(course)) {
      courses.remove(course);
      return true;
    }
    else {
      System.out.println(course + " does not exist.");
      return false;
    }
  }

  public String toString() {
    return "Teacher: " + super.toString();
  }
}