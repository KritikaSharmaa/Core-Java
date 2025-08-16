package Core_Java.OOPS.Encapsulation;

public class Ques2 {
    public static void main(String[] args) {
        BankAccount b2 = new BankAccount("HSBC102103", "Aditi", 5000);
        b2.showBalance();
        b2.withdraw(500);
    }
}
