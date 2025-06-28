class TicketBooking {
  int tickets = 5;

  synchronized void bookTicket(String user) {
    if(tickets > 0) {
      System.out.println(user + " is booking a ticket...");
      try { Thread.sleep(1000); } catch (InterruptedException e) {}
      tickets--;
      System.out.println(user + " booked successfully. Remaining: " + tickets);
    } else {
      System.out.println("Sorry " + user + ", tickets sold out.");
    }
  }
}

class UserThread extends Thread {
  TicketBooking booking;
  String user;
  UserThread(TicketBooking b, String u) {
    booking = b; user = u;
  }
  public void run() {
    booking.bookTicket(user);
  }
}

public class BookingMain {
  public static void main(String[] a) {
    TicketBooking booking = new TicketBooking();
    UserThread[] users = {
      new UserThread(booking, "User1"),
      new UserThread(booking, "User2"),
      new UserThread(booking, "User3"),
      new UserThread(booking, "User4"),
      new UserThread(booking, "User5"),
      new UserThread(booking, "User6"),
    };
    for(UserThread u : users) u.start();
  }
}
