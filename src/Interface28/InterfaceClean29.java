package Interface28;

public class InterfaceClean29 {
    public static void main(String[] args) {
        Cleanable dish = new Dish("ceramic");
        dish.clean();

        System.out.println(); // Separate dish and floor cleaning

        // Create a Floor object and clean it
        Cleanable floor = new Floor(50.5); // Specify the floor area in square meters
        floor.clean();
    }
}

// Define the Cleanable interface
interface Cleanable {
    void clean();
}

// Create the Dish class that implements the Cleanable interface
class Dish implements Cleanable {
    private String material;

    // Constructor for Dish
    public Dish(String material) {
        this.material = material;
    }

    // Simulate scrubbing the dish
    public void scrub() {
        System.out.println("Scrubbing the dish made of " + material);
    }

    // Simulate rinsing the dish
    public void rinse() {
        System.out.println("Rinsing the dish");
    }

    // Simulate drying the dish
    public void dry() {
        System.out.println("Drying the dish");
    }

    // Implement the clean() method from the Cleanable interface
    @Override
    public void clean() {
        scrub();
        rinse();
        dry();
        System.out.println("The dish is now clean!");
    }
}

// Create the Floor class that implements the Cleanable interface
class Floor implements Cleanable {
    private double area;

    // Constructor for Floor
    public Floor(double area) {
        this.area = area;
    }

    // Simulate sweeping the floor
    public void sweep() {
        System.out.println("Sweeping the floor (Area: " + area + " square meters)");
    }

    // Simulate mopping the floor
    public void mop() {
        System.out.println("Mopping the floor (Area: " + area + " square meters)");
    }

    // Simulate drying the floor
    public void dry() {
        System.out.println("Drying the floor (Area: " + area + " square meters)");
    }

    // Implement the clean() method from the Cleanable interface
    @Override
    public void clean() {
        sweep();
        mop();
        dry();
        System.out.println("The floor is now clean!");
    }
}



