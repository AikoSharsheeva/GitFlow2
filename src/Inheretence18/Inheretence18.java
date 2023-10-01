package Inheretence18;

public class Inheretence18 {
    public static void main(String[] args) {
       CheckingAccount account=new CheckingAccount();
       account.setBalance(1000);
        System.out.println("account.getBalance() = " + account.getBalance());
    }
}
class BankAccount{
    private int balance;


    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
class CheckingAccount extends BankAccount{


}