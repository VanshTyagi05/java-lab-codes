import java.util.Scanner;

public class oddEven {
  public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       n=sc.nextInt();
       if(n%2!=0){
        System.out.println("odd number");
       }else{
        System.out.println("even number");
       }
  }
}
