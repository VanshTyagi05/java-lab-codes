package Encapsulation;

public class OpenAccount {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("1234567890", "Alice", 1000);
    account.deposit(500);
    account.withdraw(200);
    account.withdraw(500);
    account.withdraw(1000);
  }
}
