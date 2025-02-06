import java.util.Scanner;

public class printnumbers {
  public static void print(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    print(n);
  }
}
