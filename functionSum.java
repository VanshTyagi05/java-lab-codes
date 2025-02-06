import java.util.Scanner;

public class functionSum {
  public static int sum(int a, int b) {
    return a + b;
  }
  public static void main(String[] args) {
     // enter two numbers
     int a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number 1");
     a=sc.nextInt();
     System.out.println("Enter the number 2");
     b=sc.nextInt();
     int ans=sum(a,b);

     System.out.println("THe sum is " +ans);
  }
}
