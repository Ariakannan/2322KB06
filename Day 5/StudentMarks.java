import java.util.*;
class StudentMarks {
  public static void main(String[] a) {
    HashMap<String, Integer> marks = new HashMap<>();
    marks.put("Alice", 85);
    marks.put("Bob", 75);
    marks.put("Charlie", 95);

    int total = 0;
    for(int m : marks.values()) total += m;
    double avg = (double) total / marks.size();
    System.out.println("Average marks: " + avg);
  }
}
