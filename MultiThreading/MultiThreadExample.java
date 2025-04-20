package MultiThreading;

public class MultiThreadExample {  
  public static void main(String[] args) {  
    PrintTask p1 = new PrintTask('*');

    PrintTask2 p2 = new PrintTask2();
    Thread t1 = new Thread(p1);
    t1.start();
    Thread t2 = new Thread(p2);
    t2.start();
  }  
}  


