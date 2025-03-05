public class Stringclass {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";
    
    System.out.printf("%s %s\n", s1, s2);
    StringBuilder sb = new StringBuilder("Hey Everyone ");
    sb.append(s1);
    sb.append(" ");
    sb.append(s2);
    // sb is the object so we have to convert it  to string and return the string representation of the object itself as a string string instead of the object itself
    System.out.println(sb.toString());
  }
}
