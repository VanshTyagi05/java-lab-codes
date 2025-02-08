import java.util.Scanner;
public class calculatorClass {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }
  
  public static int multiply(int a, int b) {
    return a * b;
  }
  public static int divide(int a, int b) {
    return a / b;
  }
  public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in)
    System.out.print("enter the first number:");
    a=sc.nextInt();
    System.out.println("enter the second number:");
    b=sc.nextInt();
    int add=sum(a,b);
    System.out.println("%d is additon"+add);
    int sub=subtract(a,b);
    System.out.println("%d is subtract"+sub);
    int div=divide(a,b);
    System.out.println("% is division"+divide(add, sub);
    int mul=
  }
}
