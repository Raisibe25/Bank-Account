package test;

import Bank.BankAccount;

public class Main {
    public static void Main (String[] args) {

        BankAccount account = new BankAccount("2136789", 250);

        account.deposit(300);

        account.withdraw(150);

        account.withdraw(100, "Payment to R Mothiba");

        account.withdraw(2500);

        System.out.println("Available Balance: " + account.checkBalance());
    }
}
