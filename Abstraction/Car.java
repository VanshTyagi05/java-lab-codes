public class Car extends Vehicle  {
  private String model;
  private String company;
  public Car() {
    super(); // using super is necessary because  Vehicle class has a constructor with parameters of type int, int, String
    this.model = "";
    this.company = "";
  }
  public void getSetGo() {
    // agr parent classabstract method ko define na kre toh bachhe kr skta hai 
    System.out.println("Get Set Go");
  }
  public Car(int wheels, int speed, String color, String model, String company) {
    super(wheels, speed, color);
    this.model = model;
    this.company = company;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }
  @Override
  protected void startingSound() {
    // defining this function is necessary because this is abstract method of the parent class  
    System.out.println("Starting sound of car");
  }
  public static void main(String[] args) {
    Car car = new Car(4, 200, "Red", "Audi", "Audi");
    System.out.println("Wheels: " + car.getWheels());
    System.out.println("Speed: " + car.getSpeed());
    System.out.println("Color: " + car.getColor());
    System.out.println("Model: " + car.getModel());
    System.out.println("Company: " + car.getCompany());
    car.startingSound();
  }
}
