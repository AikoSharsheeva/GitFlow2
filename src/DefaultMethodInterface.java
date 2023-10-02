public class DefaultMethodInterface {
    public static void main(String[] args) {
        BankTransaction tran=new WithdrawTransaction();
        BankTransaction tran2=new DepositTransaction();
        tran.execute();
        tran.logTransaction();

        tran2.execute();
        tran2.logTransaction();
    }
}
interface BankTransaction{
    void execute();

    default void logTransaction(){
        System.out.println("Loggin transaction ...");
    }
}
class WithdrawTransaction implements  BankTransaction{
    @Override
    public void execute() {
        System.out.println("Performing withdraw Transaction");
    }
}
class DepositTransaction implements BankTransaction{
    @Override
    public  void  execute(){
        System.out.println("Deposit Transaction Performing");
    }

    @Override
    public void logTransaction() {

    }
}