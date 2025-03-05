
public abstract class Vehicle implements Transport {
  private int wheels;
  private int speed;
  private String color;
  protected abstract void startingSound();
 public Vehicle() {
    this.wheels = 0;
    this.speed = 0;
    this.color = "";
  }

  // @Override
  // public void getSetGo() {
  //   // TODO Auto-generated method stub
  //   if (wheels == 0 || speed == 0 || color == "") {
  //     System.out.println("Please set the wheels, speed and color of the vehicle");
  // }
  //   System.out.println("Get Set Go");
  // }

  public Vehicle(int wheels, int speed, String color) {
    this.wheels = wheels;
    this.speed = speed;
    this.color = color;
  }
  // getter and setter
  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  public static void main(String[] args) {
    
  }
}
