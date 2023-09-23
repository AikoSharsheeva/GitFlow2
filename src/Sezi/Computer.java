package Sezi;
/**Description: Create a class called "Computer" that represents different computer systems. The class should have four private instance variables. Your task is to create a constructor to initialize all the variables, getter methods for the private variables.

 Class: Computer

 Instance Variables:

 private String brand: Represents the brand of the computer (e.g., Dell, HP).

 private String model: Represents the model of the computer.

 private int year: Represents the manufacturing year of the computer.

 private double price: Represents the price of the computer.

 Constructor:

 public Computer(String brand, String model, int year, double price): Initializes all the instance variables using the provided values.

 Getter Methods:

 public String getBrand(): Returns the brand of the computer.

 public String getModel(): Returns the model of the computer.

 public int getYear(): Returns the manufacturing year of the computer.

 public double getPrice(): Returns the price of the computer.

 Setter Methods:

 public void setYear(int year): Sets the manufacturing year of the computer.

 public void setPrice(double price): Sets the price of the computer.

 Example usage:

 Computer myComputer = new Computer("Dell", "Inspiron", 2021, 1200.0);

 System.out.println(myComputer.getBrand()); // Output: Dell

 System.out.println(myComputer.getModel()); // Output: Inspiron

 myComputer.setYear(2022); myComputer.setPrice(1400.0);

 System.out.println(myComputer.year); // Output: 2022

 System.out.println(myComputer.price); // Output: 1400.0*/
public class Computer {
    private String brand;

    private String model;

    private int year;

    private double price;

    public Computer(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("Dell", "Inspiron", 2021, 1200.0);

        System.out.println(myComputer.getBrand()); // Output: Dell

        System.out.println(myComputer.getModel()); // Output: Inspiron

        myComputer.setYear(2022); myComputer.setPrice(1400.0);

        System.out.println(myComputer.year); // Output: 2022

        System.out.println(myComputer.price); // Output: 1400.0*/
    }
}
