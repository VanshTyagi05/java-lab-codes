package ClassesAndObjects;
 class patient{
  private String pname;
  private int page;
  private String occupation;
  private int totalBill;

  public void patientDetails(String name, int age, String branch) {
    this.pname = name;
    this.page = age;
    this.occupation = branch;
    this.totalBill =0; // initally the bill is zero;
  }

  public void showPatient() {
    System.out.println("Name: " + pname);
    System.out.println("pateint's age: " + page);
    System.out.println("Occupation: " + occupation);
  }

  
  public boolean Bloodneed(int currBlood) {
    return currBlood <5;
  }
  public void Treatment(String Disease) {
    if (Disease == "Covid") {
      this.totalBill += 5000;
      System.out.println("Treatment: 5000");
    }
    // add more diseases 
    else if (Disease.equals("Flu")) {
      this.totalBill += 2000;
      System.out.println("Treatment: 2000");
    } else if (Disease.equals("Fracture")) {
      this.totalBill += 8000;
      System.out.println("Treatment: 8000");
    } else if (Disease.equals("Surgery")) {
      this.totalBill += 15000;
      System.out.println("Treatment: 15000");
    }

  }
  public void Discount() {
    int age=this.page;
  if (age >= 60) {  // senior citizens
    this.totalBill = (int)(this.totalBill * 0.8);  // 20% discount
    System.out.println("Senior Citizen Discount: 20%");
  } else if (age >= 45) {  // middle aged
    this.totalBill = (int)(this.totalBill * 0.9);  // 10% discount
    System.out.println("Middle Age Discount: 10%");
  } else if (age <= 12) {  // children
    this.totalBill = (int)(this.totalBill * 0.85);  // 15% discount
    System.out.println("Child Discount: 15%");
  } else {  // adults
    this.totalBill = (int)(this.totalBill * 0.95);  // 5% discount
    System.out.println("Regular Discount: 5%");
  }
  }
  public void showBill() {
    System.out.println("totla bill: " + totalBill);
  }


 }
public class Hospital {
  public static void main(String[] args) {
    

    patient p1 = new patient();
    p1.patientDetails("John", 12, "CSE");
    p1.showPatient();
    p1.Treatment("Covid");
    p1.Discount();
    p1.showBill();

  }
}
