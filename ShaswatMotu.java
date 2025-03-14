class test{
  int data=0;
  test(){
    data++;
  }
}

public class ShaswatMotu {
  public static void main(String[] args) {
    test t=new test();
    test t1=new test();
    test t2=new test();
    System.out.println(t2.data);
  }
}
