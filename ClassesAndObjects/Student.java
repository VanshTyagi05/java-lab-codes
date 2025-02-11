package ClassesAndObjects;



 class StudentDetails {
  private String sname;
  private int sroll;
  private String sbranch;

  public StudentDetails(String name, int roll, String branch) {
    this.sname = name;
    this.sroll = roll;
    this.sbranch = branch;
  }

  public void display() {
    System.out.println("Name: " + sname);
    System.out.println("Roll: " + sroll);
    System.out.println("Branch: " + sbranch);
  }


};

public class Student {
  public static void main(String[] args) {
    StudentDetails s1 = new StudentDetails("John", 2, "CSE");
//     Student Name: Chandan Kumar
// Branch: Computer Science 
// Roll Number: 2355003
StudentDetails s2 = new StudentDetails("Chandan Kumar", 2355003, "Computer Science");

    s2.display();
  }
}
