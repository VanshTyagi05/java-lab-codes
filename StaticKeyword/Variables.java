package StaticKeyword;
 class Test{
   static int a;
   static{
    System.out.println("Static block this is executed before the main function");
   }

 }
public class Variables {
  public static void main(String[] args) {
    Test.a = 10;
    System.out.println(Test.a);
  }
}
