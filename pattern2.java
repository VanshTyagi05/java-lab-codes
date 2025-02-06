import java.util.Scanner;
public class pattern2 {
  public static void main(String[] args) {
    int n;
    // take input from the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    n = scanner.nextInt();
    
    // print the pattern  
    for (int i = n; i >=0;i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    
    scanner.close(); // close the scanner to prevent resource leakage
  }
}
