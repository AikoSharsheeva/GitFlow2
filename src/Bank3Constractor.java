public class Bank3Constractor {
    public String name2;
    public int accountNumber;
    public long deposit;
    public String password2;

    public Bank3Constractor(String n, int acnum, long d, String p) {
        name2 = n;
        accountNumber=acnum;
        deposit=d;
        password2=p;
    }

    public Bank3Constractor() {

    }
}

class checkingAccountBank {
    public static void main(String[] args) {
        Bank3Constractor obj = new Bank3Constractor();
        obj.name2 = "Dana";
        obj.accountNumber = 123456789;
        obj.deposit = 987654321888888L;
        obj.password2 = "8888";
        System.out.println(obj.name2 + " " + obj.accountNumber + " " + obj.deposit + " " + obj.password2);

        Bank3Constractor obj2 = new Bank3Constractor("Aiko", 5555555, 77777777L, "3333");
        System.out.println("obj2 password = " + obj2.password2 + " obj2.name2 = " + obj2.name2 +" obj2.deposit = "
                + obj2.deposit+" obj2.accountNumber = " + obj2.accountNumber);


    }


}
