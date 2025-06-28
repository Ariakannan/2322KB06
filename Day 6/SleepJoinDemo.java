class SleepJoinDemo extends Thread {
  public void run() {
    for(int i=1; i<=3; i++){
      System.out.println(getName() + " running " + i);
      try { Thread.sleep(500); } catch (InterruptedException e) {}
    }
  }
  public static void main(String[] a) throws InterruptedException {
    SleepJoinDemo t1 = new SleepJoinDemo();
    SleepJoinDemo t2 = new SleepJoinDemo();
    t1.start();
    t1.join();  // wait for t1 to finish before starting t2
    t2.start();
  }
}
