public abstract class Bird implements Flyable {
  private String name;
  private String color;
  private int age;
  private String type;
  
  
  public void fly() {
    System.out.println("Bird is flying");
  }
  public static void main(String[] args) {
    Bird bird = new Bird() {
    };
    bird.fly();
  }
}
