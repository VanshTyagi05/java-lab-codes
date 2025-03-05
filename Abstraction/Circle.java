public class Circle extends Shape{
  private int radius;
  public Circle(int radius) {
    this.radius = radius;
  }
  public int calculateArea() {
    return (22/7) * radius * radius;
  }
  public static void main(String[] args) {
    Circle circle = new Circle(7);
    System.out.println(circle.calculateArea());
  }

}
