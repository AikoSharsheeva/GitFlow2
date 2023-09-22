package Sezi;

public class Fruit {
    // create your class here
    class Fruit{
        public String name;
        public int quantity;
        public double pricePerFruit;
        public boolean isOrganic;

        public Fruit(String name){
            this.name = name;
        }

        public Fruit(String name, int quantity){
            this.name = name;
            this.quantity = quantity;

        }

        public Fruit(String name, int quantity, double pricePerFruit){
            this.name = name;
            this.quantity = quantity;
            this.pricePerFruit = pricePerFruit;

        }




        public Fruit(String name, int quantity, double pricePerFruit, boolean isOrganic){
            this.name = name;
            this.quantity = quantity;
            this.pricePerFruit = pricePerFruit;
            this.isOrganic = isOrganic;

        }


    }
}
