package Core_Java.OOPS.Encapsulation;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(String accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "Rs deposited successfully...");
        } else {
            System.out.println("Deposit failed: Amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (balance > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "Rs widraw successfully...");
        } else
            System.out.println("You dont have sufficient balance");

    }

    public void showBalance() {
        System.out.println("Your current balance is:" + balance);
    }
}
