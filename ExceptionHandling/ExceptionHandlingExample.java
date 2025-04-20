public class ExceptionHandlingExample {  
  public static void main(String[] args) {  
      int x[] = {3, 2, 1, 0};  
      try {  
          int y = x[0] / x[3]; // This line will throw an exception  
          System.out.println("Result: " + y);  
      } catch (ArithmeticException e) {  
          System.out.println("Cannot divide by zero: " + e.getMessage());  
      } catch (ArrayIndexOutOfBoundsException e) {  
          System.out.println("Array index is out of bounds: " + e.getMessage());  
      }  
  }  
}  