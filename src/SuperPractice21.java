public class SuperPractice21 {
    public static void main(String[] args) {
        CheckingAcc2 account = new CheckingAcc2(1181234567);
        account.setBalance(1000);
        System.out.println("get balance "+ account.getBalance());
        account.deposit(500);
        System.out.println("account.getBalance() after deposit = " + account.getBalance());
        account.withdraw(250);
        System.out.println("account.getBalance() after withdraw = " + account.getBalance());
        CheckingAcc2 account2=new CheckingAcc2(1500, 1564515);
        System.out.println("account2.getBalance() = " + account2.getBalance());
        System.out.println("account2.getAccountNumber() = " + account2.getAccountNumber());
        System.out.println("account.getAccountNumber() = " + account.getAccountNumber());
    }
}

class BankAcc2 {
    private double balance;
    private final int accountNumber;

    public BankAcc2(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAcc2(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class CheckingAcc2 extends BankAcc2 {

    public CheckingAcc2(int accountNumber) {
        super(accountNumber);
    }

    public CheckingAcc2(double balance, int accountNumber) {
        super(balance, accountNumber);
    }
}
