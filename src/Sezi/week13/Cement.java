package Sezi.week13;

class Cement {
    String productName;
    double price;

    public Cement(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayInfo(){
        System.out.println("Brand: " + productName + "\nPrice per Bag: $ " + price);
    }


    void use(){
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }

}

class ConcreteMix extends Cement{
    private String grade;

    public ConcreteMix(String productName, double price, String grade) {
        super(productName, price);
        this.grade = grade;
    }


    @Override
    void displayInfo(){
        System.out.printf("Brand: %s\nPrice per Bag: $%f\nStrength Grade: %s\n", productName, price, grade);

    }


    void use(){
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }

    public static void main(String[] args) {
        Cement cementBag1 = new Cement("Generic Cement", 7.99);
        ConcreteMix concreteMix1 = new ConcreteMix("StrongMix", 14.99, "Grade A");
        ConcreteMix concreteMix2 = new ConcreteMix("SuperStrength", 19.99, "Grade B");

// Display information using displayInfo() method
        cementBag1.displayInfo();
        concreteMix1.displayInfo();
        concreteMix2.displayInfo();
        cementBag1.use();
        concreteMix1.use();
        concreteMix2.use();
    }
}