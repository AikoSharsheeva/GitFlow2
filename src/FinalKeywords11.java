public class FinalKeywords11 {
    public static void main(String[] args) {
Circle c=new Circle(5);
        System.out.println("c.Calculate() = " + c.Calculate());
    }
}
class Circle{
    private final double pi=3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double Calculate(){
        return 2*radius*pi;
    }




}
