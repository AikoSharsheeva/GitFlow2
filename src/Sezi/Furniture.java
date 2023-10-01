package Sezi;


/**Description: Create a class called "Furniture" that represents different types of furniture.
 * The class should have two public instance variables and two private instance variables.
 * Your task is to create a constructor to initialize all the variables and
 * create getter methods for the private variables to allow access to their values.

 Class: Furniture

 Instance Variables:

 public String type: Represents the type of furniture (e.g., chair, table).
 public double price: Represents the price of the furniture.
 private String material: Represents the material used to make the furniture.
 private String brand: Represents the brand of the furniture.

 Constructor:

 public Furniture(String type, double price, String material, String brand): Initializes all the instance variables using the provided values.

 Getter Methods:

 public String getMaterial(): Returns the material used to make the furniture.
 public String getBrand(): Returns the brand of the furniture.

 Example usage:

 Furniture chair = new Furniture("Chair", 59.99, "Wood", "ABC Furniture");
 System.out.println(chair.type); // Output: Chair
 System.out.println(chair.price); // Output: 59.99
 System.out.println(chair.getMaterial()); // Output: Wood
 System.out.println(chair.getBrand()); // Output: ABC Furniture*/
public class Furniture {
    public String type;
    public double price;

    private String material;
    private  String brand;


    public Furniture(String type, double price, String material, String brand) {
        this.type = type;
        this.price = price;
        this.material = material;
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public static void main(String[] args) {
        Furniture chair = new Furniture("Chair", 59.99, "Wood", "ABC Furniture");
        System.out.println(chair.type); // Output: Chair
        System.out.println(chair.price); // Output: 59.99
        System.out.println(chair.getMaterial()); // Output: Wood
        System.out.println(chair.getBrand()); // Output: ABC Furniture*/

    }




}
