import java.util.Scanner;
// *****
// ***** 
// *****
// *****
public class pattern1 {
  public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter a number: ");
    n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
  
  }
}
}
