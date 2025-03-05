package Polymorphism;

public class Car extends Vehicle {
  
  public void service(){
    // on servicing at  vehicle service center the car life will increase by 1 yr
    super.service(this);
  }
  public void service(Vehicle car){
    
    
     // on servicing at  car service center the car life will increase by 2 yr
    car.vehicleLifeLeft +=2;
  };
  public static void main(String[] args) {
    Car car = new Car();
    car.service();
    System.out.println(car.vehicleLifeLeft);
    car.service(car);
    System.out.println(car.vehicleLifeLeft);
   
  }
  
}
