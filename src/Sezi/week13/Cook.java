package Sezi.week13;

class Cook {
    String name;
    int time;

    Cook(String name, int time){
        this.name = name;
        this.time = time;
    }


    void cookFood(){

    }
}

class Chef extends Cook{

    Chef(String name, int time) {
        super(name, time);
    }

    @Override
    void cookFood(){
        System.out.println("Chef's dish: " + name + " Time: " + time);


    }
}

class Baker extends Cook{

    Baker(String name, int time) {
        super(name, time);
    }

    @Override
    void cookFood(){
        System.out.println("Baker's dish: " + name + " Time: " + time);
    }
}

class Mainclass{
    public static void main(String[] args) {
        // Create instances and test cookFood() method
        System.out.println("\nTesting cookFood() method:");
        Cook chef = new Chef("Pasta", 90);
        chef.cookFood(); // Output: Cooking Pasta for 90 minutes.

        Cook baker = new Baker("Cake", 180);
        baker.cookFood(); // Output: Baking Cake for 180 minutes.
 }
}
