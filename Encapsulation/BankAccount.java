package Encapsulation;

public class BankAccount {
  private String accountNumber;
  private String accountHolder;
  private double balance;

  public BankAccount(String accountNumber, String accountHolder, double balance) {
    System.out.println("Account created successfully");
    
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.printf("Deposit successful of %f to %s", amount,accountNumber);
    System.out.printf("Balance left is %f", balance);
    System.out.println();
  }
    public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.printf("Withdrawal successful of %f from %s", amount,accountNumber);
      System.out.println();
    } else {
      System.out.printf("Insufficient balance to withdraw from %s, balance left is %f", accountNumber,balance);
    }
  }
}
