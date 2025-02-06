import java.util.Scanner;
public class table {
  public static void main(String[] args){
    int n, i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sc.nextInt();
    for(i=1; i<=10; i++){
      System.out.printf("%d * %d = %d\n", n, i, n*i);
    }
    sc.close();
  }
}
