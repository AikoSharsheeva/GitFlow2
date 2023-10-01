package Sezi.week13;


//PublicSpace interface
interface PublicSpace{
    void visit();
    void relax();
}

//GreenSpace interface

interface GreenSpace{
    void plantTrees();
    void waterPlants();
}


class  Park implements PublicSpace, GreenSpace{
    String name;
    int area;

    public Park(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public void visit(){
        System.out.printf("Visiting %s park\n", name);
    }

    public void relax(){
        System.out.printf("Relaxing in %s park\n", name);
    }


    public void plantTrees(){
        System.out.printf("Planting trees in %s park\n", name);
    }

    public void waterPlants(){
        System.out.printf("Watering plants in %s park\n", name);
    }

    public void showParkDetails() {
        System.out.println("Park Name: " + name);
        System.out.println("Park Area: " + area + " square meters");
    }

    public static void main(String[] args) {
        Park centralPark = new Park("Central Park", 10000);
        centralPark.visit();
        centralPark.relax();
        centralPark.plantTrees();
        centralPark.waterPlants();
        centralPark.showParkDetails();

        Park prospectPark = new Park("Prospect Park", 8000);
        prospectPark.visit();
        prospectPark.relax();
        prospectPark.plantTrees();
        prospectPark.waterPlants();
        prospectPark.showParkDetails();

        Park goldenGatePark = new Park("Golden Gate Park", 12000);
        goldenGatePark.visit();
        goldenGatePark.relax();
        goldenGatePark.plantTrees();
        goldenGatePark.waterPlants();
        goldenGatePark.showParkDetails();
    }

}

