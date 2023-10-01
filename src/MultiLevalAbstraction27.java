public class MultiLevalAbstraction27 {
    public static void main(String[] args) {
        Books book = new Books("Harry potter", 20, "Joan");
        Electronics phone = new Electronics("Iphone", 999, "Apple");
        book.getProductInfo();
        phone.getProductInfo();
        System.out.println("book.getTypeOfProduct() = " + book.getTypeOfProduct());
        System.out.println("phone.getTypeOfProduct() = " + phone.getTypeOfProduct());

        System.out.println("phone.calculateShippingCost() = " + phone.calculateShippingCost());
        System.out.println("books.calculateShippingCost() = " + book.calculateShippingCost());
    }
}

abstract class ShippingProvider {
    public abstract double calculateShippingCost();
}


abstract class Product extends ShippingProvider {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getTypeOfProduct();

    // concrete method
    public void getProductInfo() {
        System.out.println("Product name: " + name);
        System.out.println("Price: " + price);
    }
}


class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public double calculateShippingCost() {
        return 10;
    }

    public String getTypeOfProduct() {
        return "Electronics";
    }

}


class Books extends Product {
    private String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double calculateShippingCost() {
        return 3;
    }

    @Override
    public String getTypeOfProduct() {
        return "Books";
    }
}