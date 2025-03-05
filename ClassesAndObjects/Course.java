package ClassesAndObjects;

public class Course {
  
   String courseName;
  int enrolledStudents;
  static int maxCapacity = 10; // Set a default value
  String[] enrolled;

  Course(String name) {
      courseName = name;
      enrolledStudents = 0;
      enrolled = new String[maxCapacity]; // Now array will be created with proper size
  }
  static void setMaxCapacity(int maxCapacity){
    Course.maxCapacity = maxCapacity;
  }

  void enrollStudent(String name){
    if (enrolledStudents < maxCapacity) {
      System.out.println(name + " has been enrolled in " + courseName);
      enrolledStudents++;
      enrolled[enrolledStudents-1] = name;
    } else {
      System.out.println("Sorry, " + name + " could not be enrolled in " + courseName);
    }

  }

  void unenrollStudent(String name){
    if (enrolledStudents > 0) {
    
      boolean found = false;
      // find the student in array and remove it
      for (int i = 0; i < enrolledStudents; i++) {
        if (enrolled[i].equals(name)) {
          found = true;
          for (int j = i; j < enrolledStudents - 1; j++) {
            enrolled[j] = enrolled[j + 1];
          }
          break;
        }
      }
      if (!found) {
        System.out.println("Student not found in the course");
        return;
      }
      System.out.println(name + " has been unenrolled from " + courseName);
      enrolledStudents--;
    } else {
      System.out.println("Sorry, " + name + " could not be unenrolled from " + courseName);
    }
  }

  void display(){
    System.out.println("Course Name: " + courseName);
    System.out.println("Enrolled Students: " + enrolledStudents);
    System.out.println("Max Capacity: " + maxCapacity);
  }

   
  public static void main(String[] args) {
    Course c1 = new Course("Java");
    Course.setMaxCapacity(10);
    c1.enrollStudent("John");
    c1.enrollStudent("Doe");
    c1.enrollStudent("Jane");
    c1.display();
    c1.unenrollStudent("John");
    c1.unenrollStudent("John");
    c1.unenrollStudent("Doe");
    c1.display();
  }
}
