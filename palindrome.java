public class palindrome {
  public static void main(String[] args) {
    int num = 121;
    int originalNum = num;
    int rev = 0;
    
     
    while (num != 0) {
      int digit = num % 10;
      rev = rev * 10 + digit;
      num /= 10;
    }
    
    if (originalNum == rev) {
      System.out.println(originalNum + " is a palindrome number");
    } else {
      System.out.println(originalNum + " is not a palindrome number");
    }
  }
}
