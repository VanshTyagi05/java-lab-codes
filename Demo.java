class Board{
  double x;
  Board(double x){
    this.x=x;
  }
void Display(){
  System.out.print("x="+x);
}
}
public class Demo {
  public static void main(String[] args) {
    Board b[] = new Board[5];
    b[0]=new Board(8.9);
    b[1]=new Board(9.8);
    b[2]=new Board(7.6);
    b[3]=new Board(6.5);
    b[4]=new Board(5.4);
    for(int i=0;i<5;i++){
      b[i].Display();
    }
    
    
  }
}
