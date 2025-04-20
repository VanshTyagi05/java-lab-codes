package MultiThreading;

public class PrintTask2 implements Runnable {
  @Override
  public void run() {
      // Print task
      // i have to print alphabets from a to z
      for (char i = 'a'; i <= 'z'; i++) {
          System.out.printf("%c ", i);
      }
      System.out.printf("\n %s  task complete",
              Thread.currentThread().getName());
  }

 
}
