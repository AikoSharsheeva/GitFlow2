package Encapsulation7;

public class EncapsulationGetter {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount("Aiko", "88888812", 87878787);
        System.out.println("ac1.name = " + ac1.name);
        System.out.println("ac1.accountNum = " + ac1.accountNum);
        System.out.println("ac1.balance = " + ac1.balance);
    }

    static class BankAccount {
        private String name;
        private String accountNum;
        private int balance;

        public BankAccount(String name, String accountNum, int balance) {
            this.name = name;
            this.accountNum = accountNum;
            this.balance = balance;
        }

        public String getName() {
            return name;
        }
        public String getAccountNum(){
            return accountNum;
        }
        public  int getBalance(){
            return balance;
        }


    }
}
