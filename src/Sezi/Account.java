package Sezi;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private static final String bankName = "MyBank";
    private static int totalAccounts = 0;

    public String accountNumber;
    public List<String> accountHolders;
    public List<Double> transaction;

    public Account(String accountNumber, List<String> accountHolders) {
        this.accountNumber = accountNumber;
        this.accountHolders = new ArrayList<>(accountHolders);
        this.transaction = new ArrayList<>();
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public List<String> getAccountHolders(){
        return accountHolders;
    }

    public List<Double> getTransactions(){
        return transaction;
    }

    public void addTransaction(double amount){
        /**Adds a new transaction to the transactions list.
         * The amount parameter represents the transaction amount.*/
        transaction.add(amount);
    }


    /*Calculates and returns the current balance of the account by summing up all the transactions.*/
    public double getBalance() {
        double balance = 0;
        for (double t : transaction) {
            balance += t;
        }
        return balance;
    }

    public boolean hasAccountHolder(String accountHolder) {
        return accountHolders.contains(accountHolder);
    }


    public static String getBankName() {
        return bankName;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }


}



class Main {
    public static void main(String[] args) {
        List<String> accountHolders1 = new ArrayList<>();
        accountHolders1.add("John Doe");
        accountHolders1.add("Jane Smith");
        Account account1 = new Account("1234567890", accountHolders1);

        List<String> accountHolders2 = new ArrayList<>();
        accountHolders2.add("Alice Johnson");
        accountHolders2.add("Bob Wilson");
        Account account2 = new Account("9876543210", accountHolders2);

        // Perform transactions
        account1.addTransaction(100.0);
        account1.addTransaction(-50.0);

        account2.addTransaction(500.0);
        account2.addTransaction(-200.0);

        // Print account details
        printAccountDetails(account1);
        printAccountDetails(account2);

        // Print bank name and total accounts
        System.out.println("Bank Name: " + Account.getBankName());
        System.out.println("Total Accounts: " + Account.getTotalAccounts());
    }

    public static void printAccountDetails(Account account) {
        System.out.println("Account " + account.getAccountNumber() + " Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holders: " + account.getAccountHolders());
        System.out.println("Transactions: " + account.getTransactions());
        System.out.println("Balance: " + account.getBalance());
        System.out.println();
    }
}
