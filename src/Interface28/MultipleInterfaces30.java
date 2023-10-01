package Interface28;

public class MultipleInterfaces30 {
    public static void main(String[] args) {
        Product pr = new OnlineProduct();
        Shipping pr2=new OnlineProduct();
        Payment pr3=new OnlineProduct();
        pr.displayInfo();
        OnlineProduct pr4=new OnlineProduct();
        pr4.displayInfo();
    }
}

interface Product {
    void displayInfo();
}

interface Shipping {
    void calculateShipping();
}

interface Payment {
    void processShipping();
}

class OnlineProduct implements Product, Shipping, Payment {
    @Override
    public void displayInfo() {

    }

    @Override
    public void calculateShipping() {

    }

    @Override
    public void processShipping() {

    }
}
