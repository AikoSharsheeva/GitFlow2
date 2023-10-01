package Sezi.week13;

class Insect {
    String name;
    int lifeSpan;

    public Insect(String bee, int i) {
        this.name = bee;
        this.lifeSpan = i;
    }

    void setName(String name){

    }
    void setLifeSpan(int lifeSpan){

    }

    void displayInfo(){
        System.out.println("This is an insect.");
    }


}


class Bee extends Insect{

    Bee(){
        super("Bee", 35);
    }

    @Override
    void displayInfo(){
        System.out.println(name + " has a lifespan of " + lifeSpan + " days");
    }

}

class Ant extends Insect{

    Ant(){
        super("Ant", 40);
    }
    @Override
    void displayInfo(){
        System.out.println(name + " has a lifespan of " + lifeSpan + " days.");
    }


}


class MainForInsect {
    public static void main(String[] args) {
        Insect insect = new Insect("Ann", 100);
        Bee bee = new Bee();
        Ant ant = new Ant();

        System.out.println("Different Insects:");

        // Using the default displayInfo() method of Insect
        System.out.println("\nInsect:");
        insect.displayInfo();

        // Using the overridden displayInfo() method of Bee
        System.out.println("\nBee:");
        bee.displayInfo();

        // Using the overridden displayInfo() method of Ant
        System.out.println("\nAnt:");
        ant.displayInfo();

        // Additional Test Cases
        System.out.println("\nAdditional Test Cases:");

        Insect customInsect = new Insect("customInsect", 5);
        customInsect.setName("Custom Insect");
        customInsect.setLifeSpan(10);
        System.out.println("Custom Insect:");
        customInsect.displayInfo();

        Bee customBee = new Bee();
        customBee.displayInfo(); // Using overridden method to set Bee's info

        Ant customAnt = new Ant();
        customAnt.setLifeSpan(60);
        customAnt.displayInfo(); // Using overridden method to set Ant's info
    }
}