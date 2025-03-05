package Polymorphism;

public class Calculator {
  // overloadig all explmples
  private int add(int a, int b) {
    return a + b;
  }

  private int add(int a, int b, int c) {
    return a + b + c;
  }


  private int add(double a, double b,double c){
    return (int)(a +b+c);
  }
  private double add(int a,int b,int c,int d){
    return (double)(a+b+c+d);
  }
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(2, 3));
    System.out.println(calculator.add(2, 3, 4));
    System.out.println(calculator.add(2.5, 3.5,6.9));
    System.out.println(calculator.add(2,3,4,5));
  }
}
