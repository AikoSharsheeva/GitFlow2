public class BankOOPConstactor2 {
    public String name;
    public String accountnum;
    public int accountpassword;

    // Constractor дожен называться как класс, обязательно паблик но без переменных!
    public BankOOPConstactor2(){
        System.out.println("This is Constractor!");
    }
}


class account{
    public static void main(String[] args) {
        BankOOPConstactor2 check=new BankOOPConstactor2();
    }
}
