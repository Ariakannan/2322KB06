import java.sql.*;
class ConnectDB {
  public static void main(String[] args) {
    try {
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/testdb", "root", "password");
      System.out.println("Connected!");
      con.close();
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
