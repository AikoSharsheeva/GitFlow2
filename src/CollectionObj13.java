import java.util.ArrayList;
import java.util.List;

public class CollectionObj13 {
    public static void main(String[] args) {
        List<BankAccount> allAccountList = new ArrayList<>();
        BankAccount obj = new BankAccount("Kicb", 104);
        BankAccount obj2 = new BankAccount("Demir", 105);

        allAccountList.add(obj);
        allAccountList.add(obj2);


        for (BankAccount ba : allAccountList) {
            System.out.println(ba.getBankName());
            System.out.println(ba.getBalance());
        }
        int result=calculateTotalAccounts(allAccountList);
        System.out.println(result);
    }

// Этот статический метод сложил весь баланс с листа
    public static int calculateTotalAccounts(List<BankAccount> ac) {
        int sum = 0;
        for (BankAccount ba : ac) {
            sum += ba.getBalance();
        }
        return sum;
    }
}


class BankAccount {
    private String bankName;
    private int balance;


    public BankAccount(String bankName, int balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setbalance(int balance) {
        this.balance = balance;
    }


}