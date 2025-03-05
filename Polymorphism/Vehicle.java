package Polymorphism;

public class Vehicle {
  public int vehicleLifeLeft;
  Vehicle(){
    this.vehicleLifeLeft =0;
  }
  protected void service(Vehicle vehicle){
    // on servicing vehicle service the vehicle life will increase by 1 yr
 vehicleLifeLeft +=1;
  };
}
