package ClassesAndObjects;

public class StringClass {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    String s4 = new String("Hello");
    System.out.println(s1 == s2); // true
    System.out.println(s1 == s3); // false

    System.out.println(s3 == s4); // false
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // true
    System.out.println(s3.equals(s4)); // true
    // because String class is a special class in Java
    // and it has a special memory allocation mechanism
    // which is called String Constant Pool
    // when we create a string using double quotes  "Hello"
    // it first checks if the string is already present in the pool
    // if it is present, it returns the reference of that string
    // if it is not present, it creates a new string in the pool
    // and returns the reference of that string
    // when we create a string using new keyword, it creates a new string
    // in the heap memory
    // so, s1 and s2 will have the same reference
    // s3 and s4 will have different references
  }
}
