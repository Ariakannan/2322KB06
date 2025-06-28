import java.util.*;
class UniqueEmails {
  public static void main(String[] a) {
    HashSet<String> emails = new HashSet<>();
    emails.add("a@example.com");
    emails.add("b@example.com");
    emails.add("a@example.com"); // duplicate
    for(String email : emails) System.out.println(email);
  }
}
