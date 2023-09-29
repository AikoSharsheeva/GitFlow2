package Sezi;

public class HeadPhone {

        // Static Variables
        private static String manufacturer;
        private static int totalHeadphones;

        // Instance Variables
        private String model;
        private double price;
        private String color;
        private boolean isWireless;

        // Static Methods

        // Get the total count of headphones created
        public static int getTotalHeadphones() {
            return totalHeadphones;
        }

        // Set the manufacturer of the headphones
        public static void setManufacturer(String manufacturer) {
            HeadPhone.manufacturer = manufacturer;
        }

        // Instance Methods

        // Constructor
        public HeadPhone() {
            totalHeadphones++; // Increment total headphones count when a new instance is created
        }

        // Display details of the headphone
        public void displayDetails() {
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
            System.out.println("Color: " + color);
            System.out.println("Wireless: " + (isWireless ? "true" : "false"));
        }

        // Set the model of the headphone
        public void setModel(String model) {
            this.model = model;
        }

        // Set the price of the headphone
        public void setPrice(double price) {
            this.price = price;
        }

        // Set the color of the headphone
        public void setColor(String color) {
            this.color = color;
        }

        // Set the wireless status of the headphone
        public void setWireless(boolean isWireless) {
            this.isWireless = isWireless;
        }

         public static void main(String[] args) {
             // Accessing static variables and methods
             System.out.println("Total headphones created: " + HeadPhone.getTotalHeadphones());
             HeadPhone.setManufacturer("ABC Electronics");

             // Creating instances of the Headphone class
             HeadPhone headphone1 = new HeadPhone();
             headphone1.setModel("Model X");
             headphone1.setPrice(99.99);
             headphone1.setColor("Black");
             headphone1.setWireless(true);

             HeadPhone headphone2 = new HeadPhone();
             headphone2.setModel("Model Y");
             headphone2.setPrice(79.99);
             headphone2.setColor("White");
             headphone2.setWireless(false);

             // Accessing instance methods
             System.out.println("Headphone 1 Details:");
             headphone1.displayDetails();

             System.out.println("Headphone 2 Details:");
             headphone2.displayDetails();

             // Accessing static variables after creating instances
             System.out.println("Total headphones created: " + HeadPhone.getTotalHeadphones());
         }


}
