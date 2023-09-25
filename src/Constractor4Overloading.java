public class Constractor4Overloading {
    String car;
    String model;
    String color;
    double price;
    int year;


    public Constractor4Overloading(String carName, String carModel, String carColor, double carPrice, int carYear){
        car=carName;
        model=carModel;
        color=carColor;
        price=carPrice;
        year=carYear;
    }
    public Constractor4Overloading(String carName,  String carColor){
        car=carName;
        color=carColor;

    }


}
class Car{
    public static void main(String[] args) {
        Constractor4Overloading point=new Constractor4Overloading("lexus", "550","white", 30000.00, 2010);
        System.out.println(point.car + " " + point.model+ " " + point.color+ " " + point.price+ " " + point.year);

        Constractor4Overloading point2=new Constractor4Overloading("BMW", "Blue");
        System.out.println(point2.car + " " + point2.color + " " + point2.model + " " + point2.price);
    }
}
