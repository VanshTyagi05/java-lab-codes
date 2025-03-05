package Polymorphism;

class Singleton {
  private static Singleton instance;

  private Singleton() {
      System.out.println("Singleton Constructor Called");
  }

  public static Singleton getInstance() {
      if (instance == null) {
          instance = new Singleton();
      }
      return instance;
  }
  
  public void showMessage() {
      System.out.println("Hello from Singleton");
  }
}

class Test {
  public static void main(String[] args) {
      Singleton obj1 = Singleton.getInstance();
      Singleton obj2 = Singleton.getInstance();
      // Singleton obj3=new Singleton();  // this is not possible because ths constructor is private 
      // toh phir constructor call kaise ho rha ? 
      //  

      obj1.showMessage();
  }
}

