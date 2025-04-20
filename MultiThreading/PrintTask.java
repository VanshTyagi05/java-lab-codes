package MultiThreading;

public class PrintTask implements Runnable {
  @Override
  public void run() {
      // Print task
      for (int i = 1; i <= 26; i++) {
          System.out.printf("%d ", i);
      }
      System.out.printf("\n %s  task complete",
              Thread.currentThread().getName()
              );
  }

  private final char targetChar;

  public PrintTask(char targetChar) {
      this.targetChar = targetChar;
  }
}
