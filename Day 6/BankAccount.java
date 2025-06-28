class BankAccount {
  private int balance;
  BankAccount(int b) { balance = b; }

  public synchronized void withdraw(int amount) {
    String tName = Thread.currentThread().getName();
    if(balance >= amount) {
      System.out.println(tName + " is withdrawing " + amount);
      try { Thread.sleep(1000); } catch(InterruptedException e){}
      balance -= amount;
      System.out.println(tName + " completed. Balance: " + balance);
    } else {
      System.out.println(tName + ": Insufficient balance!");
    }
  }
}

class UserThread extends Thread {
  BankAccount account;
  int amount;
  UserThread(BankAccount acc, int amt) {
    account = acc; amount = amt;
  }
  public void run() {
    account.withdraw(amount);
  }
}

public class BankingApp {
  public static void main(String[] a) {
    BankAccount acc = new BankAccount(1000);
    UserThread u1 = new UserThread(acc, 700);
    UserThread u2 = new UserThread(acc, 500);
    UserThread u3 = new UserThread(acc, 300);
    u1.setName("User1");
    u2.setName("User2");
    u3.setName("User3");
    u1.start(); u2.start(); u3.start();
  }
}
