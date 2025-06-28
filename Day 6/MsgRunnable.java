class MsgRunnable implements Runnable {
  String msg;
  MsgRunnable(String m) { msg=m; }
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": " + msg);
  }
  public static void main(String[] a) {
    Thread t1 = new Thread(new MsgRunnable("Hello"));
    Thread t2 = new Thread(new MsgRunnable("World"));
    t1.start(); t2.start();
  }
}
