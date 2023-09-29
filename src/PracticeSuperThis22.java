public class PracticeSuperThis22 {
    public static void main(String[] args) {
        CheckB account=new CheckB(1000,1181234567,20);
        System.out.println("account.getBalance() = " + account.getBalance());
        account.deposit(500);
        System.out.println("account.getBalance() after deposit = " + account.getBalance());
        account.withdraw(250);
        System.out.println("account.getBalance() = after withdraw " + account.getBalance());
        account.applyMonthFee();
        System.out.println("account.getBalance() after mont fee = " + account.getBalance());
        CheckB account2= new CheckB(15000, 117030315, 1000);
        System.out.println("account2.getBalance() = " + account2.getBalance());
        account2.applyMonthFee();
        System.out.println("account.getBalance() = " + account2.getBalance());
    }
}

class BankB {
    private double balance;
    private int accNum;

    public BankB(double balance, int accNum) {
        this.balance = balance;
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }


}

class CheckB extends BankB {
    private double monthFee;

    public CheckB(double balance, int accNum, double monthFee) {
        super(balance, accNum);
        this.monthFee = monthFee;
    }

    public double getApplyMonthFee() {
        return monthFee;
    }

    public void setApplyMonthFee(double monthFee) {
        this.monthFee = monthFee;
    }

    public void applyMonthFee() {
        withdraw(monthFee);
    }
}