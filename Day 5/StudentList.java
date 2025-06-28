import java.util.*;
class StudentList {
  public static void main(String[] a) {
    ArrayList<String> students = new ArrayList<>();
    students.add("Alice");
    students.add("Bob");
    students.add("Charlie");
    Iterator<String> it = students.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
