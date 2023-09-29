package Sezi.week13;
/**
 * Class: FurnitureStore
 *
 Create a class called FurnitureStore.

 Methods:

 calculateTotalPrice(Sofa[] sofas):
 Accepts an array of Sofa objects as a parameter and calculates the total price of all the sofas in the array.
 Return the total price.

 Class: Sofa
 Create a base class called Sofa.
 Instance Variables:
 type (String): Represents the type of the sofa (e.g., "Sofa Bed", "Sofa Set").
 price (double): Represents the price of the sofa.

 Constructors:
 Sofa(String type, double price): Initializes the type and price variables.

 Methods:
 getType(): Returns the type of the sofa.
 getPrice(): Returns the price of the sofa.

 Class: SofaBed
 Create a class called SofaBed that inherits from Sofa.
 Constructors:
 SofaBed(String type, double price): Initializes the type and price variables using the constructor of the base class.

 Class: SofaSet
 Create a class called SofaSet that inherits from Sofa.
 Constructors:
 SofaSet(String type, double price): Initializes the type and price variables using the constructor of the base class.
 Output:

 Total Sofa Price: $3199.96*/

public class FurnitureTypes {
}


class FurnitureStore{

    double calculateTotalPrice(Sofa[] sofas){
        double totalPrice = 0.0;
        for(Sofa s: sofas){
            totalPrice += s.getPrice();
        }
        return totalPrice;

    }

}

class Sofa{

    String type;
    double price;

    public Sofa(String type, double price) {
        this.type = type;
        this.price = price;
    }

    String getType(){
        return type;
    }

    double getPrice(){
        return price;
    }


    public static void main(String[] args) {
        SofaBed sofaBed1 = new SofaBed("Convertible Sofa Bed", 599.99);
        SofaBed sofaBed2 = new SofaBed("Futon Sofa Bed", 399.99);
        SofaSet sofaSet1 = new SofaSet("Classic Sofa Set", 899.99);
        SofaSet sofaSet2 = new SofaSet("Modern Sofa Set", 1299.99);

        Sofa[] sofas = { sofaBed1, sofaBed2, sofaSet1, sofaSet2 };

        FurnitureStore furnitureStore = new FurnitureStore();
        double totalSofaPrice = furnitureStore.calculateTotalPrice(sofas);
        System.out.println("Total Sofa Price: $" + totalSofaPrice);
    }

}


class SofaBed extends Sofa{

    public SofaBed(String type, double price) {
        super(type, price);
    }
}


class SofaSet extends Sofa{

    public SofaSet(String type, double price) {
        super(type, price);
    }
}
