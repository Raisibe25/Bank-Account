package Bank;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount (String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public boolean withdraw(double amount){
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
            return true;
        }
    }
    public boolean withdraw(double amount, String message) {
        boolean success = withdraw(amount);
        if (success) {
            System.out.println(message);
        }
        return success;
    }
    public double checkBalance() {
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
}
