class A implements Runnable {
  private int n;
  private int sum;
  private Thread t;
  
  A() {
    sum = 0;
    n = 100;
    t = new Thread(this, "Thread1");
    t.start();
  }
    
  public void run() {
    try {
      int i = 1;

      while(i <= n) {
        if (i % 2 != 0)
          sum += i;
        
        Thread.sleep(20);
        i++;
      }

      System.out.println("Sum of odd numbers = " + sum);
    }
    catch(InterruptedException e) {
      System.out.println(e);
    }
  }
}

class Main implements Runnable {
  private Thread t;

  Main() {
    t = new Thread(this, "Main");
    t.start();
  }

  public void run() {
    try {
      int i = 1, sum = 0;

      while(i <= 100) {
        if (i % 2 == 0)
          sum += i;
        
        Thread.sleep(20);
        i++;
      }

      System.out.println("Sum of even numbers = " + sum);
    }
    catch(InterruptedException e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    new A();
    new Main();
  }
}
