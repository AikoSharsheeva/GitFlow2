package Sezi;

public class ConstructorOverloading {

    public static void main(String[] args) {
        /** Video - 12.2
         *Constructors are used to initialize an object and initialize the instance variables (characteristics)
         * In Java, a constructor is a special type of method that is used to initialize objects of a class.
         * Constructors have the same name as the class and do not have a return type, not even void. They are called automatically when an object of the class is created using the new keyword.
         * Constructors are primarily used to set the initial state of an object by initializing its instance variables.
         * there are two main types of constructors in java
         *
         * 1. default constructor
         * 2.parameterized constructor
         * 3.copy constructor
         *
         */


//        Task 1 - 12.2.1 Product with several constructors
        /**
         * Description: Implement a class called Product with several overloaded constructors.
         * The constructors should allow the creation of a Product object with different sets of information, providing flexibility in initializing the object.
         * Default Constructor: Create a constructor that takes no arguments and initializes the Product object with default values and "name" to "Unknown".
         *
         * Constructor with Name and Price: Create a constructor that takes a String name and a double price as arguments and initializes the Product object with the provided name and price.
         *
         * Constructor with Name, Price, and Quantity: Create a constructor that takes a String name, a double price, and an int quantity as arguments and initializes the Product object with the provided name, price, and quantity.
         *
         * Your task is to implement the Product class with the above constructors and appropriate instance variables for storing the name, price, and quantity of a product.
         *
         *
         * Note: order of constructors should be kept as above.
         *
         * Example usage:
         *
         * Product product1 = new Product(); // Default constructor
         *
         * Product product2 = new Product("iPhone", 999.99); // Constructor with name and price
         *
         * Product product3 = new Product("Headphones", 49.99, 10); // Constructor with name, price, and quantity

         * */







    }


}
class Product{
    public String name;
    public double price;
    public int quantity;

    public Product( ){
        name = "Unknown";


    }

    public Product(String productName, double productPrice){
        name = productName;
        price = productPrice;

    }

    public Product(String productName, double productPrice, int productQuantity){
        name = productName;
        price = productPrice;
        quantity = productQuantity;

    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("iPhone", 999.99);
        Product product3 = new Product("Headphones", 49.99, 10);
        //sout

    }
}