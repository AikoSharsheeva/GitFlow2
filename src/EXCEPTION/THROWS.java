package EXCEPTION;

public class THROWS {
    public static void main(String[] args) {
transfer();
    }
    public static  void withdraw(int amount) throws Exception{
        int balance=100;
        if(amount<balance){
            throw new Exception("Insufficient funds");
        }
    }


    public static void transfer() {
        try {
            withdraw(50);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
