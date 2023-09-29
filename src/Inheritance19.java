public class Inheritance19 {
    public static void main(String[] args) {
        CheckingAcc account=new CheckingAcc();
        account.setBalance(1000);
        System.out.println("account.getBalance() = " + account.getBalance());
        System.out.println("account.getAccNum() = " + account.getAccNum());
        account.deposit(500);
        System.out.println("account.getBalance() after deposit = " + account.getBalance());
        account.withdraw(250);
        System.out.println("account.getBalance() after withdraw = " + account.getBalance());
    }
}
class BankAcc{
    private double balance;
    private final int accNum=1181234567;



    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAccNum(){
        return accNum;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}
class CheckingAcc extends BankAcc{

}