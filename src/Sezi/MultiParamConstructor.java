package Sezi;

public class MultiParamConstructor {
    public static void main(String[] args) {
        /**Description: Create a class called "Transaction" that represents a financial transaction.

         The class should have four public instance variables: "transactionId" (String), "senderAccount" (String), "receiverAccount" (String), and "amount" (double).

         Instance Variables:

         transactionId (String): Represents the transaction ID.

         senderAccount (String): Represents the account from which the transaction is made.

         receiverAccount (String): Represents the account to which the transaction is made.

         amount (double): Represents the amount involved in the transaction.

         The class should also have one constructor that takes four params: "id" (String), "sender" (String), "receiver" (String), and "amount2" (double).

         Multi Param Constructor:

         Multi-param constructor should initialize all instance variables with the corresponding constructor parameter value.*/

    }

    class Transaction{
        public String transactionId;
        public String senderAccount;
        public String receiverAccount;
        public double amount;

        public Transaction(String id, String sender, String receiver, double amount2){
            transactionId = id;
            senderAccount = sender;
            receiverAccount = receiver;
            amount = amount2;
        }
    }
}
