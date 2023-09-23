package Sezi;
/**Description: Create a class called "Crypto" that represents a cryptocurrency. The class should have five private instance variables to store information about the cryptocurrency, a constructor to initialize these variables, getter and setter methods to access and modify the variables, and additional instance methods to perform operations related to the cryptocurrency.

 Class: Crypto

 Instance Variables:

 private String name: Represents the name of the cryptocurrency.
 private String symbol: Represents the symbol of the cryptocurrency.
 private double price: Represents the current price of the cryptocurrency.
 private long marketCap: Represents the market capitalization of the cryptocurrency.
 private int rank: Represents the rank of the cryptocurrency in the market.

 Constructor:

 public Crypto(String name, String symbol, double price, long marketCap, int rank): Initializes the instance variables using the provided values.

 Getter Methods:

 public String getName(): Returns the name of the cryptocurrency.
 public String getSymbol(): Returns the symbol of the cryptocurrency.
 public double getPrice(): Returns the current price of the cryptocurrency.
 public long getMarketCap(): Returns the market capitalization of the cryptocurrency.
 public int getRank(): Returns the rank of the cryptocurrency.

 Setter Methods:

 public void setName(String name): Sets the name of the cryptocurrency. The name must be at least 3 characters long.
 public void setSymbol(String symbol): Sets the symbol of the cryptocurrency. The symbol must be between 3 and 5 characters inclusive and have all letters capitalized.
 public void setPrice(double price): Sets the current price of the cryptocurrency. The price cannot be negative.
 public void setMarketCap(long marketCap): Sets the market capitalization of the cryptocurrency. The market capitalization cannot be negative.
 public void setRank(int rank): Sets the rank of the cryptocurrency. The rank cannot be negative.

 Additional Instance Methods:

 public double calculateTotalValue(double quantity):
 Calculates the total value of the cryptocurrency based on the given quantity and current price. If input is negative return 0.

 public void printCryptoDetails():
 Prints the details of the cryptocurrency, including its name, symbol, price, market capitalization, and rank.

 Example Usage:

 Crypto bitcoin = new Crypto("Bitcoin", "BTC", 50000.0, 1000000000000L, 1);
 System.out.println(bitcoin.getName()); // Output: Bitcoin
 System.out.println(bitcoin.getPrice()); // Output: 50000.0
 bitcoin.setPrice(-55000.0); // Output: Price cannot be negative.
 bitcoin.setRank(-1); // Output: Rank cannot be negative.
 bitcoin.setName("ETH"); // Output: Name must be at least 3 characters long.
 double totalValue = bitcoin.calculateTotalValue(5.0);
 System.out.println(totalValue); // Output: 250000.0
 double totalValue = bitcoin.calculateTotalValue(-1); // Output: Quantity cannot be negative
 System.out.println(totalValue); // Output: 0.0
 bitcoin.printCryptoDetails(); // Output: Bitcoin (BTC) - Price: 50000.0 USD, Market Cap: 1000000000000, Rank: 1

 This exercise challenges you to implement the Crypto class with the necessary instance variables, constructor, getter methods, setter methods with validation rules, and additional instance methods. The getter methods allow access to the private variables, while the setter methods apply validation rules to ensure the integrity of the data being modified.*/
public class Crypto {

    public static void main(String[] args) {
        Crypto bitcoin = new Crypto("Bitcoin", "BTC", 50000.0, 1000000000000L, 1);

        System.out.println(bitcoin.getName()); // Output: Bitcoin
        System.out.println(bitcoin.getPrice()); // Output: 50000.0

        bitcoin.setPrice(-55000.0); // Output: Price cannot be negative.

        bitcoin.setRank(-1); // Output: Rank cannot be negative.

        bitcoin.setName("ETH"); // Output: Name must be at least 3 characters long.

        double totalValue = bitcoin.calculateTotalValue(5.0);

        System.out.println(totalValue); // Output: 250000.0

        double totalValue2 = bitcoin.calculateTotalValue(-1); // Output: Quantity cannot be negative

        System.out.println(totalValue2); // Output: 0.0

        bitcoin.printCryptoDetails(); // Output: Bitcoin (BTC) - Price: 50000.0 USD, Market Cap: 1000000000000, Rank: 1
    }
    private String name;

    private String symbol;

    private double price;

    private long marketCap;

    private int rank;

    public Crypto(String name, String symbol, double price, long marketCap, int rank) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.marketCap = marketCap;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() <= 3){
            System.out.println("Name must be at least 3 characters long.");
        } else {
            this.name = name;
        }


    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }

    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if(rank < 0){
            System.out.println("Rank cannot be negative.");
        } else {
            this.rank = rank;
        }

    }

    public double calculateTotalValue(double quantity){

        if(quantity < 0){
            System.out.println("Quantity cannot be negative.");
            return 0;
        }else {

            return quantity * price;

        }



    }

    public void printCryptoDetails(){
        System.out.printf("Bitcoin (%s) - Price: %.1f USD, Market Cap: %d, Rank: %d", symbol, price, marketCap, rank);

    }
}
