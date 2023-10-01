public class OverridingPractice24 {
    public static void main(String[] args) {
        AcBank account = new AcBank("11111", 1000);
        System.out.println("account.getBalance() before DEPOSIT = " + account.getBalance());
        account.deposit(200);
        System.out.println("account.getBalance() After DEPOSIT = " + account.getBalance());
        CheckBankAc ac = new CheckBankAc("888", 900, 50);
        System.out.println("ac.getBalance() before monthFee = " + ac.getBalance());
        ac.applyMonthlyFee();
        System.out.println("ac.getBalance() After montFee = " + ac.getBalance());

        System.out.println("=== Method Overrriding===");
        CheckBankAc ac2=new CheckBankAc("555", 5000, 10);
        ac2.withdraw(500);
        System.out.println("ac.getBalance() = " + ac2.getBalance());
        ac2.withdraw(600);
        System.out.println("ac2.getBalance() = " + ac2.getBalance());
        ac2.withdraw(100);
        System.out.println("ac2.getBalance() = " + ac2.getBalance());

    }
}

class AcBank {
    private String acnum;
    private double balance;

    public AcBank(String acnum, double balance) {
        this.acnum = acnum;
        this.balance = balance;
    }

    public String getAcnum() {
        return acnum;
    }

    public void setAcnum(String acnum) {
        this.acnum = acnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

}

class CheckBankAc extends AcBank {
    private double monthFee;
    private double dailyWithdrawAmount;

    public CheckBankAc(String acnum, double balance, double monthFee) {
        super(acnum, balance);
        this.monthFee = monthFee;
    }

    public double getMonthFee() {
        return monthFee;
    }

    public void applyMonthlyFee() {
        withdraw(monthFee);
    }

    @Override
    public void withdraw(double amount) {
        if (dailyWithdrawAmount + amount > 1000) {
            System.out.println("Limittless " + (1000 - dailyWithdrawAmount));
        }else{
            setBalance(getBalance()-amount);
            dailyWithdrawAmount+=amount;
        }
    }
}