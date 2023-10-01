package ConstractorChanning;

public class StudentList6 {
    public static void main(String[] args) {
        // this keyword
        //this() keyword also помогает получить доступ и использовать цепочку констуктора из другого констуктора
        AccountStudent check = new AccountStudent("Aiko", "8888888");
        System.out.println(check.name);
        System.out.println("check.accountNumber = " + check.accountNumber);
        System.out.println("check.balance = " + check.balance);
    }

    static class AccountStudent {
        public String name;
        public String accountNumber;
        public int balance;

        public AccountStudent(String name, String accountNumber, int balance) {
            this.name=name;
            this.accountNumber=accountNumber;
            this.balance=balance;
        }
        public AccountStudent(String name, String accountNumber) {
            this(name, accountNumber, 188888);
        }
    }
}
