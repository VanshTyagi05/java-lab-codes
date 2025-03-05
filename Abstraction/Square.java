import java.util.Scanner;

public class Square extends Shape{
  private int side;
  public Square(int side) {
    this.side = side;
  }
  public int calculateArea() {
    return side * side;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the side of square: ");
    int side = scanner.nextInt();
    Square square = new Square(side);
    System.out.println(square.calculateArea());
    scanner.close();
  }
  
}
