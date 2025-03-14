package ExceptionHandling;

import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter the first number");
    a=sc.nextInt();
    System.out.println("Enter the second number");
    b=sc.nextInt();
     try {
      int ans=a/b;
      System.out.println("The division is "+ans);
     } catch (ArithmeticException e) {
     
      if(e.getMessage().equals("/ by zero")) {
       System.out.println("Division by zero is not possible");
      }else{
        throw e;
      }
     }
     finally{
      System.out.println("Finally block is always executed");
      sc.close();
     }
   }
}
