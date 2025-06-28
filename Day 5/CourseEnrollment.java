import java.util.*;
class CourseEnrollment {
  ArrayList<String> students = new ArrayList<>();
  HashMap<String, ArrayList<String>> courses = new HashMap<>();

  void addStudent(String student) {
    if(!students.contains(student)) {
      students.add(student);
      courses.put(student, new ArrayList<>());
    }
  }

  void removeStudent(String student) {
    students.remove(student);
    courses.remove(student);
  }

  void addCourse(String student, String course) {
    if(courses.containsKey(student))
      courses.get(student).add(course);
  }

  void removeCourse(String student, String course) {
    if(courses.containsKey(student))
      courses.get(student).remove(course);
  }

  void display() {
    Iterator<String> it = students.iterator();
    while(it.hasNext()) {
      String student = it.next();
      System.out.println(student + " : " + courses.get(student));
    }
  }

  public static void main(String[] a) {
    CourseEnrollment ce = new CourseEnrollment();
    ce.addStudent("Alice");
    ce.addStudent("Bob");
    ce.addCourse("Alice", "Math");
    ce.addCourse("Alice", "Science");
    ce.addCourse("Bob", "English");
    ce.display();
  }
}
