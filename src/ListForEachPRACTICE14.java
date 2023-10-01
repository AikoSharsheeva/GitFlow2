import java.util.ArrayList;
import java.util.List;

public class ListForEachPRACTICE14 {
    public static void main(String[] args) {

        List<BankKg> allCollections = new ArrayList<>();
        BankKg ba = new BankKg("Kicb", 100);
        BankKg ba2 = new BankKg("Demir", 200);

        allCollections.add(ba);
        allCollections.add(ba2);

        for (BankKg obj : allCollections) {
            System.out.println("obj.getNameofBank() = " + obj.getNameofBank());
            System.out.println("obj.getBalance() = " + obj.getBalance());
        }
        int result = total(allCollections);
        System.out.println("All balance sum is " + result);
    }

    public static int total(List<BankKg> li) {
        int sum = 0;
        for (BankKg obj : li) {
            sum += obj.getBalance();
        }
        return sum;
    }
}

class BankKg {
    private String nameofBank;
    private int balance;

    //Constactor
    public BankKg(String nameofBank, int balance) {
        this.nameofBank = nameofBank;
        this.balance = balance;
    }

    //Getter and Setter
    public String getNameofBank() {
        return nameofBank;
    }

    public void setNameofBank(String nameofBank) {
        this.nameofBank = nameofBank;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}