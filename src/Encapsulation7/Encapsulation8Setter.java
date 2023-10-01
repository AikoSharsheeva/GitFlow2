package Encapsulation7;

public class Encapsulation8Setter {
    private String name;
    private  String accountname;
    private int balance;

    public Encapsulation8Setter(String name, String accountname, int balance) {
        this.name = name;
        this.accountname = accountname;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class BankAccount2{
    public static void main(String[] args) {
        Encapsulation8Setter acNum=new Encapsulation8Setter("Bill", "nvjdf2564864", 535535345);
        acNum.setName("Steven");
        System.out.println(acNum.getName());
    }

}
